
package wineparty;

import models.Drinker;
import models.Wineglass;


public class WineParty {

    
    public static void main(String[] args) {
        Wineglass copa01 = new Wineglass();
        System.out.println(copa01.isPoisoned());
        copa01.setPoisoned();
        System.out.println(copa01.isPoisoned());
        
        Drinker drinker = new Drinker("Miguel");
        System.out.println(drinker.getName());
        System.out.println(drinker.isAlive());
        drinker.setDead();
        System.out.println(drinker.isAlive());
        
        
    }
}
