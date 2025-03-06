
public class Dwarf extends MiddleEarthCharacter {
	private String race = "Dwarf";
	
	/*
	 * constructor for the dwarf subclass, functionally identical to all other subclasses.
	 */
	
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}
	
	/*
	 * attack method for the dwarf subclass, set to the unique requirements for this class
	 */
	
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Elf")) {
			target.setHealth(target.getHealth()-(power*1.5));
			return true;
		}
		else if(target.getRace().equals("Wizard") || target.getRace().equals("Dwarf")) {
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
