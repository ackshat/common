
public class InnerPrivateClass {

	private static class MyThread extends Thread{
		public MyThread(String name){
			super(name);
		}
		
		@Override
		public void run(){
			System.out.println(Thread.currentThread().getName());
		}

		public void stopThread() {
			// TODO Auto-generated method stub
		}
	}
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread");
		myThread.start();
		
		myThread.stopThread();
	}
}
