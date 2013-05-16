package casoconejo;


public class Rabbit {
    private String name;

    public Rabbit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String movingTail(){
        return "Soy " + name + " y estoy moviendo la colita";
    }
    
    public String getCloser(){
        return "Soy " + name + " y me estoy acercando";
    }
}
