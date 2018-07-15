package week2day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {

		String Company ="Cognizant";
		Company =Company.toLowerCase();
		System.out.println(Company);

		char[] charArray=Company.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

		for (char eachChar : charArray) {
			System.out.println(eachChar);
			if(map.containsKey(eachChar)) {
				map.put(eachChar, map.get(eachChar)+1);
			}else {
				map.put(eachChar, 1);
			}

		}
		System.out.println(map);
		int size = map.size();
		//     size.
	}
	
	

}
