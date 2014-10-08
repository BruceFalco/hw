/* subclass of Basechar */
public class Warrior extends Basechar {
    //   private int health= 5000;
    private int healthboost = 5;
    private int mana = 0;
    public int getHealth() {
	return healthboost + super.getHealth() ;
    }
}
