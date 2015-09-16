import java.util.HashMap;


public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int common = 0;
		for(String key1 : hashmap1.keySet()){
			for(String key2 : hashmap2.keySet()){
				if(key1.equals(key2)){
					if(hashmap1.get(key1).equals(hashmap2.get(key2)))
						common++;
				}
			}
		}
		
		return common;
	}

}
