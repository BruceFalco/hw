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
}