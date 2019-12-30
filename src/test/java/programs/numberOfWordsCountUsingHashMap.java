package programs;

import java.util.HashMap;

public class numberOfWordsCountUsingHashMap {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Herei ji ji geerlaer Hello World World");
		HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
		String myStr = sb.toString();

		String[] myStrArr = myStr.split(" ");
		for (int i = 0; i < myStrArr.length ; i++) {
			if (myHashMap.containsKey(myStrArr[i])) {
				int occurences = myHashMap.get(myStrArr[i]);
				myHashMap.put(myStrArr[i], occurences++);

			} else {
				myHashMap.put(myStrArr[i], 1);
			}
		}

		System.out.println(myHashMap);

	}

}
