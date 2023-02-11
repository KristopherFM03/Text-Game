/**
 * Kristopher Fierro-Marin
 * 2/10/23
 * A file that contains Enemy info
 */

public class Enemy {
    private String name;
    private int hp;
    private int maxHp;
    private int atk;
    private int def;
    private int level;
    private boolean isAlive;

    //initializing a Bat, Slime and our first boss Skeleton King
    public void Bat() {
        name = "Bat";
        hp = 10;
        maxHp = 10;
        atk = 1;
        def = 1;
        level = 1;
        isAlive = true;
    }
    public void Slime() {
        name = "Green Slime";
        hp = 15;
        maxHp = 10;
        atk = 0;
        def = 1;
        level = 1;
        isAlive = true;

    }
    public void SkeletonKing() {
        name = "SKELETOR";
        hp = 40;
        maxHp = 40;
        atk = 5;
        def = 5;
        level = 4;
        isAlive = true;
    }


    /* Getters & Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
