
package casoconejo;

public class Main {

    
    public static void main(String[] args) {
      
       
       Child child01 = new Child("Pepe");
       Child child02 = new Child("Sandra");
       
       child01.setRabbit("Rambo");
       child02.setRabbit("Colita");
       
       System.out.println(child01.showingCarrot());
       System.out.println(child02.showingCarrot());
       System.out.println(child01.touchingEar());
       System.out.println(child02.touchingEar());
       
       System.out.println(child01.getName());
    }
}
