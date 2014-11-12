import java.util.*;

public class Driver{
    public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String> ();
	System.out.println(al);
	al.add("Hello");

	System.out.println(al);
	
	al.add("world");
	System.out.println(al);

	al.add("33.2");
	System.out.println(al);

	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i <20; i++) {
	    ai.add(r.nextInt(5));
	}
	System.out.println(ai);

	
	for (int i = 0; i<ai.length; i++) {
	    if (i == i-1) {
		ai.remove(i);
	    }
	}

    }
}
