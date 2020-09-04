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
		//		times.set(3, "Flamengo");
		System.out.println(times);
		
		Iterator<String> it = times.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//		Collections.sort(times);
		//		System.out.println(times);

	}

}
