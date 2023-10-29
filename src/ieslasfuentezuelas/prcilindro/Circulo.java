package ieslasfuentezuelas.prcilindro;
/*Clase Circulo.java*/
/**
 *clase <code>Circulo</code>. Implementa funciones para modificar y mostrar
 *el centro y el radio de un circulo, utilizando la clase Punto
 *@author Jesus Perez Zafra
 *@since 29/10/2023
 */
public class Circulo{
	
    /**
    *Dato miembro para el radio
    */
    private double radio;
    /**
     *Dato miembro para el centro, tipo de dato es de la clase Punto
     *@see ieslasfuentezuelas.prcilindro.Punto
    */
    private Punto centro;

    /**
     *Constructor por defecto
     *Crea con radio 0 y centro por defecto
     *llamando al constructor de @see ieslasfuentezuelas.prcilindro.Punto
    */
    public Circulo(){
    	this.radio=0;
    	this.centro = new Punto();
    }
	
    /**
     *Constructor que recibe dos argumentos
     *@param centro coordenadas del centro del círculo
     *@param radio valor del radio del círculo
     */
    public Circulo(Punto centro, double radio){
        this.radio=radio;
        this.centro=centro;
    }
	
    /**
     *Método que devuelve en centro del círculo
     *@return centro devuelve las coordedanadas del centro
     */
    public Punto getCentro(){
    	return centro;
    }
	
    /**
     *Método que devuelve el radio del círculo
     *@return radio devuelve el valor del radio del círculo
     */
    public double getRadio(){
    	return radio;
    }
	
    /**
     *Método para modificar el centro del círculo
     *@param p coordenadas del centro del círculo
     */
    void setCentro(Punto p){
        this.centro=p;
    }
	
    /**
     *Método para modificar el radio del círculo
     *@param r valor del radio del círculo
     */
    void setRadio(double r){
        this.radio=r;
    }
	
    /**
    *Método para trasladar una distancia "a" la abcisa
    *y una distancia "b" la ordenada del centro del círclo
    *por lo tanto se traslada el círculo.
    *@param a distancia a mover la abcisa
    *@param b distancia a mover la ordenada
    */
    public void trasladar(double a, double b){
        centro.trasladar(a,b);
    }
	
    /**
    *Método que devuelve una cadena con las coordenadas del centro y el radio
    *@return toString cadena que contiene las coordenadas del centro y el radio
    */
    @Override
    public String toString(){
    	String toString=centro.toString()+", el radio es "+getRadio();
  	return toString;
  }
		
	
}
