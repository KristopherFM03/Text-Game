/**
 * Kristopher Fierro-Marin
 * 2/7/23
 * A small scale of a text game I have in mind
 * eventually will evolve(?)
 */

import java.util.Scanner;

public class textG {

    //making an instance of Player "p1" to be a new player.
    //The Player class is needed for everything, ranging from character selection, fighting, and more.
    private static final Player p1 = new Player();

    /*
    Making a global scanner, so we don't have to continuously make new ones
    Making a global string called userInput to avoid making new String userInput in every method
    And making a boolean called majorChoice to know the answer of the user's response to change what happens early on
    majorChoice right now is involved in characterSelect to see if the user believes in reincarnation
    So that in prologue we can make a small story before they got transported here
    */
    private static final Scanner scan = new Scanner(System.in);
    private static String userInput;
    private static boolean majorChoice = false;

    public static void main(String[] args) throws InterruptedException {
        //small intro and tells what the choices are going to be
        System.out.println("""
                ------------------------------------------------------------------
                Hey there! My name is Kris Fierro and thanks for checking this out!
                Just wanted to try to do a small text game so don't expect anything crazy, yet. :)
                Just wanted to let you know a couple of things
                If there is text between these symbols: ||, then that is a keyword for choices.
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
        //The user will be prompted to go through some dialogue and pick between being a Fighter or a Guardian
        characterSelect();
        //prologue will give users some background story for why they must help
        prologue();
        //adventureBegins will deal with combat and the introduction of the first enemy
        adventureBegins();
    }

    //players will be able to check their stats with ease. The user will just need to type s in combat
    private static void checkStats() {
        System.out.printf("""
               <Name: %s>
               <Profession: %s>
               <HP: %d/%d>
               <XP: %d>
               <ATK: %d>
               <DEF: %d>
               <LEVEL: %d>
                """, p1.getName(), p1.getProfession(), p1.getHp(), p1.getMaxHp(), p1.getXp(), p1.getAtk(), p1.getDef(), p1.getLevel());

    }

    /*this method will deal with selecting a character, this will be used once which will be in the beginning.
    Planning to just do two classes to easily balance things out
    Fighter and Guardian
    */
    public static void characterSelect() {
        //setting a boolean called charSelect & reinCheck so that we can use input validation
        boolean charSelect = false;
        boolean reinCheck = false;
        System.out.println("Welcome " + p1.getName() + ", tell me something. Do you believe in reincarnation? |Y/N|");
        userInput = scan.nextLine();
        /*Making a while loop that has an enhanced switch case inside where if check to see if the user input is either Y or N
        If it's neither one of those then, it goes to default and repeats the question.
        Once the user answers either y or n we stop the loop and continue with the character selection.
        */
        while (!reinCheck) {
            switch(userInput.toUpperCase()) {
                case "Y" -> {
                    System.out.println("""
                            Splendid. Tell me, do you believe to have been a |Fighter| in your past life?
                            Or perhaps, were you just a |Guardian|?
                            """);
                    reinCheck = true;
                    majorChoice = true;
                }
                case "N" -> {
                    System.out.printf("""
                            Ah. Worry not friend, that doesn't change anything between us
                            What path would you like be on, %s? Are you a |Fighter| or a |Guardian|?
                            """, p1.getName());
                    reinCheck = true;
                    majorChoice = false;

                }
                default -> {
                    System.out.println("""
                            Not sure what you're saying my friend...
                            I'll ask again, do you believe in reincarnation? |Y/N|
                            """);
                    userInput = scan.nextLine();
                }
            }
        }
        //now we split into two statements between fighter and guardian
        while (!charSelect) {
            userInput = scan.nextLine();
            //enhanced switch statement
            //instead of using break statements we can now use -|
            switch (userInput.toLowerCase()) {
                case "fighter" -> {
                    System.out.printf("""
                    Ah, so you have chosen the path of the Fighter.
                    Mastering offensive abilities, Fighters are the embodiment of Glass Cannons.
                    (Glass cannons are characters or units with strong offensive power but lack defensive capabilities)
                    I wish you the best of luck with your adventure, %s.
                    """, p1.getName());
                    p1.setProfession("Fighter");
                    p1.setMaxHp(10);
                    p1.setHp(p1.getMaxHp());
                    p1.setXp(0);
                    p1.setAtk(3);
                    p1.setDef(1);
                    p1.setLevel(1);
                    charSelect = true;
                }
                case "guardian" -> {
                    System.out.printf("""
                    Ah, so you have chosen the path of the Guardian.
                    Mastering defensive abilities, Guardians are the embodiment of Titans.
                    I wish you the best of luck with your adventure, %s.
                    """, p1.getName());
                    p1.setProfession("Guardian");
                    p1.setMaxHp(15);
                    p1.setHp(p1.getMaxHp());
                    p1.setXp(0);
                    p1.setAtk(1);
                    p1.setDef(3);
                    p1.setLevel(1);
                    charSelect = true;
                }
                default -> System.out.printf("""
                I uh... don't know what to say %s, those are your only two choices...
                So... |Fighter| or |Guardian|?
                """, p1.getName());
            }
        }
        System.out.println("-------------------------------------------------------\n");
    }

    /*this is where we provide a story. A sense of adventure
    Why the player must fight for the Kingdom of Amouzia
    try to make it interesting later on.
    since this is a rough idea, we can just leave it small/minimal
    Maybe if they said Y to reincarnation give them a basic isekai (transported to another world) backstory?
    */
    private static void prologue() throws InterruptedException {
        Thread.sleep(10000);
        if (majorChoice) {
            System.out.print("""
                    Since you believe in reincarnation, let me see if I can get a read on your past life...
                    I see... oh that's terrible...
                    It seems you crossed the road and got hit by a truck, weren't you told to look both ways before crossing?
                    Right now, looks like you're in coma. Maybe you'll be able to find someone to help you, wake up?
                                        
                                        
                    """);
            //waits 5 seconds to print out the next text block
            //didn't want it to be the huge chunk of text
            Thread.sleep(10000);
            System.out.printf("""
                    Anyways %s, we need your help. I know I said we had some monsters in the mines but the truth is...
                    You might be the prodigal %s that we were told would come and save Amouzia Kingdom.
                    I know you're still processing the fact you got transported to another world but please, help us out.
                                        
                    """, p1.getName(), p1.getProfession());
        } else {
            System.out.printf("""
                    Perhaps you have forgotten where you are. You are in the Glorious Amouzia Kingdom!
                    Or so that's what I would before the Demon Lord had begun their attack on us.
                    
                    %s, we need your help. I know I said we had some monsters in the mines but the truth is...
                    You might be the prodigal %s that we were told would come and save Amouzia Kingdom.
                    You're probably wondering how I would know such a thing?
                    Well the marks on your body tell me everything.
                    Our prophecy states a marked person will bring justice on the Demon Lord.
      
                    """, p1.getName(), p1.getProfession());
        }
        System.out.print("""
                Before setting off to your adventure, lets try something.
                Here lets start with the basics, think and concentrate on the word |stats|.
                """);

        boolean statShowcase = false;
        while (!statShowcase) {
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("stats")) {
                checkStats();
                statShowcase = true;
            } else {
                System.out.println("Try again, remember to concentrate on the word |stats|");
            }
        }
        System.out.print("""
                Nicely done!
                Now go to the Mines of Solitude and start your adventure, %s!        
                """);
    }

    /*This is where we will do a small tutorial
    Just fight some monsters, get xp, and acquire skill points
    and then produce story
     */
    private static void adventureBegins() {
    }
}
