import java.util.*;
public class Arraystuff {
    /*--------------------- Instance Variables --------------------*/
    private int[] a;
    Random rnd;
    // By making x final, we can set it once but then never change it
    // private final int x = 123;
    /*--------------------- Constructors --------------------*/
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    public Arraystuff(){
	this(100);
    }
    /*--------------------- Methods --------------------*/
    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;}
    /*--------------------- Main --------------------*/
    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as+"\n The freq of 78 is "+as.freq(78) );
	System.out.println("The max value ist " + as.maxVal());
	System.out.println("Das mode ist " + as.mode(  ));
    }

    public int freq(int i){
	int count = 0;
	int num = a[i];
	for (int u = 0; u < a.length; u++) {
	    if (num == a[u]) {
		count++;
	    } else {}
	 
	}
	return count;
    }

    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n) {
		return i;
	    }
	}
	return -1;
    }

    public int maxVal() {
        int maxie = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i] > maxie) {
		maxie = a[i];
	    } else {}
	}
	return maxie;
    }

    public int mode(        ) {
	int modeSoFar     =a[0],modeCount=freq(a[0]);
	for (int i=0; i<a.length;i++) {
	    if (freq(a[i]) > modeCount) {
		modeSoFar     = a[i];
		modeCount = freq(a[i]);
	    }
	}
	return modeSoFar;
    }

}
