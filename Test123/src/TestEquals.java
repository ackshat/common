
public class TestEquals {

	public static void main(String[] args) {
		User a = new User("A", "21");
		User b = new User("A", "21");
		
		System.out.println(a.equals(b)+"    "+ (a==b) );
		System.out.println(a.hashCode() + "   " +b.hashCode());
		
		StringBuffer sbuf = new StringBuffer("t1");
		StringBuilder sbui = new StringBuilder("t1");
	}
}
