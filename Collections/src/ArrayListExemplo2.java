import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExemplo2 {

	public static void main(String[] args) {
		
		List<String> times = new ArrayList<String>();
		
		times.add("Sport");
		times.add("Fluminense");
		times.add("Palmeiras");
		times.add("Framengo");
		times.add("Vasco");
		
		
		System.out.println(times);
		times.set(3, "Flamengo");
		System.out.println(times);
		
//		for (int i = 0; i < times.size(); i++) {
//			System.out.println(times.get(i));
//		}
		
//		for(String time: times) {
//			System.out.println(time);
//		}
		
		Collections.sort(times);
		System.out.println(times);
		
	}
	
}
