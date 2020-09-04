import java.util.ArrayList;
import java.util.List;

public class ArrayListExemplo1 {

	public static void main(String[] args) {
		
		List<String> alist = new ArrayList<String>();
		
		alist.add("Primeiro elemento");
		alist.add("Segundo elemento");
		
		System.out.println(alist.size());
		System.out.println(alist.isEmpty());
		System.out.println(alist.contains("Primeiro elemento"));
		
		//alist.remove("Primeiro elemento");
		//alist.remove(0);
		//alist.clear();
		//System.out.println(alist.size());
		
	}
	
}
