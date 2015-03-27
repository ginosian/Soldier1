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


        Melee melee = new Melee("Melee", 500, 10, 1000, 90);
        Ranget ranget = new Ranget("Ranget", 700, 10, 50, 15);
        System.out.println("Melee life pionts before fight " + melee.getHealth());
        melee.recieveDamage(ranget.getDamage());
        System.out.println("Life points after fight " + melee.getHealth());


    }
}
