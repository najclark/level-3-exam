import java.util.ArrayList;
import java.util.HashMap;


public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("pope francis", 0);
		people.put("edward snowden", 0);

		for(String s : votes){
			s = s.toLowerCase();
			people.put(s, people.get(s) + 1);
		}
		
		int largest = 0;
		String key = "";
		for(String p : people.keySet()){
			if(people.get(p) > largest){
				key = p;
				largest = people.get(p);
			}
			else if (people.get(p) == largest)
				key = "TIE";
		}
		
		return key;
	}

}
