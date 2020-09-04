import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExemplo1 {

	public static void main(String[] args) {

		List<String> times = new LinkedList<String>();

		times.add("Sport");
		times.add("Fluminense");
		times.add("Palmeiras");
		times.add("Framengo");
		
		
		System.out.println(times);
		times.set(3, "Flamengo");
		System.out.println(times);
		
		((LinkedList<String>) times).addFirst("Vasco");
		
		System.out.println(times);
		
				
		for (int i = 0; i < times.size(); i++) {
			System.out.println(times.get(i));
		}
		
		Collections.sort(times);
		System.out.println(times);
		
	}

}
