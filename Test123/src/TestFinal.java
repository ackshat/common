
public class TestFinal {

	
	private  String a = "";

	public String getA() {
		return a;
	}
	
	public void setA(final String a){
		this.a = a;
	}
	
	public static void main(String[] args) {
		boolean b = (Boolean) getBooleanFlag(1); 
		System.out.println(b);
	}

	private static Boolean getBooleanFlag(int i) {
		Boolean b = null;
		if(null==b){
			b = false;
			if(i>0){
				b=true ;
			}
		}
		return b;
	}
}


