
package ieslasfuentezuelas.prcilindro;

/*Clase Punto.java*/
/**
 *clase <code>Punto</code>. Implementa funciones necesarias para modificar y 
 *mostrar las coordenadas de un punto que se utlizará como centro de un círculo.
 *@author Jesus Perez Zafra
 *@since 29/10/2023
 */
public class Punto {
	/**
	 * Atributo para la abcisa
	 * 
	 */
    private double x;
    /**
     * Atributo para ordenada
     */
    private double y;
/**
 * Contructor por defecto
 * Configura el punto en (0,0)
 */
    public Punto(){
        this.x=0;
        this.y=0;
    }
    /**
     * Constructor donde se le pasa coordenadas
     * @param x abcisa del punto
     * @param y ordenada del punto
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Getter de la abcisa
     * @return abcisa
     */
    public double getX(){
        return x;
    }
    /**
     * Getter de la ordenada
     * @return ordenada
     */
    public double getY(){
        return y;
    }
    /**
     * Setter de la abcisa
     * @param x nueva coordenada x
     */
    public void setX(double x){
        this.x=x;
    }
    /**
     * Setter de la ordenada
     * @param y nueva coordenada y
     */
    public void setY(double y){
        this.y=y;
    }
   /**
   *Metodo para calcular la distancia entre un punto cualquiera p, y 
   *el punto que va a hacer de centro del circulo
   *@param p punto nuevo para calcular distancia desde el centro del circulo
   *@return d devuleve la distancia entre los dos puntos
   */
    public double distancia(Punto p){
        double d;
        d=Math.sqrt(((p.x-this.x)*(p.x-this.x))+((p.y-this.y)*(p.y-this.y)));
        return d;
    }
    
    /**
   *Metodo para trasladar una distancia "a" la abcisa
   *y una distancia "b" la ordenada
   *@param a distancia a mover la abcisa
   *@param b distancia a mover la ordenada
   */
  public void trasladar(double a, double b){
  		this.x+=a;
  		this.y+=b;
  }
   /**
   *Metodo que devuelve una cadena con las coordenadas del punto
   *@return toString cadena que contiene las coordenadas del punto
   */
    
    @Override
    public String toString(){
    	String toString="Centro("+this.x+", "+this.y+")";
  	return toString;
  } 
}
