public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c) {
	board = new char[r][c];
	for (int i=0;i<board.length; i++) {
	    for (int j=0; j< board[i].length; j++) {
		board[i][j] = '.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }

    public String toString() {
	String s = "";
	for (int i= 0; i <board.length; i++) {
	    for (int j=0; j<board.length; j++) {
	        s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    public void addWordEast(String w, int row, int c){
	for (int i=0; i < w.length();i++){
	    board[row][c] = w.charAt(i);
	    c++;
	}
    }

    public void addWordWest(String w, int row, int c) {
	for (int i = 0; i<w.length(); i++) {
	    board[row][c] = w.charAt(i);
	    c--;
	}
    }

    public void addWordSouth(String w, int row, int c, String dir} {
	for (int i =0; i < w.length(); i++) {
	    board[row][c] = w.charAt(i);
	    row++;
	}
    }


    
    // n north row--
    // s south row++
    // w west c--
    // e east c++
    // nw 
    // ne
    // sw
    // se
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordSouth("hello",8,10); // should work
	//w.addWordH("look",3,14); // test illegal overlap
	//w.addWordH("look",3,18); // test legal overlap
	//w.addWordH("look",-3,20); // test illegal row
	//w.addWordH("look",3,55); // test illegal col
	// etc
	System.out.println(w);
    }
}
