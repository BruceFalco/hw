import java.util.*;


    /*
      Interfaces
      -> a contract (in java) that specifies that a class will implement
      certain methods with certain signatures
     */

/*
  method signature is: public/private return_type name(params):
 
 for example, the built-in java comparable interface looks something like this:
 
 interface Comparable {
   public int compareTo(Object other);
}
 
To agree to implement an interface, use "implements"
ex:

class myClass implements Comparable {
 // class definitions here//
}

A class can only extend one class but it can implement as many interfaces as it wants (separated by ,)

 */

// f(compareTo())

public class Interval{
    private int high,low;
    private static Random r = new Random();
    // if not static, then will take the same seed in paren and same number
    //every time
    // if made static, random gives diff number every time

    private static int numIntervals = 0;

    private void setup(int l, int h) {
	low = l;
	high = h;
	numIntervals++;
    }
    
    public Interval() {
	int l = r.nextInt(100);
	int h = r.nextInt(100) + l + 1;
	setup(l,h);
    }
    
    public Interval(int l, int h) {
	setup(l,h);
    }
    




    public String toString() {
	String s = "";
	s = "number" + numIntervals + " ->  [" + low + ", " + high + "]";
	return s;
    }


    public int compareTo(Interval other) {
	
	if (this.low == other.low) {
	    return this.high-other.high;
	} else {
	    return this.low-other.low;
	}
    }

    //static stuff
    public static void printStuff() {
	System.out.println("Stuff");
    }

    public static void main(String[] args) {

	/* this works because printStuff is static -- it belongs to the
	   class and is created wit hthe class (not with instances)
	   we can call it without interval because we're in the class

	   static -- belongs to the class rather than a specific instance
	   static variable -- also belongs to the class -> it's SHARED by all
	   instances 
	*/
	
        Interval n = new Interval();
	String nh = n.toString();
	System.out.println(nh);

	Interval n1 = new Interval();
	String nh1 = n1.toString();
	System.out.println(nh1);
	Interval n2 = new Interval(10,43);
	Interval n3 = new Interval(10,60);

	System.out.println(n.compareTo(n1));
	System.out.println(n3.compareTo(n2));

	printStuff();

	//	Interval[] a = new Interval[10];
	//	for (int i = 0; i < a.length; i++)
     
	String[] sa = {"frog","toad","iguana","komodo dragon","bearded lizard"};
	System.out.println(Arrays.toString(sa));
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));
	
    }



}
