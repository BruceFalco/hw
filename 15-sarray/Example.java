public class Example {
    public void etest(int i) {
	if (i > 10) {
	    //throw new IndexOutOfBoundsException();
	    throw new ArithmeticException();
	    //throw new ArithmeticException();
	}
	System.out.println("In etest, we're okay");
    }
}


