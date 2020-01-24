package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();

		for (int i = 0; i <=10; i++) {
			l1.add(i);
		}

		for (int i = 5; i <=10; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.addAll(l1);
		System.out.println(s1);

//		removeDuplicateElementsFromArray();

	}

	public static void removeDuplicateElementsFromArray() {

	}

}
