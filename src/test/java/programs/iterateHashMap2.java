package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iterateHashMap2 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		char c = 'a';
		for (int i = (int) 'a'; i <= (int) 'z'; ++i) {
			hm.put("" + c++, i);
		}

		System.out.print(hm);

		System.out.println();

		for (Map.Entry mde : hm.entrySet()) {
			System.out.println(mde.getKey() + "->" + mde.getValue());
		}

		
		System.out.println("---------\n");
		Iterator itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry mde = (Map.Entry) itr.next();
			System.out.println(mde.getKey() + "->" + mde.getValue());
		}

	}

}
