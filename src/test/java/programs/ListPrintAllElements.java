package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrintAllElements {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		for (char i = 'A'; i <= 'Z'; i++) {
			l.add(String.valueOf(i));

		}
		System.out.println(l);
		System.out.println("***Printing Using Iterator***");

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

		System.out.println("\n***Printing Using Advanced ForEach***");
		for (Object str : l) {
			System.out.print(str);
		}

		System.out.println("\n***Printing Using simple For-Loop***");
		for (int i = 0; i < l.size() ; i++) {
			System.out.print(l.get(i));
		}

	}

}
