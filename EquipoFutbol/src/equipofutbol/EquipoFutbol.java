/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbol;

/**
 *
 * @author pcsidsub
 */
public class EquipoFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player1 = new Player("Carlos");
        System.out.println(player1.getNumber());
        Player player2 = new Player("Miguel");
        System.out.println(player2.getNumber());
         Player player3 = new Player("Jorge");
        System.out.println(player3.getNumber());
        
        Printer.printName(player1);
               
    }
}
