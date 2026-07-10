package collection;

public class LinkedHashSet {

	public static void main(String[] args) {
	java.util.LinkedHashSet<String> set = new java.util.LinkedHashSet<String>();
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
	 * 3) maintained the insertion order
	 */

	}

}
