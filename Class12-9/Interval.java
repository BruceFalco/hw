import java.util.*;

public class Interval {
    private int high,low;
    private static Random r = new Random();
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
	
	Interval n2 = new Interval();
	String nh2 = n2.toString();
	System.out.println(nh2);
	
	Interval n3 = new Interval();
	String nh3 = n3.toString();
	System.out.println(nh3);

	printStuff();

	//	Interval[] a = new Interval[10];
	//	for (int i = 0; i < a.length; i++)
     
         
	
    }
}
