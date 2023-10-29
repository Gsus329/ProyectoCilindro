/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieslasfuentezuelas.prcilindro;


//Aplicación para probad las clases creadas
public class TestCilindro{
    public static void main(String[] args){
	//crea el punto que hará de centro
	Punto centroBase=new Punto(3.0, 5.0);
	//crea el circulo que hará de base
	Circulo base=new Circulo(centroBase, 4.0);
	//crea el cilindro miCilindro
	Cilindro miCilindro=new Cilindro(base, 10.0);
	//Imprime las caracteristicas de miCilindro
	System.out.println("Mi cilindro base:\n"+miCilindro.toString());
	//Traslada el cilindro dos unidades en abcisas
	//y en ordenadas
	miCilindro.trasladar(2.0, 2.0);
	//Imprime las nuevas caracteristicas de miCilindro
	System.out.println("Mi cilindro trasladado 2 y 2:\n"+
                miCilindro.toString());
	//Imprime un nuevo cilindro
	System.out.println("Nuevo cilindro:\n"+
        new Cilindro(new Circulo(new Punto(4.0, 6.0), 5.0), 11.0).toString());
	//calculo de la distancia entre el origen y el centroBase
	Punto origen=new Punto(0.0, 0.0);
	System.out.println("La distancia entre el origen P(0,0) y "+
                centroBase.toString()+" es "+centroBase.distancia(origen));
		
	}
}

