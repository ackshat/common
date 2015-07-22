
public interface ClassInInterface {

	public Test test = new Test();
	
	abstract class ClassIn{
		private String Fname;
		private String Lname;
		private int age;
		
		public String getFname() {
			return Fname;
		}
		public void setFname(String fname) {
			Fname = fname;
		}
		public String getLname() {
			return Lname;
		}
		public void setLname(String lname) {
			Lname = lname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
	}
	
	public void sayHello();
	
	class Test implements ClassInInterface{

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("Hello ... in Test<-- ClassInterface");
		}
		
	}
}
