public class Driver {

    public static void main(String[] args) {
	Example ee = new Example();
	
	System.out.println("Before the error test");

	try {
	    ee.etest(11);
	    System.out.println("call to estest finished");
	} catch (IndexOutOfBoundsException e) {
	    System.out.println("etest crashed with: "+e);
	} catch (ArithmeticException e) {
	    System.out.println("IOB crashed with:" + e);
	}
	
	System.out.println("After the error test");


       
    }
}
