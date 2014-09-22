import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	String name = "timon luo";
	int spacey = name.indexOf(' ');
	System.out.println("Index of space is " + spacey);
	String first = name.substring(0,spacey);
	System.out.println("My first name is " + first);
	String last = name.substring(spacey);
	System.out.println("My last name is " + last);
    }
}