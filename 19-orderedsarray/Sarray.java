public class Sarray {
    String[] data;
    int   last;

    public Sarray() {
	int last = -1; 
	// last is index of latest element in array
	String[] data = new String[100];
    }

    public String[] copyover() {
        if (data.length > last+1) {
            String[] new_data = new String[data.length+100];
            for(int i = 0; i<data.length;i++) {
		new_data[i] = data[i];
            }
            data = new_data;
	}
	return data;
    }

    public boolean add(String i){
	data = copyover();
	data[last+1] = i;
	last++;
	return true;
    }



    public void  add(int index, int i){
	data = copyover();
	for (int x=last;x>=index;x--) {
	    data[x+1]=data[x];
	}
	data[i] = get(i);
	last++;
    }




    public int size() {
	return last+1;
    }

   
    public int get(int index) {
	if (index>last) {
	    return -1;
	} else {
	    return data[index];
	}
    }




  
    public int set(int index, int i){
	if (index>last) {
	    return -1;
	} else {
	    int old = data[index];
	    data[index] = i;
	    return old;
	}
    }
 
    
   
    public int remove(int index){
	int old = data[index];
	for (int i = 0; i<last; i++) {
	    data[i]=data[i+1];
	}
	last--;
	return old;
    }
}