public class OrderedSarray extends Sarray {
    
    /* public int add(int i, String h) {
	return h.compareTo(get(i));
    }*/

    public boolean add(String h) {
	data = copyover();
	int ere = -1;
	for (int i = 0; i < last; i++) {
	    if (get(i).compareTo(h) >= 0) {
		ere = i;
	    }
	}
	if (ere == -1) {
	    ere = last;
	}
	for (int x = last; x >= ere; x--) {
	    data[x+1] = data[x];
	}
	data[ere] = h;
      	last++;
 	return true;
    }
	
    public void reorder() {
	String[] neu = new String[data.length];
	int x = 0;
	// index of most first String in terms of ABC order
	for (int i = 1; i < last; i++) {
	    if (get(i).compareTo(x) < 0) {
		x = i;
	    }
	}
	//to be continued; needs nested for loop, prolly	

    }
		


    public String set(int index, String i) {
	if (index > last) {
	    return "";
	} else {
	    String old = data[index];
	    data[index] = i;

}
