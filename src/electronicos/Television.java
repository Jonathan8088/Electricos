/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicos;

/**
 *clase hija de electrodomestico
 * @author Jonathan
 */
public class Television extends Electrodomestico{
    /**
     * atributo que contiene la resolucion del televisor
     */
    private int resolucion;
    /**
     * atributo que señala si el televisor tiene codificadorTDT o no
     */
    private boolean tdt;
/**
 * constructor con precio y peso
 * @param precio
 * @param peso 
 */
    public Television(double precio, double peso) {
        super(precio, peso);
    }
/**
 * constructor con resolucion y tdt
 * @param resolucion
 * @param tdt 
 */
    public Television(int resolucion, boolean tdt) {
        this.resolucion = 20;
        this.tdt = false;
    }
/**
 * metodo que calcula el precio final del televisor
 */
    @Override
    public void precioFinal(){
        
    }
/**
 * retorna el valor de la recolucion
 * @return resolucion
 */
    public int getResolucion() {
        return resolucion;
    }
/**
 * retorna si el televisor tiene codificador TDT o no
 * @return 
 */
    public boolean isTdt() {
        return tdt;
    }
    
    
}//Television
