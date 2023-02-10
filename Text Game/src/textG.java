/**
 * Kristopher Fierro-Marin
 * 2/7/23
 * A small scale of a text game I have in mind
 * eventually will evolve(?)
 * */

import java.util.Objects;
import java.util.Scanner;

public class textG {


    //making an instance of Player "p1" to be a new player.
    //The Player class is needed for everything, ranging from character selection, fighting, and more.
    private static final Player p1 = new Player();

    //making a global scanner, so we don't have to continuously make new ones
    private static final Scanner scan = new Scanner(System.in);
    private static String userInput;

    public static void main(String[] args) throws InterruptedException {
        //small intro and tells what the choices are going to be
        System.out.println("""
                ------------------------------------------------------------------
                Hey there! My name is Kris Fierro and thanks for checking this out!
                Just wanted to try to do a small text game so don't expect anything crazy, yet. :)
                Just wanted to let you know that if there is text between these symbols: <>, then that is a keyword for choices.
                Thanks again and have fun!
                ------------------------------------------------------------------
                """);
        //waits 5 seconds to print out the next text block
        Thread.sleep(5000);
        //a "\" at the end will make it so a new line doesn't appear.
        // This is just to make the dialogue and user input look a bit more pleasing to look at
        System.out.println("""
                Hello and welcome adventurer!
                We need your help to defeat some monsters that have overtook the local mine
                Before we begin, tell me, what is your name?\
                """);
        userInput = scan.nextLine();
        p1.setName(userInput);
        characterSelect();
        prologue();
        adventureBegins();
        /*
        Code to print out character stats in a text block
        System.out.printf("""
                %s
                %s
                %d
                %d
                %d
                %d
                %d
                %d
                """, p1.getName(), p1.getProfession(), p1.getHp(), p1.getMaxHp(), p1.getXp(), p1.getAtk(), p1.getDef(), p1.getLevel());
         */

    }

    /*this method will deal with creating a character, this will be used once which will be in the beginning.
    Planning to just do two classes to easily balance things out
    Fighter and Guardian
    */
    public static void characterSelect() {
        //setting a boolean called charSelect & reinCheck so that we can use input validation
        boolean charSelect = false;
        boolean reinCheck = false;
        System.out.println("Welcome " + p1.getName() + ", tell me something. Do you believe in reincarnation? <Y/N>");
        userInput = scan.nextLine();
        /*Making a while loop that has an enhanced switch case inside where if check to see if the user input is either Y or N
        If it's neither one of those then, it goes to default and repeats the question.
        Once the user answers either y or n we stop the loop and continue with the character selection.
        */
        while (!reinCheck) {
            switch(userInput.toUpperCase()) {
                case "Y" -> {
                    System.out.println("""
                            Splendid. Tell me do you believe to have been a <Fighter> in your past life?");
                            Or perhaps, were you just a <Guardian>?
                            """);
                    reinCheck = true;
                }
                case "N" -> {
                    System.out.printf("""
                            Ah. Worry not friend, that doesn't change anything between us
                            What path would you like be on, %s? Are you a <Fighter> or a <Guardian>?
                            """, p1.getName());
                    reinCheck = true;

                }
                default -> {
                    System.out.println("""
                            Not sure what you're saying my friend...
                            I'll ask again, do you believe in reincarnation? <Y/N>
                            """);
                    userInput = scan.nextLine();
                }
            }
        }
        //now we split into two statements between fighter and guardian
        while (!charSelect) {
            userInput = scan.nextLine();
            //enhanced switch statement
            //instead of using break statements we can now use ->
            switch (userInput.toLowerCase()) {
                case "fighter" -> {
                    p1.setProfession("Fighter");
                    p1.setMaxHp(10);
                    p1.setXp(0);
                    p1.setAtk(3);
                    p1.setDef(1);
                    p1.setLevel(1);
                    charSelect = true;
                }
                case "guardian" -> {
                    p1.setProfession("Guardian");
                    p1.setMaxHp(15);
                    p1.setXp(0);
                    p1.setAtk(1);
                    p1.setDef(3);
                    p1.setLevel(1);
                    charSelect = true;
                }
                default -> System.out.printf("""
                I uh... don't know what to say %s, those are your only two choices...
                So... <Fighter> or <Guardian>?
                """, p1.getName());
            }
        }
    }

    /*this is where we provide a story. A sense of adventure
    Why the player must fight for the Kingdom of xyz
    try to make it interesting later on.
    since this is a rough idea, we can just leave it small/minimal
    */
    private static void prologue() {

    }

    /*This is where we will do a small tutorial
    Just fight some monsters, get xp, and acquire skill points
    and then produce story
     */
    private static void adventureBegins() {
    }



}
