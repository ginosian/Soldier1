import java.util.Random;

/**
 * Created by Martha on 27.03.15.
 */
public class Ranget extends Soldier {
    private int damageSkillRation;

    public Ranget(String name, int health, int skill, int damage, int damageSkillRation) {
        super(name, health, skill, damage);
        this.damageSkillRation = damageSkillRation;
    }

    public int damageSkillConstruction(){
        Random rand = new Random();
        int highEnd = 100; int lowEnd = 1;
        int random = rand.nextInt(highEnd - lowEnd) + lowEnd;
        if(random <= damageSkillRation){
            this.setDamage(this.getDamage()+this.getSkill());
        }
        return this.getDamage();
    }


    public void recieveDamage(int damage){
        this.setHealth(this.getHealth()- damage);
    }


    public int getDamageSkillRation() {
        return damageSkillRation;
    }

    public void setDamageSkillRation(int damageSkillRation) {

        this.damageSkillRation = damageSkillRation;
    }
}
