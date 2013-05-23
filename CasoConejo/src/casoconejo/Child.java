package casoconejo;

public class Child {
    
 private String name;
 private int age;
 private Rabbit rabbit;

 public Child(String name) {
   this.name = name;
 }

    public void setRabbit(String name) {
        rabbit = new Rabbit(name);
    }

 
 
   public String getName() {
        return name;
    }
/*
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
*/
    public String showingCarrot(){
        String message = rabbit.getCloser();
        return "Soy "+ name +" y le estoy mostrando una zanahoria " + message;
        
    }
    
    public String touchingEar(){
        String message = rabbit.movingTail();
        return "Soy " + name + " y le estoy tocando la oreja " + message;
    }
 
 
}
