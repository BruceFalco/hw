/* superclass for warrior (base class) and Mage */
public class Basechar {
    private int health=20;
    private String name;

    //constructors -- functioning

    public Basechar(String name) {
	setName(name);
    }
    public Basechar() {
	this.name = "Joanna";
    }
    // constructors end

    public void attack(Basechar other) {
	System.out.println(this.name+" is attacking "+other.name);
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return this.name;
    }
    public int getHealth() {
	return this.health;
    }

    
}
