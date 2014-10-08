public class Driver{
    public static void main(String[] args){
	Basechar c = new Basechar();
	System.out.println(c.getHealth());
	Warrior w = new Warrior();
	System.out.println(w.getHealth());
	Mage m = new Mage();
	System.out.println(m.getHealth());
	System.out.println(m.getMana());
	//	System.out.println(w.warriorGetHealth());
    }
}
