
package models;


public class Wineglass {
  private boolean poisoned; 

    public Wineglass() {
        this.poisoned = false;
    }

    public boolean isPoisoned() {
        return poisoned;
    }

    public void setPoisoned() {
        this.poisoned = true;
    }        
}
