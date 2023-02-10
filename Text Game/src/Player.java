/**
 * Kristopher Fierro-Marin
 * 2/9/23
 * A file that contains the Player's info
 * */


/* Going to make an entire new file just for the Player object so, it doesn't become cramped.
    Will need to do the same for enemies but, we'll cross that bridge later.

    filename: Player.java
*/


public class Player {
    public static String name;
    public static String profession;
    public static int HP;
    public static int maxHP;
    public static int XP;
    public static int ATK;
    public static int DEF;
    public static int LVL;

    //initializing the player class
    public Player() {
        HP = maxHP;
        LVL = 1;
    }
    /* Getters & Setters */
    public int getHp() {
        return HP;
    }
    public void setHP(int hp) {
        HP = hp;
    }
    public int getLvl() {
        return HP;
    }
    public void setLvl(int lvl) {
        LVL = lvl;
    }


}