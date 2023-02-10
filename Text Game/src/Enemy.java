public class Enemy {
    private String name;
    private int hp;
    private int maxHp;
    private int atk;
    private int def;
    private int level;
    private boolean isAlive;

    //initializing the player class
    public Enemy() {
        hp = 10;
        maxHp = 10;
        atk = 1;
        def = 1;
        //make it so that when a player fights an enemy they will be the same level
        //will be like bat.setLevel(p1.getLevel)
        level = 1;
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
