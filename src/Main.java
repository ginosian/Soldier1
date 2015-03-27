/**
 * Created by Martha on 27.03.15.
 */

/*unem zinvorner erku tesaki mek "melee" myus@ "ranget" krvox, amen mek@ karoxanuma hardzakvi hardzakveluc ira damage
* i chpov kyanqer@ ijacnum e, u amen mek@ uni arandzin skill
* ranget skill double gamage
* melee skill@ inq@ iren bujel inch vor qanaki
* es sillerin chance ka vor kashxaten*/

 public class Main {
    public static void main (String [] args){


        Melee melee = new Melee("Melee", 500,20, 10, 10);
        Ranget ranget = new Ranget("Ranget", 700, 30, 50, 15);
        do{
            if(melee.getHealth() > 0 && ranget.getHealth()>0){
            System.out.println("Melee's life pionts before fight " + melee.getHealth());
            melee.recieveDamage(ranget.damageSkillConstruction());
            System.out.println("Ranget hits  Melee");
            System.out.println("Melee's life points after fight " + melee.getHealth());
            }
            if(ranget.getHealth()>0 && melee.getHealth() > 0){
            System.out.println("Ranget's life point before fight " + ranget.getHealth());
            System.out.println("Now Melee hits Ranget");
            ranget.recieveDamage(melee.getDamage());
            System.out.println("Ranget's life point after fight " + ranget.getHealth());
            }
        }
        while (melee.getHealth() > 0 && ranget.getHealth() > 0);
        if(melee.getHealth() <= 0 || ranget.getHealth() <= 0){
            System.out.println("Fight is over");
            if(melee.getHealth() <= 0){
                System.out.println("Ranget win");
            } else if (ranget.getHealth() <= 0){
                System.out.println("Melee win");
            }
        }
    }
}
