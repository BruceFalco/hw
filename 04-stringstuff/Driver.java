import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
    }
    public boolean mixStart(String str) {
	if (str.length() < 3) return false;
	str = str.substring(1,3);
	if (str.equals("ix")) {
	    return true;
	}
	else {
	    return false;
	}
    }
    public String makeOutWord(String out, String word) {
	String str = out.substring(0,2) + word + out.substring(2);
	return str;
    }
    public String firstHalf(String str) {
	int half = str.length()/2;
	return str.substring(0,half);
    }
}
