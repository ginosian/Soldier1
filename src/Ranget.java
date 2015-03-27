/**
 * Created by Martha on 27.03.15.
 */
public class Ranget extends Soldier {
    private int damageSkillRation;

    public Ranget(String name, int health, int skill, int damage, int damageSkillRation) {
        super(name, health, skill, damage);
        this.damageSkillRation = damageSkillRation;
    }

    public int getDamageSkillRation() {
        return damageSkillRation;
    }

    public void setDamageSkillRation(int damageSkillRation) {

        this.damageSkillRation = damageSkillRation;
    }
}
