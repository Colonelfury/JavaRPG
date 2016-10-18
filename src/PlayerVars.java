/**
 * Created by colonelfury on 10/13/2016.
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class PlayerVars
{

    Scanner userInput = new Scanner(System.in);
    public String playerName, playerState;
    public int gold, level;
    public int curExp, maxExp;
    public int curHealth, maxHealth;


    public void createPlayer()
    {
        System.out.println("What is your name adventurer?");
        maxHealth = 10;
        curHealth = 10;
        level = 1;
        curExp = 0;
        maxExp = 10;
        playerState = "normal";
        playerName = userInput.nextLine();
    }
    public void printStats()
    {
        System.out.println("Current Player Stats");
        System.out.println("--------------------");
        System.out.println("Name: " + playerName);
        System.out.println("Health: " + curHealth + "/" + maxHealth);
        System.out.println("XP: " + curExp + "/" + maxExp);
        System.out.println("Level: " + level);
        System.out.println("Gold: " + gold);
    }

    public void quit()
    {
        System.out.println(playerName + " cannot find their way out of the cave, and dies of starvation.");
        curHealth = 0;
    }

    public void help()
    {
        System.out.println("Help");
        System.out.println("Quit");
        System.out.println("Status");
        System.out.println("Rest");
        System.out.println("Explore");
        System.out.println("Attack");
        System.out.println("Flee");
    }


}
