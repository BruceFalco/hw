public class OrderedSarray extends Sarray {

    public String set(int index, String i) {
	if (index > last) {
	    return "";
	} else {
	    String old = data[index];
	    data[index] = i;
	    return old;
	}
    }

    public boolean add(String h) {
	//	int last;
	//	last = data.length-1;
	int i;
	for (i = last; i>0 &&  data[i-1].compareTo(h) > 0 ; i--) {
	    data[i] = data[i-1];
	    // got from Mr. Z
	}
	data[i] = h;
	return true;
    }
}
