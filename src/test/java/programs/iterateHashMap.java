package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * hm.entrySet() returns Set value like [k=v ,k2=v2] instead of {k=v ,k2=v3} so
 * that iterator can iterate over the set
 * 
 * Iterator itr = hm.entrySet().iterator(); just add this in the middle to
 * iterate
 * 
 * Map.entry mde=itr.next(); Take the key=value and put it in
 *
 */
public class iterateHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		char c = 'a';
		for (int i = 0; i < 5; i++) {
			hm.put(String.valueOf(c++), i);

		}
		System.out.println(hm);

		Iterator itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry mde = (Entry) itr.next();
			System.out.println(mde.getKey() + "->" + mde.getValue());
//			System.out.println(itr.next());
		}

		System.out.println("****");

		for (Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + "->" + me.getValue());
		}

	}
}
