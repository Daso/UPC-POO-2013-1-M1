
package equipofutbol;


public class Player {
    private String name;
    private static int number;

    public Player(String name) {
        this.name = name;
        numberGenerator();
    }
    
    public void numberGenerator(){
        number = number + 1;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    
    
    
    
}
