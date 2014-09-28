import java.io.*;
import java.util.*;

public class StringStuff {
    public String makeAbba(String a, String b) {
	return a + b + b +a;
    }
    public String nonStart(String a, String b) {
	return a.substring(1) + b.substring(1);
    }
    public int diff21(int n) {
	if (n > 21) {
	    return 2*(n - 21);
	} else {
	    return 21 - n;
	}
    }
    public boolean nearHundred(int n) {
	if (Math.abs((100-n)) <=10) {
	    return true;
	} else if (Math.abs((200-n)) <=10) {
	    return true;
	} else {
	    return false;
	}
    }
    public boolean mixStart(String str) {
	if (str.length()<3) return false;
	String x = str.substring(1,3);
	return(x.equals("ix"));
    }

    public int teaParty(int tea, int candy) {
	if (tea < 5 || candy<5){
	    return 0;
	}else if ((tea >= (2*candy)) || (candy >= (2*tea))){
	    return 2;
	}else{
	    return 1;
	}
    }
    public boolean lastDigit(int a, int b, int c) {
	return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
    }
}