import java.util.Random;

public class Character {

    private String name;
    private int health;
    private int level;
    private int attackPower;


    Character(String name, int health, int attackPower, int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void attack(Character enemy) {
        Random rand = new Random();
        int randomDamage = rand.nextInt(attackPower);
        int totalDamage = (this.level * attackPower) + randomDamage;
        enemy.health -= totalDamage;
        System.out.println(name + " deals " + totalDamage + " damage to " + enemy.name + ".");
    }

    public boolean isAlive() {
        return health > 0;
    }


}

