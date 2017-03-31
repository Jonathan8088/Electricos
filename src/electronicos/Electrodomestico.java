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
public abstract class Electrodomestico implements Electricos{
    /**
     * atributo que cotiene el precio
     */
    protected double precio=100;
    /**
     * atributo que contiene el color
     */
    private Color color=Color.BLANCO ;
    /**
     * atributo qeu contiene el consumo energetico
     */
    private Consumo consumo=Consumo.F;
    /**
     * atributo que contiene el peso
     */
    private double peso=5;
    
    private Consumo letra;
   
    private Color comprueba;
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
/**
 * constructor con todos los atributos
 * @param precio
 * @param color
 * @param consumo
 * @param peso 
 */
    public Electrodomestico(double precio, Color color, Consumo consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

/**
 * metodo que recibe una letra y comprueba si esta dentro de los valores del consumo electrico o no
 * @param letra
 * @return true o false
 */
    protected boolean comprobarConsumoEnergetico(Consumo letra){
        this.letra=letra;
        if(letra==consumo.A ||letra == consumo.B||letra == consumo.C||letra == consumo.D||letra == consumo.E||letra == consumo.F){
            return true;
        }//IF
        else{
            System.out.println("Color no valido");
            return false;
        }
    }//comprobarConsumoEnergetico
    /**
     * metodo que recibe un parametro de color y compruba si es valido o no
     * @param comprueba
     * @return ttrue o false
     */
    protected boolean comprobarColor(Color comprueba){
        this.comprueba=comprueba;
        if(color==color.azul || color == color.blanco|| color == color.gris|| color == color.negro|| color == color.rojo|| color == color.AZUL|| color == color.BLANCO|| color == color.GRIS|| color == color.NEGRO|| color == color.ROJO){
            return true;
        }//if
        else{
                return false;
                }        
    }//comprobarColor
    /**
     * metodo que calcula el precio final
     */
    @Override
    public double precioFinal(){
       if(peso>=0 || peso<=19){
           precio+=10;
       }//if
       else if(peso >=20 || peso<=49){
           precio+=50;
       }else if(peso >=50 || peso <=79){
           precio+=80;
       }else if(peso >80){
           precio+=100;
       }//if
       
       if(consumo==consumo.A){
           precio+=100;
       }else if(consumo == consumo.B){
           precio+=80;
       }else if(consumo == consumo.C){
           precio+=60;
       }else if(consumo==consumo.D){
           precio+=50;
       }else if(consumo== consumo.E){
           precio+=30;
       }else if(consumo==consumo.F){
           precio+=10;
       }//if
       
       return precio;
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

    public void setPeso(double peso) {
        this.peso = peso;
    }
/**
 * retorna el color
 * @return color
 */
    public Color getColor() {
        return color;
    }
/**
 * retorna el valor del consumo
 * @return consumo
 */
    public Consumo getConsumo() {
        return consumo;
    }

   
    
    
    
    
}//electrodomesticos
