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
 * constructor con los atributos propios y precio y peso heredados
 * @param resolucion
 * @param tdt
 * @param precio
 * @param peso 
 */
    public Television(int resolucion, boolean tdt, double precio, double peso) {
        super(precio, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }
/**
 * constructor con los atributos propios y heredados
 * @param resolucion
 * @param tdt
 * @param precio
 * @param color
 * @param consumo
 * @param peso 
 */
    public Television(int resolucion, boolean tdt, double precio, Color color, Consumo consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    
    
    
/**
 * metodo que calcula el precio final del televisor
 */
    @Override
    public double precioFinal(){
        if(resolucion>40){
            precio=(precio*.3)+precio;
        }
        if(tdt=true){
            precio+=50;
        }
        return precio;
    }
/**
 * retorna el valor de la recolucion
 * @return resolucion
 */
    public int getResolucion() {
        return resolucion;
    }
/**
 * retornaa si el televisor tiene codificador tdt o no
 * @return tdt
 */
    public boolean isTdt() {
        return tdt;
    }

    
    
}//Television
