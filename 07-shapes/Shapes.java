public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }
    public String tri1(int h) {
	int len = 1;
	String ret = "";
	while (len < h) {
	    int g = 0;
	    while (g < len) {
		ret = ret + "*";
		g ++;
	    }
	ret = ret + "\n";
	len ++;
	    }
	return ret;
    }

    public String tri2(int h) {
	int spaces  = h - 1;
	int nline = 1;
	String ret = "";
	while (nline < h) {
	    int g = spaces;
	    while (g > 0) {
		ret = ret + " ";
		g = g - 1;
	    }
	    int c  = 0;
	    while (c < nline) {
		ret = ret + "*";
		c ++;
	    }
	    nline ++;
	    spaces = spaces - 1;
	    ret = ret + "\n";
	}
	return ret;
    }
}