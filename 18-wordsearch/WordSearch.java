import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board,key;
    private Random r = new Random();
    private ArrayList<String> wordlist,words;

    public WordSearch(int r, int c) {
	board = new char[r][c];
	for (int i=0;i<board.length; i++) {
	    for (int j=0; j< board[i].length; j++) {
		board[i][j] = '.';
	    }
	}
	Scanner sc = null;
	try {
	    sc = new Scanner (new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open word file");
	    System.exit(0);
	}
	wordlist = new ArrayList<String>();
	while (sc.hasNext()) {
	    wordlist.add(sc.next());
	}
    }

    public WordSearch() {
	this(20,40);
    }

    public String toString() {
	String s = "";

	for (int i= 0; i <board.length; i++) {
	    for (int j=0; j<board[i].length; j++) {
	        s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public String getKey() {
	String s = "";
	for (int i =0 ; i <key.length; i++) {
	    for (int j= 0; j < key[i].length; j++) {
		s = s + key[i][j];
	    }
	    s= s + "\n";
	}
	return s;
    }
    private void makeKey() {
	key = new char[board.length][board[0].length];
	for (int i = 0; i<board.length;i++) {
	    for (int j= 0; j<board[i].length;j++) {
		key[i][j] = board[i][j];
	    }
	}
    }
    
    // n north row--
    // s south row++
    // w west c--
    // e east c++
    // nw row-- c--
    // ne row-- c++
    // sw row++ c--
    // se row++ c++



    public boolean inBound(String w, int row, int c, String dir) {
	if (row < 0 || row > board.length || c < 0 || c > board[0].length) {
	    return false;
	}
	else if (dir.equals("n")) {
	    return (row-w.length() >= 0);
	}
	else if (dir.equals("s")) {
	    return (row+w.length() <= board.length);
	}
	else if (dir.equals("w")) {
	    return (c-w.length() >= 0);
	}
	else if (dir.equals("e")) {
	    return (c+w.length() <= board[0].length);
	}
	else {
	    return false;
	}
    }
	

    public boolean NOverlap(String w, int row, int c, String dir) {
	for (int i = 0; i < w.length(); i++) {
	    char ima = board[row][c];
	    if (ima != '.' && ima != w.charAt(i)) {
		return false;
	    }
	    if (dir.equals("n") || (dir.equals("nw")) || dir.equals("ne")) {
		row--;
	    }
	    if (dir.equals("s") || dir.equals("sw") || dir.equals("se")) {
		row++;
	    }
	    if (dir.equals("w") || dir.equals("sw") || dir.equals("nw")) {
		c--;
	    }
	    if (dir.equals("e") || dir.equals("se") || dir.equals("ne")) {
		c++;
	    }
	}
	return true;
    }

    public boolean Adder(String w, int row, int c, String dir) {
	if (!(NOverlap(w,row,c,dir) && inBound(w,row,c,dir))) {
	    return false;
	}
	for (int i = 0; i< w.length(); i++) {
	    board[row][c] = w.charAt(i);
	    if (dir.equals("n") || (dir.equals("nw")) || dir.equals("ne")) {
                row--;
            }
            if (dir.equals("s") || dir.equals("sw") || dir.equals("se")) {
                row++;
            }
            if (dir.equals("w") || dir.equals("sw") || dir.equals("nw")) {
                c--;
            }
            if (dir.equals("e") || dir.equals("se") || dir.equals("ne")) {
                c++;
	    } 
	}
	return true;
    }
    
    public String addWord(String w, int row, int c, String dir) {
	Adder(w,row,c,dir);
	if (Adder(w,row,c,dir)) {
	    return "Word added successfully.";
	} else {
	    return "Word not added.";
	}
    }

    public void  addWord(String w) {
	int row, c;
	row = r.nextInt(board.length);
	c = r.nextInt(board[0].length);
	String[] direc = {
	    "n","s","e","e",
	    "nw","sw","ne","se"
	};
	String dir = direc[r.nextInt(direc.length)];
	boolean well = Adder(w,row,c,dir);
	while (well == false) {
	    row = r.nextInt(board.length);
	    c = r.nextInt(board[0].length);
	    dir = direc[r.nextInt(direc.length)];
	    well = Adder(w,row,c,dir);
	}

    }
    
    public void addWord(String[] ws) {
	for (int i = 0; i < ws.length; i++) {
	    addWord(ws[i]);
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
    

    public void buildPuzzle(int numwords){
	words = new ArrayList<String>();
	int i = 0;
	while (i<numwords) {
	    int wordIndex = r.nextInt(wordlist.size());
	    String word = wordlist.get(wordIndex);
	    words.add(word);
	    wordlist.remove(wordIndex);
	    i++;
	}
   
	makeKey();
	/* fill the board with random letters */
	for (i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		if (board[i][j]=='.'){
		    // board[i][j]=(char)((int)'a'+rnd.nextInt(26));
		    String letters = "abcdefghijklmnopqrstuvwxyz";
		    board[i][j] = letters.charAt(r.nextInt(letters.length()));
		}
	    }
	}
    }
    
    public String getWords() {
	return ""+words;
    }


    public static void main(String[] args) {
	WordSearch w = new WordSearch(15,40);
	System.out.println(w);
	w.buildPuzzle(50);
	System.out.println(w);
	System.out.println(w.getKey());
    }
}
