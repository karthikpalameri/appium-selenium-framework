package programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(1);

		intList.add(2);
		intList.add(2);
		intList.add(2);

		intList.add(3);
		intList.add(3);
		intList.add(3);
		intList.add(3);

		System.out.println("Duplicated list data -> " + intList);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.addAll(intList);// Adding all the list items to the linkedhashset so the positioning is
							// preserved

		intList.clear();

		intList.addAll(lhs);

		System.out.println("Non Duplicated list data -> " + intList);

	}

}
