import java.util.HashSet;
import java.util.HashMap;

public class Main{
	/**
	*hashset: Set has no duplicates
    *hashmap: Stores key-value pairs
	*/
	public static void main(String[] args)
	{
		HashSet<Integer> phones = new HashSet<Integer>();
		phones.add(45566);
		phones.add(45566);
		phones.add(55566);
		System.out.println(phones);

		HashMap<String, Integer> directory = new HashMap<String,Integer>();
		directory.put("v51gtm",3456);
		directory.put("larry",3456);
		directory.put("queen",3456);
		System.out.println(directory);
		System.out.println(directory.get("larry"));

		HashMap<String, HashSet<String>> people = new HashMap<String, HashSet<String>>();
		HashSet<String> friends = new HashSet<String>();
		friends.add("Tom");
		friends.add("Jerry");
		people.put("Alice",friends);
		HashSet<String> tm = new HashSet<String>();
		tm.add("Tom1");
		tm.add("Jerry2");
		people.put("Layton",tm);
		System.out.println(people);
 	}
}