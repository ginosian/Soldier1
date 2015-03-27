/**
 * Created by Martha on 27.03.15.
 */
public class Soldier {
    private String name;
    private int health;
    private int skill;
    private int damage;


    public Soldier(String name, int health, int skill, int damage) {
        this.name = name;
        this.health = health;
        this.skill = skill;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
