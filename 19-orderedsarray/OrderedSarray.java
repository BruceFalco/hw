public class OrderedSarray extends Sarray {
    
    public int add(int i, String h) {
	return h.compareTo(get(i));
    }

    public void add(String h) {
	data = copyover();
	for (int i = 0; i < last; i++) {
	    int ere;
	    if (get(i).compareTo(h) >= 0) {
		ere = i;
	    }
	}
	for (int x = last; x >= ere; x--) {
	    data[x+1] = data[x];
	}
	data[ere] = h;
      	last++;
    }
	

}