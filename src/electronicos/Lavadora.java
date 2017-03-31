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
public class Lavadora extends Electrodomestico{
    /**
     * atributo que contiene la carga de la lavadora
     */
    private  int carga;
    
    private int CARGADEFECTO=5;
/**
 * constructor con el precio y peso
 * @param precio
 * @param peso 
 */
    public Lavadora(double precio, double peso) {
        super(precio, peso);
    }
/**
 * constructor con carga peso y precio
 * @param carga
 * @param precio
 * @param peso 
 */
    public Lavadora(int carga, double precio, double peso) {
        super(precio, peso);
        this.carga = carga;
    }

    
/**
 * metodo que calcula el precio final de la lavadora
 */
    @Override
    public void precioFinal(){
        
    }//precioFinal
/**
 * retorna el valor de la carga
 * @return carga
 */
    public int getCarga() {
        return carga;
    }
    
    
    
}//Lavadora
