
public abstract class MiddleEarthCharacter {
	protected String name;
	protected double health;
	protected double power;
	
	public MiddleEarthCharacter() {
		name = "Unknown";
		health = 0;
		power = 0;
	}
	
	/*
	 * constructor for the MiddleEarthCharacter class
	 */
	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	/*
	 * abstracts for the attack and getRace methods to be overwritten by the various subclasses
	 */
	
	abstract boolean attack(MiddleEarthCharacter target);
	
	abstract String getRace();
	
	/*
	 * a method to display the Race,Name,Health,and Power stats for a character
	 */
	
	public void displayInfo() {
		System.out.println("Character Race: " + getRace());
		System.out.println("Character Name: " + name);
		System.out.println("Character Health: " + health);
		System.out.println("Character Power: " + power);
	}
	
	/*
	 * methods that return the name, health, or power of a character when called.
	 */
	
	public String getName() {
		return name;
	}
	
	public double getHealth() {
		return health;
	}
	
	public double getPower() {
		return power;
	}
	
	/*
	 * methods that set the name, health, or power of a character when called.
	 */
	
	public void setName(String n) {
		name = n;
	}
	
	public void setHealth(double n) {
		health = n;
	}
	
	public void setPower(double n) {
		power = n;
	}
}