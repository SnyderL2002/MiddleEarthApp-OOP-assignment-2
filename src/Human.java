
public class Human extends MiddleEarthCharacter {
	private String race = "Human";
	
	/*
	 * constructor for the human subclass, functionally identical to all other subclasses.
	 */
	
	public Human(String name, double health, double power) {
		super(name, health, power);
	}

	/*
	 * attack method for the human subclass, set to the unique requirements for this class
	 */
	
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Wizard")) {
			target.setHealth(target.getHealth()-(power*1.5));
			return true;
		}
		else if(target.getRace().equals("Orc") || target.getRace().equals("Human")) {
			return false;
		}
		else {
			target.setHealth(target.getHealth()-(power));
			return true;
		}
	}
	
	/*
	 *  get race method returns the race of this subclass when called.
	 */
	
	public String getRace() {
		return race;
	}
}
