import java.util.*;

public class Searching {

    String[] a;

    public Searching() {
	a = new String[20];
    }

    public Searching(int b) {
	a = new String[b];
    }

    public void additem(String h, int i) {
	if (i < a.length) {
	    a[i] = h;
	}
    }

    //    public int compareTo(

    public String toString() {
	String rtn = "{";
	for (int i = 0; i < a.length; i++) {
	    rtn = rtn + a[i];
	    rtn = rtn + ", ";
	}
	rtn = rtn + "}";
	return rtn;
    }

    public void sort() {
	Arrays.sort(a);
    }

    public String lsearch(String it) {
	for (int x = 0; x < a.length; x++) {
	    if (a[x].equals(it)) {
		return it;
	    }  
	}
	return null;
    }

    public String bsearch(String it) {
	int med = a.length/2;
	if (a[med].equals(it)) {
	    return it;
	} else if (a[med].compareTo(it) > 0) {
	    while (med > 0) {
		if (a[med].equals(it)) {
		    return it;
		}
		med-- ;
	    }
	} else {
	    while (med < a.length) {
		if (a[med].equals(it)) {
		    return it;
		}
		med++;
	    }
	}
	return null;
    }

    public String rbsearch(String it) {
	int h,l;
	h = a.length-1;
	l = 0;
	int med = a.length/2;
	for (; h-l > 1; med = (h-l)/2 +l ) {
	    if (a[med].equals(it)) {
		return it;
	    } else if (a[med].compareTo(it) > 0) {
		h = med;
	    } else {
		l = med;
	    }
	    //	    med = (h-l)/2 + l;
	}
	if (a[med].equals(it)) {
	    return it;
	} else {
	    return null;
	}
    }

    public static void main(String[] args) {
        Searching s = new Searching(13);
	String[] dit = {"hoici","ab","zeta","episilon","ngoi","harr","lann",
			"nye","taksu","doota","eda","colum","hazen",
	};
	for (int i = 0; i < dit.length; i++) {
	    s.additem(dit[i],i);
	}
	System.out.println(s.toString());
	s.sort();
	System.out.println(s.toString());
	
	System.out.println("is hoici found:" + s.rbsearch("hoici"));
	System.out.println("is notfound found:" +  s.rbsearch("notfound"));

    }
}
