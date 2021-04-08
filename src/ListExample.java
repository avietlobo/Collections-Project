import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("New York");
		list.add("Washington");
		list.add("Hawai");
		list.add("Ohio");
		list.add("Texas");
		
		list.forEach(System.out::println);
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> linkedList=Arrays.asList("Delhi","Hyderabad","Pune","Chennai");
		linkedList.forEach(System.out::println);
		Iterator<String> itr2= linkedList.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		

	}

}
