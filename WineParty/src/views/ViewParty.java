
package views;

import controllers.ControllerParty;

public class ViewParty {
    
    ControllerParty party = new ControllerParty();
    
    private void myPrint(String message){
        System.out.println(message);
    }
    
    public void partyPresentation(){
        myPrint("----------------------------");
        myPrint("----------------------------");
        myPrint("     Fiesta del vino        ");
        myPrint("----------------------------");
        myPrint("----------------------------");    
        myPrint(party.drinkerStatus());
    }
    
    
            
    
    
    
}
