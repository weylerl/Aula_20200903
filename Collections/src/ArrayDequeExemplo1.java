import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArrayDequeExemplo1 {

	public static void main(String[] args) {

		Queue<String> times = new ArrayDeque<String>();

		times.add("Sport");
		times.add("Fluminense");
		times.add("Palmeiras");
		times.add("Flamengo");
		
		
		System.out.println(times);
		
		((ArrayDeque<String>) times).addFirst("Vasco");
		
		System.out.println(times);

        System.out.println("Elemento do topo : " + times.poll()); //retira o elemento do topo

		System.out.println("Elemento do topo : " + times.peek()); 

		System.out.println(times);
		
	}

}
