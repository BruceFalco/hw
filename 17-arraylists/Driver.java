import java.util.*;


public class Driver {

    public static void main(String[] args) {
	//first, for arraylists
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
	
	//------
	//now for arrays
	int[] rent = new int[10];
	System.out.println(rent);
	for (int i = 0; i < rent.length; i++) {
	    rent[i] = i;
	}
	System.out.println(Arrays.toString(rent));

	int[] grease = new int[rent.length];
	for (int i = 0; i < rent.length; i++) {
	    int h = 0;
	    while (grease[h] != 0) {
		h = r.nextInt(rent.length);
	    }
	    grease[h] = rent[i];
	}
	rent = grease;
	
	System.out.println(Arrays.toString(rent));
	    
	
    }
}
