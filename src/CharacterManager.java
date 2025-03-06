
public class CharacterManager {
	private MiddleEarthCharacter[] characters;
	private int size;
	
	/*
	 * constructor for the Character manager, creates a new character
	 */
	
	public CharacterManager() {
		characters = new MiddleEarthCharacter[1];
		size = 0;
	}
	
	/*
	 * method for adding a new character, storing it in the MiddleEarthCharacter array
	 */
	
	public boolean addCharacter(MiddleEarthCharacter C) {
		if(size == characters.length) {
			MiddleEarthCharacter[] temp = new MiddleEarthCharacter[size*2];
			for(int i=0; i<characters.length; i++) {
				temp[i] = characters[i];
			}
			characters = temp;
		}
		characters[size] = C;
		size++;
		return true;
	}
	
	/*
	 * method for fetching a character from the MiddleEarthCharacter array
	 */
	
	public MiddleEarthCharacter getCharacter(String name) {
		for(int i=0; i<characters.length; i++) {
			if(characters[i] != null) {
				if (characters[i].getName().equals(name)) {
					return characters[i];
				}
			}
		}
		return null;
	}
	
	/*
	 * method for updating a characters info, searches the MiddleEarthCharacter array for desired character and updates its info if found returning true, otherwise it returns false
	 */
	
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
		for(int i=0; i<characters.length; i++) {
			if(characters[i] != null) {
				if(characters[i].equals(character)) {
					String oldName = character.getName();
					double oldHealth = character.getHealth();
					double oldPower = character.getPower();
					character.setName(name);
					character.setHealth(health);
					character.setPower(power);
					if(oldName.equals(character.getName()) || oldHealth == character.getHealth() || oldPower == character.getPower()) {
						return true;
					}
					else return false;
				}
			}
		}
		return false;
	}
	
	/*
	 * method for deleting a character from the MiddleEarthCharacter array, functions similarly to adding a character, returns false when the character requested for deletion is not found, 
	 * otherwise it returns true.
	 */
	
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		int j = 0;
		int k = 0;
		MiddleEarthCharacter[] temp = new MiddleEarthCharacter[characters.length];
		for(int i=0; i<characters.length; i++) {
			if(characters[i] != null) {
				if (!characters[i].equals(character)) {
					temp[j] = characters[i];
					j++;
				}
			}
			k++;
		}
		if(j == k) {
			return false;
		}
		characters = temp;
		size--;
		return true;
	}
	
	public void displayAllCharacters() {
		for(int i=0; i<size; i++) {
			characters[i].displayInfo();
			System.out.println("");
		}
	}
}
