
public class Orc extends MiddleEarthCharacter {
	private String race = "Orc";
	
	/*
	 * constructor for the orc subclass, functionally identical to all other subclasses.
	 */
	
	public Orc(String name, double health, double power) {
		super(name, health, power);
	}
	
	/*
	 * attack method for the orc subclass, set to the unique requirements for this class
	 */
	
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Human")) {
			target.setHealth(target.getHealth()-(power*1.5));
			return true;
		}
		else if(target.getRace().equals("Elf") || target.getRace().equals("Orc")) {
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
