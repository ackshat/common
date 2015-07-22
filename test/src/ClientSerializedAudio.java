import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JButton;


public class ClientSerializedAudio extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton startButton, stopButton;
	CaptureSerializedGUI cap;
	String name,to,from;
	public void init()
	{	name=getParameter("to")+"_"+getParameter("from")+"_"+getParameter("date")+"_"+getParameter("time");
		//name="abcd";
		startButton = new JButton("start");
		add(startButton);
		startButton.setVisible(true);
		stopButton =new JButton("stop");
		add(stopButton);
		stopButton.setVisible(true);
		
		
		cap=new CaptureSerializedGUI(name);
	}
	public void start()
	{
		startButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event)
				{
					
					try{
						startButton.setVisible(false);
						stopButton.setVisible(true);
						cap.start();
					}catch(Exception e)
					{       System.out.println("exception in applet :" +e);
						cap.stop();}
					
				}
		} );
		stopButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{ 
				try{
				cap.stop();
				stop();
				
				}catch(Exception e){cap.stop();stop();destroy();}
				finally{destroy();}
			}
		});
	}
	public void stop()
	{
		   cap.line.stop();
		   cap.line.close();
		   cap.thread=null;
		   System.out.println("stoped button invisible");
		  this.setVisible(false);
		   
		   
	}
	public void destroy()
	{
		   cap.line.stop();
		   cap.line.close();
		   cap.thread=null;
		   
	}
	
	
}


class CaptureSerializedGUI   implements Runnable{

	  String errStr;
	  String fileName,format;;
	  double duration, seconds;
	  File audioFile;
	  TargetDataLine line;
	  Thread thread;
	  AudioInputStream audioInputStream;
	  private Socket sock;
	  
	  public CaptureSerializedGUI(String name)
	  {
		  fileName=name;
	  }
	   
	   private AudioFormat getAudioFormat()
	{
	    float sampleRate = 44100;
	    //8000.0F,11025,16000,22050,44100
	    int sampleSizeInBits = 16;
	    //8,16
	    int channels = 1;
	    //1,2
	    boolean signed = true;
	    //true,false
	    boolean bigEndian = false;
	    //true,false
	    return new AudioFormat(sampleRate,
	                           sampleSizeInBits,
	                           channels,
	                           signed,
	                           bigEndian);
	  }//end getAudioFormat
	    public void start(){
	    errStr=null;
	    thread=new Thread(this); 
	    thread.setName("capture");
	    System.out.println("capturing priority is "+thread.getPriority());  
	    thread.start();  
	   }

	   public void stop(){
	   line.stop();
	   line.close();
	   thread=null;
	   try{
	   sock.close();
	   }catch(Exception e){}
	   }

	   public void run(){
	   
	 
	   duration=0;
	   audioInputStream=null;
	   AudioFileFormat.Type fileType = AudioFileFormat.Type.AU;
	   AudioFormat format=getAudioFormat();
	         
	   DataLine.Info info=new DataLine.Info(TargetDataLine.class,format);
	   try{
	     line=(TargetDataLine)AudioSystem.getLine(info);
	     line.open(format,line.getBufferSize());
	     }
	    
	     catch(Exception e){System.out.println("interrupted");
	                        line.stop();
	                        line.close();
	                        this.thread=null;
	}
	     

	            try{

	            	  sock=new Socket("127.0.0.1",5000);
	            	  OutputStream out= sock.getOutputStream();
	            	  
	            	  
	            	  sendName(out);
	            	  InputStream in=sock.getInputStream();
	            	  System.out.println("after sending name");
	            	  String m=getPermission(in);
	            	  System.out.println(m+"::"+fileName);
	            	  line.start();
	            	
	            	  AudioSystem.write(new AudioInputStream(line), fileType,out);
	            	  
	             
	              }
	           catch (Exception e){
	        	   System.out.println("error after write to ouputStream out");
	               e.printStackTrace();}
	  
	        
	           
	    }

	private String getPermission(InputStream in)throws Exception {
		InputStreamReader isReader=new InputStreamReader(in);
	     BufferedReader reader=new BufferedReader(isReader);
	     String msg=reader.readLine();
	     System.out.println("got the permission");
	     return msg;
		
	}

	private void sendName(OutputStream out) throws Exception {
		PrintWriter writer=new PrintWriter(out);
		 try{
		     
		     writer.println(fileName);
		     writer.flush();
		     }catch(Exception e){e.printStackTrace();}
		  
	}

	}