
package models;


public class Drinker {
    private String name;
    private boolean alive;

    public Drinker(String name) {
        this.name = name;
        this.alive = true;
    }

    public String getName() {
        return name;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    public void setDead(){
        this.alive = false;
    }

    
    
}
