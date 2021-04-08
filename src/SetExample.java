import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		set.add("New York");
		set.add("Washington");
		set.add("Hawai");
		set.add("Ohio");
		set.add("Texas");
		set.add(null);
		set.add("");
		System.out.println("Try to add the same element twice. Note: It will return a boolean as false");
		System.out.println(set.add("Texas"));
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
