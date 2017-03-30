/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicos;

/**
 *clase padre con los atributos y metodos de los electrodomesticos
 * @author Jonathan
 */
public class Electrodomestico {
    /**
     * atributo que cotiene el precio
     */
    private double precio;
    /**
     * atributo que contiene el color
     */
    private enum color {BLANCO,NEGRO,ROJO,AZUL,GRIS};
    /**
     * atributo qeu contiene el consumo energetico
     */
    private enum consumo {A,B,C,D,E,F};
    /**
     * atributo que contiene el peso
     */
    private double peso;
    
   
/**
 * construcor de la clase
 */
    public Electrodomestico() {
    }//constructor
    
    
/**
 * constructor con precio y peso
 * @param precio
 * @param peso 
 */
    
    
    public Electrodomestico(double precio, double peso) {
        this.precio = 100;
        this.peso = 5;
    }


    protected void comprobarConsumoEnergetico(){
        
    }//comprobarConsumoEnergetico
    
    protected void comprobarColor(){
        
    }//comprobarColor
    
    protected void precioFinal(){
        
    }//precioFinal
    
    /**
     * retorna el valor del precio
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }
/**
 * retorna el valor del peso
 * @return peso
 */
    public double getPeso() {
        return peso;
    }
    
    
    
    
}//electrodomesticos
