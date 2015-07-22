package api;

public class CustomClass {

	public static void main(String[] args) {
		CustomClass1 c1 = new CustomClass1();
		c1.run();
		c1.run();
		
	}
	
	
	
	

}


 class CustomClass1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Running ..");
		
	}
	
	

}
