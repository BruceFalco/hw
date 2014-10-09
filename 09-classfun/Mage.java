public class Mage extends Basechar{
    private int manna =12345;

    public int getManna(){
	return manna;
    }
    
    //constructors
    public Mage(String name,int manna) {
	this.name = name;
	this.manna = manna;
    }
    public Mage() {
	this.name = "Gawain Free";
    }
    
    //in order for the name to be returned to Driver (as name is private in Basechar and thus
    //cannot be accessed via Mage), an overwriting version of the getName() method must be used??
    //     public String getName() {
    // System.out.println(this.name);
    // (does not work)
    //    }
}