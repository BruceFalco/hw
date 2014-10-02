public class box{
    public String box(int r, int c) {
	String ret = "";
	String tak = "";
	int ta = 0;
	while (ret.length() < c) {
	    ret = ret + "*";
	}


	while (ta < r) {
	    tak = tak + ret + "\n";
	    ta ++;
	}
	return tak;
    }
}
