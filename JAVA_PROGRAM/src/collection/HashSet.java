package collection;

public class HashSet {

	public static void main(String[] args) {
		
		java.util.HashSet<String> set = new java.util.HashSet<String>();
		set.add("Apple");
		set.add("Apple");
		set.add("kiwi");
		set.add("Banana");
		set.add("");
		set.add("");

		System.out.println(set);
		
		/*
		 * 1) Duplicate not allow
		 * 2) 1 null allow
		 * 3) not maintained the insertion order
		 */

	}

}
