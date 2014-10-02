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
	String ret = "";
	for (int len=1 ;len < h; len++) {
	    for  (int g=0; g < len; g++) {
		ret = ret + "*";
	    }
	ret = ret + "\n";
	    }
	return ret;
    }

    public String tri2(int h) {
	int spaces  = h - 1;
	String ret = "";
	for (int nline=1; nline < h; nline++) {
	    for (int g = spaces ; g > 0 ; g = g-1) {
		ret = ret + " ";
	    }
	    for (int c = 0 ;c < nline ; c++) {
		ret = ret + "*";
	    }
	    spaces = spaces - 1;
	    ret = ret + "\n";
	}
	return ret;
    }
}
