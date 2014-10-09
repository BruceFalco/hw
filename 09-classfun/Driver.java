public class Driver {
    public static void main(String[] args){
	Basechar c = new Basechar();
	Warrior w = new Warrior();
	Mage m = new Mage();
	Basechar c2;
	Warrior w2;
	Mage m2;
	
	// nope w2 = m;
	// nope w2 = m;

	//this works -- note that c2.getHealth() calls getHealth in the
	// warrior subclass
	c2 = w;
	System.out.println(c2.getHealth());
	
	/* a variable of a superclass can refer (point to, be assigned to)
	   an instance of a subclass
	   a variable of a subclass can't point to an instance of its superclass
	*/

	c2 = m;


	System.out.println("-------------");
	
	m.setName("Grif");
	w2 = new Warrior();
	w2.setName("Church");
	w.setName("Sarge");

	w.attack(m);
	m.attack(w);
	w2.attack(w);

        System.out.println("-------------");

	//oct 8 homework stuff -- constructor tests -- works
	/*	Basechar ichi = new Basechar("Zatoichi");
	Basechar nii = new Basechar();
	System.out.println(ichi.getName());
	System.out.println(nii.getName());
	ichi.attack(nii);
	*/

	Mage magi1 = new Mage("Cavaliere",9000);
	Mage magi2 = new Mage();
	System.out.println(magi1.getName());
	System.out.println(magi1.getManna());
	System.out.println(magi2.getName());
	System.out.println(magi2.getManna());


    }

}
