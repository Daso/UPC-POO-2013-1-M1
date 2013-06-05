package controllers;

import models.Drinker;
import models.Wineglass;

public class ControllerParty {
    
    private Drinker[] drinkers;
    private Wineglass[] wineglasses;

    public ControllerParty() {
         drinkers = new Drinker[4];
         wineglasses = new Wineglass[4];
         createDrinkers();
         createWineglass();
         poisonWineglass();
         setParty();
    }

    public Drinker[] getDrinkers() {
        return drinkers;
    }
    
    
    
    private void createDrinkers(){      
      drinkers[0] = new Drinker("Sir Percival");
      drinkers[1] = new Drinker("Lady Gaga");
      drinkers[2] = new Drinker("Sir Francis");
      drinkers[3] = new Drinker("Lady Estefania");              
    }
    
    private void createWineglass(){
        wineglasses[0] = new Wineglass();
        wineglasses[1] = new Wineglass();
        wineglasses[2] = new Wineglass();
        wineglasses[3] = new Wineglass();
    }
    
    private int randomGenerator(){
        return (int)Math.round(Math.random()*3);
    }
    
    private void poisonWineglass(){
        int index = randomGenerator();
        wineglasses[index].setPoisoned();
    }
    
    private void setParty(){
      for(int i = 0; i < 4; i++){        
          drinkers[i].drinkWine(wineglasses[i]);      
      }    
    }
    
    private String setStatusToText(boolean status){
        if(status){
            return "vivo";
        }else{
            return "muerto";
        }
    }
    
    public String drinkerStatus(){
        String message = " ";
        for(int i = 0; i < 4; i++){        
         message += " Soy " + this.drinkers[i].getName() + " y estoy " + setStatusToText(drinkers[i].isAlive())+ "\n";     
      }   
        return message;
        
    }
    
}
