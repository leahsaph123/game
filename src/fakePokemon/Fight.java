package fakePokemon;

import fakePokemon.Character.Abilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Fight.java sets up chosen players
// technically this file should only setup who is fighting who, and a different file should actually run the fight-- I think
public class Fight {
	public static void main(String[] args) {
		// generating a random number for damage
		Random damageGen = new Random();
		int char1Damage = damageGen.nextInt(101);
		int char2Damage = damageGen.nextInt(101);
		int char3Damage = damageGen.nextInt(101);
		
		// instantiating an object of both character and abilities-- can use just mainPlayerAbilities to access everything in the Character class as well
		Character char1 = new Character("Crayon", "dog", "     __\n(__()'`;\n/,    /`\n\\\\\"--\\\\", 100);
		Abilities char1Abilities = char1.new Abilities("Crayon", "dog", "     __\n(__()'`;\n/,    /`\n\\\\\"--\\\\", 100, "Bark", "Crayon barks at his enemies and scares them", char1Damage);
		
		
		Character char2 = new Character("Marker", "cat", "  ^_^\n=(o.o)=    '\n (  _  )--'\n  !! !!", 100);
		Abilities char2Abilities = char2.new Abilities("Marker", "cat", "  ^_^\n=(o.o)=    '\n (  _  )--'\n  !! !!", 100, "Hiss", "Marker hisses at enemies", char2Damage);
		
		Character char3 = new Character("Charry", "dragon", "          ___\n         /. _)\n    .^ ^/  /\n  _/      /\n<__.|_-|_|.", 100); 
		Abilities char3Abilities = char3.new Abilities("Charry","dragon","          ___\n         /. _)\n    .^ ^/  /\n  _/      /\n<__.|_-|_|.", 100, "Flame Breath", null, char3Damage);
		
		// declaring ability details to be more interesting text
		char1Abilities.characterAbilityDetails = "Crayon barks at his enemies, scaring them and dealing " + char1Abilities.characterAbilityDamage + " damage";
		char2Abilities.characterAbilityDetails = "Marker hisses at enemies, dealing " + char2Abilities.characterAbilityDamage + " damage";
		char3Abilities.characterAbilityDetails = "Charry breathes fire on his opponent, dealing" + char3Abilities.characterAbilityDamage + " damage";
		
		// putting each character into a list in order to more easily access the character chosen by player
		List<Character.Abilities> characterList = new ArrayList<Character.Abilities>();
		characterList.add(char1Abilities);
		characterList.add(char2Abilities);
		characterList.add(char3Abilities);
		
		// ask player for input on who to play as		
		Scanner input = new Scanner(System.in);
		System.out.println("Please select your fighter: ");
		System.out.println("Press 1 for " + char1.characterName);
		System.out.println(char1.characterAppears);
		System.out.println("Press 2 for " + char2.characterName);
		System.out.println(char2.characterAppears);
		System.out.println("Press 3 for " + char3.characterName);
		System.out.println(char3.characterAppears);
		int characterChoiceNumber = input.nextInt();

		// check that input is valid
		while (characterChoiceNumber < 1 || characterChoiceNumber > 3) {
			System.out.println("Invalid option selected. Please select a fighter from 1-3");
			characterChoiceNumber = input.nextInt();
		}
		// declare chosen character as mainPlayer for ease of understanding
		Character.Abilities mainPlayer = characterList.get(characterChoiceNumber - 1);

		// ask player for input on who to play against
		System.out.println("Please select who to fight: ");
		System.out.println("Press 1 for " + char1.characterName);
		System.out.println(char1.characterAppears);
		System.out.println("Press 2 for " + char2.characterName);
		System.out.println(char2.characterAppears);
		System.out.println("Press 3 for " + char3.characterName);
		System.out.println(char3.characterAppears);
		int enemyChoiceNumber = input.nextInt();

		// check that input is valid
		while (characterChoiceNumber == enemyChoiceNumber) {
			System.out.println("Your fighter and enemy can not be the same. Please select a different enemy");
			enemyChoiceNumber = input.nextInt();
		}
		// declare chosen enemy as enemy for ease
		Character.Abilities enemy = characterList.get(enemyChoiceNumber - 1);
		
		// start fighting
		Scanner chosenAttack = new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("Fight Starts Now");
		System.out.println("----------------");
		
		// get input to attack
		System.out.println("Choose your attack: ");
		System.out.println("Press 1 for: \n" + mainPlayer.characterAbility + ": " + mainPlayer.characterAbilityDetails);
		System.out.println(mainPlayer.characterName + " attacks with " + mainPlayer.characterAbility + " which deals " + mainPlayer.characterAbilityDamage + " to " + enemy.characterName);
		System.out.println(mainPlayer.characterAppears);
		
		// update enemy health
		int enemyCurrentHealth = enemy.characterMaxHealth - mainPlayer.characterAbilityDamage;
		System.out.println(enemy.characterName + " is now at " + enemyCurrentHealth + " health");
		
		// enemy attack
		System.out.println("BUT! " + enemy.characterName + " strikes back with " + enemy.characterAbility + ": " + enemy.characterAbilityDetails);
		System.out.println(enemy.characterAppears);
		
		// update player health
		int playerCurrentHealth = mainPlayer.characterMaxHealth - enemy.characterAbilityDamage;
		System.out.println(mainPlayer.characterName + " is now at " + playerCurrentHealth + " health");
		
		
		
		
		/*
		 * need to make a method for checking / dealing damage and to check who wins
		 * also make method for getting player input to choose ability
		 */
		
		
		/*
		 * pushing to git was so frustrating!!!!
		 * idek what i did but it worked
		 * first i used team > commit > commit and push in order to push BUT
		 * it pushed to master instead of main
		 * so i had to put them together
		 * i deleted the master branch and then used terminal commands
		 * git push origin main --> pushes to main
		 * git fetch origin --> pulles from main
		 * it worked but idk if ill be able to do it again without taking an hour
		 * 
		 * i also used a personal authentication token when i was using the commit and push option in place of typing in my password
		 * prob have to generate a new one each time i want to push because i can't look at it again
		 * WHEN YOU GENERATE THE TOKEN, MAKE SURE TO GIVE IT ALL PERMISSIONS!!!!!
		 */
	}

}
