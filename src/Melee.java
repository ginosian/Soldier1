import java.util.Random;

/**
 * Created by Martha on 27.03.15.
 */
public class Melee extends Soldier {
    private int defenceSkillRatio;

    public Melee(String name, int health, int skill, int damage, int defenceSkillRatio) {
        super(name, health, skill, damage);
        this.defenceSkillRatio = defenceSkillRatio;
    }

    public void recieveDamage(int damage){
        Random rand = new Random();
        int highEnd = 100; int lowEnd = 1;
        int random = rand.nextInt(highEnd - lowEnd) + lowEnd;
        if(random <= this.defenceSkillRatio){
            this.setHealth(this.getHealth()+this.getSkill()-damage);
        } else {
            this.setHealth(this.getHealth()- damage);
        }


    }

    public int getDefenceSkillRatio() {
        return defenceSkillRatio;
    }

    public void setDefenceSkillRatio(int defenceSkillRatio) {
        this.defenceSkillRatio = defenceSkillRatio;
    }
}

