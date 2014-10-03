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
    //taken from Aaron Jay to get sleep; will redo tomorrow
    public String tri3 (int h){
	String out = "";
	for (int r = 0; r < h; r++){ //row counter
	    for (int s = h-r; s > 1; s--){//space counter
		out = out + " ";
	    }
	    for (int x = 2 * r + 1; x > 0; x--){//asterisk counter
		out = out + "*";
	    }
	    out += "\n";
	}
	return out;
    } 

    public String tri3reverse (int h){
	String out = "";
	for (int r = h-1; r >= 0; r--){ //row counter
	    for (int s = h-r; s > 0; s--){//space counter
		out = out + " ";
	    }
	    for (int x = 2 * r + 1; x > 0; x--){//asterisk counter
		out = out + "*";
	    }
	    out += "\n";
	}
	return out;
    }

    public String diamond (int h){
	int r = h/2; 
	return tri3(r+1) + tri3reverse(r);
    }

    
    public String tri4 (int h) {
	String out = "";
	for (int c = 0; c < h; c ++){
	    for (int s = h; s > (h - c); s--) {
		out = out + " ";
	    }
	    for (int x = h; x > c; x--) {
		out = out + "*";
	    }
	    out = out + "\n";
	}
	return out;
    }
}
