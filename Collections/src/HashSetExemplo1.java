import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetExemplo1 {

	public static void main(String[] args) {

		Set<String> times = new HashSet<String>();

		times.add("Sport");
		times.add("Fluminense");
		times.add("Palmeiras");
		times.add("Framengo");


		System.out.println(times);
		times.remove("Framengo");
		times.add("Flamengo");
		System.out.println(times);
		
//		for (String time: times) {
//			System.out.println(time);
//		}
		
		Iterator<String> it = times.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
