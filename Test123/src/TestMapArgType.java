import java.util.HashMap;
import java.util.Map;


public class TestMapArgType {

	
	public static void main(String[] args) {
		Map<String,String> mapSS = new HashMap<String,String>();
		
		mapSS.put("key2", "value2");
		mapSS.put("key1", "value1");
		mapSS.put("key0", "value0");
		mapSS.put("key3", "value3");
		System.out.println(mapSS.toString());
		
		Map<String,Object> mapSO = new HashMap<String,Object>(mapSS);
		System.out.println(mapSO.toString());
		
	}
}
