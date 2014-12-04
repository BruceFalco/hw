public class Sarray {
    String[] data;
    int   last;

    public Sarray() {
	int last = -1; 
	// last is index of latest element in array
	String[] data = new String[100];
    }

    public void  copyover() {
	String[] new_data;
        if (data.length < last+1) {
            new_data = new String[data.length+100];
            for(int i = 0; i<data.length;i++) {
		new_data[i] = data[i];
            }
            data = new_data;
	}
    }

    public void add(String h){
	copyover();
	data[last+1] = h;
	last++;

    }



    public void  add(int index, String h){
	copyover();
	for (int x=last;x>=index;x--) {
	    data[x+1]=data[x];
	}
	data[index] = h;
	last++;
    }




    public int size() {
	return last+1;
    }

   
    public String  get(int index) {
	if (index <= last) {
	    return data[index];
	} else {
	    return "";
	}
    }




  
    public String set(int index, String i){
	if (index>last) {
	    return "";
	} else {
	    String  old = data[index];
	    data[index] = i;
	    return old;
	}
    }
 
    
   
    public String remove(int index){
	String  old = data[index];
	for (int i = 0; i<last; i++) {
	    data[i]=data[i+1];
	}
	last--;
	return old;
    }



    public void isort() {	   
	for (int i = 0; i < last; i++) {
	    String newal = data[i];
	    int x;
	    for (x = last; x > 0 && newal.compareTo(data[x-1]) < 0; x--) {
		data[x] = data[x-1];
	    }
	    data[x] = newal;
	    
	}

    }

}
