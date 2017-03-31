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
    
    private Electrodomestico[] electrodomesticos;
    private static double total=0;
    private static double televisores=0;
    private static double lavadoras=0;

    
    public static void main(String[] args) {
        Electrodomestico[]  electrodomesticos= new Electrodomestico[10];
        Electrodomestico tele1 = new Television(50,true,180,Color.GRIS,Consumo.A,80);
        Electrodomestico lava1 = new Lavadora(50,200,80);
        Electrodomestico tele2 = new Television(50,true,150,Color.AZUL,Consumo.A,80);
        Electrodomestico lava2 = new Lavadora(50,300,80);
        Electrodomestico tele3 = new Television(50,false,100,Color.GRIS,Consumo.A,80);
        Electrodomestico lava3 = new Lavadora(50,190,80);
        Electrodomestico tele4 = new Television(50,true,150,Color.BLANCO,Consumo.A,80);
        Electrodomestico lava4 = new Lavadora(50,150,80);
        Electrodomestico tele5 = new Television();
        Electrodomestico lava5 = new Lavadora();
        
        electrodomesticos[0]=tele1;
        electrodomesticos[1]=lava1;
        electrodomesticos[2]=tele2;
        electrodomesticos[3]=lava2;
        electrodomesticos[4]=tele3;
        electrodomesticos[5]=lava3;
        electrodomesticos[6]=tele4;
        electrodomesticos[7]=lava4;
        electrodomesticos[8]=tele5;
        electrodomesticos[9]=lava5;
        
        for(int i=0;i<10;i++){
            System.out.println("el precio es: "+electrodomesticos[i].precioFinal());
            total+=electrodomesticos[i].precioFinal();
        }
        System.out.println("El precio de todos los electrodomesticos es: "+total);
        
    }

}
