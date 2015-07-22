package com.alok.test;


public  class AnonymousDemo {

	private String name = "Annonymous Demo";
	
	public  void sayHello(){}
	
	public static void main(String[] args) {
		
		int i=10;
		String j = "J";
		
		AnonymousTest aT =  new AnonymousTest() {
			
			private String name = "Annonymous Test";
			
			@Override
			public void setName() {
				name = "annonymous" + j; 
				
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return name;
			}
		};
		
		testAnonymous(aT);
		
		AnonymousDemo ad = new AnonymousDemo(){
			public void sayHello(){
				
				System.out.println("Hello from Annonymous class "
						+ "instance inside Class" + this.getClass());
			}
		};
		
		AnonymousDemo ad2 = new AnonymousDemo(){
			public void sayHello(){
				
				System.out.println("Hello from Annonymous class 2 "
						+ "instance inside Class" + this.getClass());
			}
		};
	
		ad.sayHello();
		
		ad2.sayHello();
	}
	
	
	public static void testAnonymous(AnonymousTest aT){
		System.out.println("testAnnonymous ----> "+aT.getName());
	}
}
	
