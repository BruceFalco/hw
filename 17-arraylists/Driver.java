import java.util.*;

public class Driver {

    public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer> ();

	System.out.println(al);
	for (int i = 0; i<10; i++) {
	    al.add(i);
	}
	System.out.println(al);

	Random r = new Random();

	ArrayList<Integer> ai = new ArrayList<Integer> ();

	while (! al.isEmpty()) {
	    int oldn = r.nextInt(al.size());
	    ai.add(al.get(oldn));
	    al.remove(al.get(oldn));
	}

	System.out.println(ai);
	     

    }
}
