
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;


public class SerializedAudioServer {
	
	ServerSocket socket;
	InetAddress inetaddress;
	SocketChannel channel;
	AudioInputStream audioInputStream,audioData;
	ObjectInputStream objectInputStream;
	AudioFormat format=getAudioFormat();
	final int bufSize = 16384;
	
	  String errStr;
	  String fileName="def";
	  double duration, seconds;
	
	
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
	
	public static void main(String[] args){
		SerializedAudioServer server=new SerializedAudioServer();
		try
		{
			server.startServer();
		}catch(Exception e)
				{
				System.out.println("server problem occured in main");		
				server.startServer();
				}
	}
	
	
	public void startServer()
	{
		try{
		    ServerSocket serversock=new ServerSocket(5000);
		    while(true)
		     {
		      Socket clientSocket=serversock.accept();
		      InputStream stream=(InputStream)clientSocket.getInputStream();
		      OutputStream out=clientSocket.getOutputStream();
		      System.out.println("got a connection");
		      if(readName(stream)!=null)
		      sendAck(out);
		     
		      InputStream bufferedIn = new BufferedInputStream(stream);
		      clientSocket.getInputStream();
	              audioInputStream = AudioSystem.getAudioInputStream(bufferedIn);
			
	              AudioFormat format=audioInputStream.getFormat();
	              System.out.println("format is "+format);
	              //System.out.println("long is "+milliseconds);
	              audioData = new AudioInputStream(audioInputStream,format,audioInputStream.getFrameLength() );
	     
		      
		     writeAudioFile(fileName);
		     stream.close();
			}      
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Exception in start server::"+e);
		    	
		    }
	}
	
	private String readName(InputStream stream)throws Exception
	{   
	      InputStreamReader is = new InputStreamReader(stream);
	      BufferedReader br = new BufferedReader(is);
	      String name = br.readLine();
	      
	      
	      System.out.println(name);
	         
	      fileName=name;
	      return name;
	}
	private void sendAck(OutputStream out)

	{            
                  try{  System.out.println("sending ack");
		     PrintWriter writer=new PrintWriter(out);
		     writer.println("ok");
		     writer.flush();
		     }catch(Exception e){System.out.println("exception in sendAck " +e);}
	}
	public void writeAudioFile(String name)
	{  
		try
		{
		File audioFile=new File(name);
		System.out.println("before type");
		AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
		System.out.println("befor write");
		AudioSystem.write(audioData, fileType, audioFile);
		System.out.println("after write");
		convertFile(name);
		}
	catch(Exception e){System.out.println("Exception in writeAudioFile::"+e);startServer();}
	}
	
	private void convertFile(String fName)
	{
		
	/*	
		
		try
		{
		ConvertTest.convert(fName);
		
		}
		catch(Exception e)
		{
		System.out.println(e);
		
		}*/
		}
		
	}
	  


