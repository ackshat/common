
public class ClassInInterfaceImpl implements ClassInInterface {

	@Override
	public void sayHello() {
		super.notify();
		
		
	}

	
	public static void main(String[] args) {
		ClassInInterface cl = new ClassInInterfaceImpl();
	}
}
