/**
 * Created by colonelfury on 10/12/2016.
 */
import com.sun.media.jfxmedia.events.PlayerStateEvent;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class rpg
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PlayerVars player = new PlayerVars();
        PlayerVars enemy = new PlayerVars();
        String userInput;



        System.out.println("******************************************************");
        System.out.println("**                                                  **");
        System.out.println("**               Welcome to Aranoth!                **");
        System.out.println("**                                                  **");
        System.out.println("******************************************************");


        try {
            Thread.sleep(3);
        } catch (InterruptedException ie) {
            //Handle exception
        }
        System.out.print("\033[H\033[2J"); //ClearScreen

        player.createPlayer();
        player.printStats();


        System.out.println("Type help for a list of commands.");
        System.out.println();
        while(player.curHealth >0)
        {
            System.out.println("What would you like to do?");
            userInput = input.next();

            if(userInput.equalsIgnoreCase("help") || userInput.equalsIgnoreCase("h"))
            {
                player.help();
            }
            
            else if(userInput.equalsIgnoreCase("quit") || userInput.equalsIgnoreCase("q"))
            {
                player.quit();
            }

            else if(userInput.equalsIgnoreCase("status") || userInput.equalsIgnoreCase("s"))
            {
                player.printStats();
            }
            
            else if(userInput.equalsIgnoreCase("rest") || userInput.equalsIgnoreCase("r")
            {
                if(player.curHealth + 10 <= player.maxHealth)
                {
                    player.curHealth += 10;
                }
                else
                {
                    player.curHealth = player.maxHealth;
                }
            }
            
            else if (userInput.equalsIgnoreCase("flee") || userInput.equalsIgnoreCase("f"))
            {
                if(player.playerState.equals("normal"))
                {
                    System.out.println("You are not in combat.");
                }
                else
                {
                    System.outprintln("You flee from combat.");
                    player.playerState = "normal";
                }
            }

            
            else
            {
                System.out.println(player.playerName + " does not understand what you are saying.");
            }
        }







    }






}
