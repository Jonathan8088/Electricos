/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicos;



/**
 *
 * @author Jonathan
 */
public class Electronicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico elec = new Television(50,true,100,Color.GRIS,Consumo.A,80);
        System.out.println("el precio es: "+elec.precioFinal());
    }

}
