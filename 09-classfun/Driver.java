public class Driver {
    public static void main(String[] args){

	Basechar b1,b2;
	Warrior w1,w2;
	Mage m1,m2;

	b1 = new Basechar();
	w1 = new Warrior();
	m1 = new Mage();

	m2 = m1;
	//	m2 = b1;
	//	m2 = c1;

	b2 = m1;
	//	System.out.println(b2.getManna());
	b2 = m2;
	// System.out.println(b2.getManna());
	// (doesn't work for some reason)
	b2 = new Warrior();


    }

}