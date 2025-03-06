import java.util.Scanner;

public class Main {
	static MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
	static CharacterManager manager = council.getCharacterManager();

	public static void main(String[] args) {
		Elf elf = new Elf("Luke", 100, 5);
		Orc orc = new Orc("Andy", 100, 10);
		Human human = new Human("Noah", 100, 5);
		Wizard wizard = new Wizard("April", 100, 10);
		Dwarf dwarf = new Dwarf("Callum", 100, 10);
		manager.addCharacter(elf);
		manager.addCharacter(human);
		manager.addCharacter(wizard);
		manager.addCharacter(orc);
		manager.addCharacter(dwarf);
		mainMenu();
	}
	public static void mainMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println(" Welcome to Middle Earth ");
		System.out.println("-------------------------");
		System.out.println("-(1)Add a New Character--");
		System.out.println("-(2)Update a Character---");
		System.out.println("-(3)-Delete a Charater---");
		System.out.println("-(4)-Start the Battle----");
		System.out.println("-(5)View all Characters--");
		System.out.println("-(6)--------Exit---------");
		System.out.println("-------------------------");
		System.out.println("To make a selection, type");
		System.out.println("the desired number in the");
		System.out.println("        terminal.        ");
		System.out.println("");
		int selection = Integer.parseInt(scanner.nextLine());
		if(selection == 1) {
			addCharacterMenu();
		}
		else if(selection == 2) {
			updatedCharacterMenu();
		}
		else if(selection == 3) {
			deleteCharacterMenu();
		}
		else if(selection == 4) {
			battleMenu();
		}
		else if(selection == 5) {
			viewCharacterMenu();
		}
		else if(selection == 6) {
			System.exit(0);
		}
		else {
			System.out.println("Invalid selection");
			System.out.println("");
			mainMenu();
		}
	
	}
	public static void addCharacterMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the race of your character?");
		System.out.println("1. Elf");
		System.out.println("2. Orc");
		System.out.println("3. Human");
		System.out.println("4. Wizard");
		System.out.println("5. Dwarf");

		int selection = Integer.parseInt(scanner.nextLine());
		if(selection == 1) {
			System.out.println("What is the name of your character?");
			String name = scanner.nextLine();
			System.out.println("What is the health of your character?");
			double health = Double.parseDouble(scanner.nextLine());
			System.out.println("What is the power of your character?");
			double power = Double.parseDouble(scanner.nextLine());
			manager.addCharacter(new Elf(name, health, power));
			System.out.println("Your character has been added, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
		else if(selection == 2) {
			System.out.println("What is the name of your character?");
			String name = scanner.nextLine();
			System.out.println("What is the health of your character?");
			double health = Double.parseDouble(scanner.nextLine());
			System.out.println("What is the power of your character?");
			double power = Double.parseDouble(scanner.nextLine());
			manager.addCharacter(new Orc(name, health, power));
			System.out.println("Your character has been added, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
		else if(selection == 3) {
			System.out.println("What is the name of your character?");
			String name = scanner.nextLine();
			System.out.println("What is the health of your character?");
			double health = Double.parseDouble(scanner.nextLine());
			System.out.println("What is the power of your character?");
			double power = Double.parseDouble(scanner.nextLine());
			manager.addCharacter(new Human(name, health, power));
			System.out.println("Your character has been added, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
		else if(selection == 4) {
			System.out.println("What is the name of your character?");
			String name = scanner.nextLine();
			System.out.println("What is the health of your character?");
			double health = Double.parseDouble(scanner.nextLine());
			System.out.println("What is the power of your character?");
			double power = Double.parseDouble(scanner.nextLine());
			manager.addCharacter(new Wizard(name, health, power));
			System.out.println("Your character has been added, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
		else if(selection == 5) {
			System.out.println("What is the name of your character?");
			String name = scanner.nextLine();
			System.out.println("What is the health of your character?");
			double health = Double.parseDouble(scanner.nextLine());
			System.out.println("What is the power of your character?");
			double power = Double.parseDouble(scanner.nextLine());
			manager.addCharacter(new Dwarf(name, health, power));
			System.out.println("Your character has been added, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
		else {
			System.out.println("That race was not found, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
	}
	public static void updatedCharacterMenu() {
		System.out.println("What is the name of the character you wish to update?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		MiddleEarthCharacter temp = manager.getCharacter(name);
		if(temp != null) {
			System.out.println("What is the new health of your character?");
			int health = Integer.parseInt(scanner.nextLine());
			System.out.println("What is the new power of your character?");
			int power = Integer.parseInt(scanner.nextLine());
			boolean update = manager.updateCharacter(temp, name, health, power);
			if(update) {
				System.out.println("Your character has been updated, return to main menu? Y/N");
				if(scanner.nextLine().equals("Y")) {
					mainMenu();
				}
				else System.exit(0);
			}
			else {
				System.out.println("Your character was not updated, return to main menu? Y/N");
				if(scanner.nextLine().equals("Y")) {
					mainMenu();
				}
				else System.exit(0);
			}
		}
		else {
			System.out.println("Your character was not found, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
	}
	public static void deleteCharacterMenu() {
		System.out.println("What is the name of the character you wish to delete?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		MiddleEarthCharacter temp = manager.getCharacter(name);
		if(temp != null) {
			manager.deleteCharacter(temp);
			System.out.println("Your character has been deleted, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
		else {
			System.out.println("Your character was not found, return to main menu? Y/N");
			if(scanner.nextLine().equals("Y")) {
				mainMenu();
			}
			else System.exit(0);
		}
	}
	public static void battleMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What character is attacking?");
		String name = scanner.nextLine();
		MiddleEarthCharacter temp = manager.getCharacter(name);
		if(temp != null) {
			System.out.println("What character is being attacked?");
			String defender = scanner.nextLine();
			MiddleEarthCharacter defenderTemp = manager.getCharacter(defender);
			if(defenderTemp != null) {
				boolean attacked = temp.attack(defenderTemp);
				if(attacked)
				{
					System.out.println(name + " attacked " + defender + " successfully");
				}
				else System.out.println("Attack failed");
			}
			else System.out.println("There was no character found to attack!");
		}
		else System.out.println("Your character was not found");
		System.out.println("Return to main menu? Y/N");
		if(scanner.nextLine().equals("Y")) {
			mainMenu();
		}
		else System.exit(0);
	}
	public static void viewCharacterMenu() {
		Scanner scanner = new Scanner(System.in);
		manager.displayAllCharacters();
		System.out.println("");
		System.out.println("Return to main menu? Y/N");
		if(scanner.nextLine().equals("Y")) {
			mainMenu();
		}
		else System.exit(0);
	}
}
