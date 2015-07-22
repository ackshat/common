import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;


public class TestObject {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		/*Class<?> clazz = Class.forName("User");
		Constructor<?> constr = clazz.getConstructor(String.class);
		User ob = (User) constr.newInstance(new Object[] {"aaa"} );
		User ob2 = (User) clazz.newInstance();
		System.out.println(ob.getName());*/
		//System.out.println(ob2.getName());
		
		Method[] methods = Object.class.getMethods();
		for(Method m : methods){
			System.out.println(m.getName());
		}
		
		
		Collection col = Collections.emptySortedSet();
	}
	

}
