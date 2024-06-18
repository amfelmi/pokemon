public abstract class Pokemon{
    /* Will have the Stats and Methods:
    Stats:
    Name
    Type
    Level
    HP
    Attack
    Special Attack
    Speed
    Defence
    Special Defence

    Methods: (This is in contention as this could be coded into another class as attacks are different)
    Move set
     */
    protected String name;

    protected String type;

    protected int level;
    protected int hp;
    protected int attack;
    protected int spAttack;
    protected int speed;
    protected int defence;
    protected int spDefence;

    public Pokemon(String name, String type, int level, int hp, int attack, int spAttack, int defence, int spDefence) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.attack = attack;
        this.spAttack = spAttack;
        this.defence = defence;
        this.spDefence = spDefence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpDefence() {
        return spDefence;
    }

    public void setSpDefence(int spDefence) {
        this.spDefence = spDefence;
    }
}
