package fakePokemon;

// Character.java sets up characters and their abilities
public class Character {
	// instance/declare variables
	String characterName;
	String characterType;
	String characterAppears;
	int characterMaxHealth;
	// should separate ability details from character details
	
	
	// setup of characters--- i think abilities should be a separate class dependent on the character class
	public Character (String characterName, String characterType, String characterAppears, int characterMaxHealth) {
		this.characterName = characterName;
		this.characterType = characterType;
		this.characterAppears = characterAppears;
		this.characterMaxHealth = characterMaxHealth;
	}
	
	
	//setting up abilities class, separated from characters for easier accessibility 
	public class Abilities extends Character {
		String characterAbility;
		String characterAbilityDetails;
		int characterAbilityDamage;
		
		public Abilities (String characterName, 
				String characterType,
				String characterAppears,
				int characterMaxHealth, 
				String characterAbility, 
				String characterAbilityDetails, 
				int characterAbilityDamage) {
			super(characterName, characterType, characterAppears, characterMaxHealth);
			this.characterAbility = characterAbility;
			this.characterAbilityDetails = characterAbilityDetails;
			this.characterAbilityDamage = characterAbilityDamage;
		}
	}
	
	// setup of "mainplayer"-- should have currentHealth be a variable manipulated in the 'fighting' function, doesn't need to be declared here
//	public static void main(String[] args) {
//
//	}
	

}
