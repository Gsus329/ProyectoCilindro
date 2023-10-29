package ieslasfuentezuelas.prcilindro;

/*Clase Cilindro.java*/
/**
 *clase <code>Cilindro</code>. Implementa funciones para mostrar y modificar
 *la base y la altura de un cilindro, utilizando las clases Circulo y Punto
 *@author Jesus Perez Zafra
 *@since 29/10/2023
 */
public class Cilindro{
    /**
     *Dato miembro para la altura del cilindro
     */
    private double altura;
    /**
     *Dato miembro para la base del círculo, tipo de dato es
     *de la clase Circulo
     *@see ieslasfuentezuelas.prcilindro.Circulo
     */
    private Circulo base;

    /**
     *Constructor sin argumentos
     */
    public Cilindro(){
    	this.altura=0;
    	this.base=new Circulo();
    }
	
    /**
     *Constructor que recibe dos argumentos
     *@param b la base del cilindro
     *@param a la altura del cilindro
     */
    public Cilindro(Circulo b, double a){
    	this.base=b;
    	this.altura=a;
    }
	
    /**
     *Método que devuelve la base del cilindro: centro y radio del
     *círculo que hace de base
     *@return base base del cilindro
     */
    public Circulo getBase(){
    	return base;
    }
	
    /**
     *Método que devuelve la altura del cilindro
     *@return altura devuelve el valor de la altura del cilindro
     */
    public double getAltura(){
    	return altura;
    }
	
    /**
     *Método que cambia la base del cilindro
     *@param base nueva base del cilindro
     */
    public void setBase(Circulo base){
           this.base=base;
    }
	
    /**
     *Método que cambia la altura del cilindro
     *@param altura nueva altura del cilindro
     */
    public void setAltura(double altura){
    	this.altura=altura;
    }
	
    /**
     *Método para trasladar el cilindro, es decir, traslada
     *las coordenadas del centro de la base
     *@param a distancia a mover la abcisa
     *@param b distancia a mover la ordenada
     */
    public void trasladar(double a, double b){
    	base.trasladar(a,b);
    }
	
    /**
     *Método para mostrar la representación del cilindro
     *@return toString devuelve la cadena que contiene las características
     *del cilindro
     */
    @Override
    public String toString(){
    	String toString=base.toString()+", y la altura "+this.altura;
    	return toString;
    }
}
