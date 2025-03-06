
class MiddleEarthCouncil {
	private static MiddleEarthCouncil council = null;
	private static CharacterManager characterManager;
	
	/*
	 * constructor for the MiddleEarthCouncil, creates a new character manager
	 */
	
	private MiddleEarthCouncil() {
		characterManager = new CharacterManager();
	}
	
	/*
	 * method for fetching a character manager, providing access to the character manager
	 */
	
	public CharacterManager getCharacterManager() {
		return characterManager;
	}
	
	/*
	 * method returns a single instance, know as the council
	 */
	
	public static MiddleEarthCouncil getInstance() {
		if(council == null) {
			council = new MiddleEarthCouncil();
		}
		return council;
	}
}
