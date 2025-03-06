
public class Elf extends MiddleEarthCharacter {
	private String race = "Elf";
	
	/*
	 * constructor for the elf subclass, functionally identical to all other subclasses.
	 */
	
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}
	
	/*
	 * attack method for the elf subclass, set to the unique requirements for this class
	 */
	
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Orc")) {
			target.setHealth(target.getHealth()-(power*1.5));
			return true;
		}
		else if(target.getRace().equals("Dwarf") || target.getRace().equals("Elf")) {
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
