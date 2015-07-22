import java.util.LinkedHashMap;
import java.util.Map;


public class TestStringToObject {

	
	public static void main(String[] args) {
		Map<String,String> ob = new LinkedHashMap<String,String>();
		/*ob.put("key0", "value0");*/
		ob.put("test", "TEst0");
		ob.put("key1", "value1");
		ob.put("key2", "value2");
		ob.put("key3", "value3");
		Map<String,Object> mapOb = new LinkedHashMap<String,Object>(ob);
		
		System.out.println(mapOb);
	}
}
