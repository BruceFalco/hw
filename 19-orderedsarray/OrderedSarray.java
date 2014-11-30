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
	

}