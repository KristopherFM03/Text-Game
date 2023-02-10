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
    private  String name;
    private  String profession;
    private  int hp;
    private  int maxHp;
    private  int xp;
    private  int atk;
    private  int def;
    private  int level;

    //initializing the player class
    public Player() {
        level = 1;
    }

    /* Getters & Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int lvl) {
        this.level = lvl;
    }
}