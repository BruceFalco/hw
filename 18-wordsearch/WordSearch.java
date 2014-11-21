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
    
    
    // n north row--
    // s south row++
    // w west c--
    // e east c++
    // nw row-- c--
    // ne row-- c++
    // sw row++ c--
    // se row++ c++

    public void addWord(String w, int row, int c, String dir) {
	for (int i = 0; i < w.length(); i++) {
	    board[row][c] = w.charAt(i);
	    if (board[row][c] == '.' || board[row][c]==(w.charAt(i)) ) {
		board[row][c] = w.charAt(i);
	    } else {
		break;
	    }

	    if (dir.equals("n") && row-w.length() >=  0  ) {
		row= north(row,c);
	    }
	    else if (dir.equals("s") && row+w.length() <= board.length ) {
		row= south(row,c);
	    }
	    else if (dir.equals("w") && c-w.length() >= 0 ) {
		c= west(row,c);
	    }
	    else if (dir.equals("e") && c+w.length() <= board[row].length ) {
		c = east(row,c);
	    }
	    else {
		break;
	    }
	}
    }
    
    private int north(int row, int c) {
	row--;
	return row;
    }
    private int south(int row, int c) {
	row++;
	return row;
    }
    private int west(int row, int c) {
	c--;
	return c;
    }
    private int east(int row, int c) {
	c++;
	return c;
    }
    

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	//	System.out.println(w);
	w.addWord("hello",8,10,"s"); // should work
	System.out.println(w);
	//w.addWord("savior",40,10,"e"); // should not work
	System.out.println(w);
	w.addWord("frith",10,10,"n"); // should work
	System.out.println(w);
	w.addWord("comity",7,8,"w"); // should work
	System.out.println(w);



	//w.addWordH("look",3,14); // test illegal overlap
	//w.addWordH("look",3,18); // test legal overlap
	//w.addWordH("look",-3,20); // test illegal row
	//w.addWordH("look",3,55); // test illegal col
	// etc
	System.out.println(w);
    }
}
