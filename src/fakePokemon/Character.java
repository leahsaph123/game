package fakePokemon;

import java.util.Random;

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
	public static void main(String[] args) {
		
		// generating a random number between 0 and 100 for damage
		Random damageGen = new Random();
		int mainPlayerDamage = damageGen.nextInt(101);
		int enemyDamage = damageGen.nextInt(101);
		
		// instantiating an object of both character and abilities-- can use just mainPlayerAbilities to access everything in the Character class as well
		Character mainPlayer = new Character("Crayon", "dog", "     __\n(__()'`;\n/,    /`\n\\\\\"--\\\\", 100);
		Abilities mainPlayerAbilities = mainPlayer.new Abilities("Crayon", "dog", "     __\n(__()'`;\n/,    /`\n\\\\\"--\\\\", 100, "Bark", "Crayon barks at his enemies and scares them", mainPlayerDamage);
		
		Character enemy = new Character("Marker", "cat", " ", 100);
		Abilities enemyAbilities = enemy.new Abilities("Marker", "cat", " ", 100, "Hiss", "Marker hisses at enemies", enemyDamage);
		
		// declaring ability details to be more interesting text
		mainPlayerAbilities.characterAbilityDetails = "Crayon barks at his enemies, scaring them and dealing " + mainPlayerAbilities.characterAbilityDamage + " damage";
		enemyAbilities.characterAbilityDetails = "Marker hisses at enemies, dealing " + enemyAbilities.characterAbilityDamage + " damage";
		
		System.out.println("Name is: " + mainPlayerAbilities.characterName);
		System.out.println("type is: " + mainPlayer.characterType);
		System.out.println("max health is: " + mainPlayerAbilities.characterMaxHealth);
		System.out.println("ability is: " + mainPlayerAbilities.characterAbility);
		System.out.println("damage is: " + mainPlayerAbilities.characterAbilityDamage);
		System.out.println("details are: " + mainPlayerAbilities.characterAbilityDetails + "\n");
		System.out.println("appears as:\n" + mainPlayerAbilities.characterAppears);

	}
	

}
