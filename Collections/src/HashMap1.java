import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<String, String> capitais = new HashMap<String,String>();

		capitais.put("Piau�","Teresina");
		capitais.put("Cear�","Fortaleza");
		capitais.put("Pernambuco","Recife");
		capitais.put("Paran�","Curitiba");
		capitais.put("Roraima","Boa Vista");
		capitais.put("Rio Grande do Norte","Natal");

		for (String i : capitais.keySet()) {
			System.out.println("Estado: " + i + ", Capital: " + capitais.get(i));
		}

//		System.out.println(capitais.get("Piau�"));
	}

}
