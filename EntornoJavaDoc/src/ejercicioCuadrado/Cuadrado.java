package ejercicioCuadrado;

/**
 * La clase cuadrado sirve como clase para la definición de objetos de tipo
 * cuadrado creados a partir de coordenadas. Esta clase proporciona la longitud
 * de los lados, la representación gráfica de este y su respectiva comparación
 * con otro objeto del tipo cuadrado.
 * 
 * @version 1.0.
 * @author sakina
 *
 */
public class Cuadrado {
	private int x1, y1, x2, y2, x3, y3, x4, y4;

	/**
	 * Constructor. Se crea un objeto de tipo cuadrado asociando sus lados con las
	 * dadas las ocho coordenadas
	 * 
	 * @param _x1 Coordenada x1
	 * @param _y1 Coordenada y1
	 * @param _x2 Coordenada x2
	 * @param _y2 Coordenada y2
	 * @param _x3 Coordenada x3
	 * @param _y3 Coordenada y3
	 * @param _x4 Coordenada x4
	 * @param _y4 Coordenada y4
	 */

	public Cuadrado(int _x1, int _y1, int _x2, int _y2, int _x3, int _y3, int _x4, int _y4) {
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
		x3 = _x3;
		y3 = _y3;
		x4 = _x4;
		y4 = _y4;
	}

	/*
	 * Método modulo
	 */
	/**
	 * El metodo distancia obtiene la distancia entre los cuatro puntos dados por
	 * parametro.
	 * 
	 * @param cx1 Punto en x1
	 * @param cy1 Punto en y1
	 * @param cx2 Punto en x2
	 * @param cy2 Punto en y2
	 * @return valor distancia devuelve el calculo para obtener la distancia entre 4
	 *         puntos.
	 */
	private double distancia(int cx1, int cy1, int cx2, int cy2) {
		return Math.sqrt((cx2 - cx1) * (cx2 - cx1) + (cy2 - cy1) * (cy2 - cy1));
	}

	/**
	 * lado devuelve la longitud de un lado, al ser un cuadrado en el metodo
	 * enviamos cuatro puntos predeterminados llamando al metodo distancia() y
	 * pasandole por parametro los 4 puntos.
	 * 
	 * @return distancia devuelve la distancia
	 */

	public double lado() {
		// Asumimos que ya es un cuadrado y nos da lo mismo devolver cualquier lado
		// teniendo en cuenta que tienen que ser correlativos
		return distancia(x1, y1, x2, y2);
	}

	/*
	 * Método esCuadrado
	 */
	/**
	 * esCuadrado devuelve true si las distancias son iguales haciendo uso del
	 * metodo distancia y pasandole por parametro 4 puntos de
	 * 
	 * @return true si la distancia de todos los lados coinciden y false si no es
	 *         asi.
	 */
	public boolean esCuadrado() {
		return (distancia(x1, y1, x2, y2) == distancia(x2, y2, x3, y3)
				&& distancia(x2, y2, x3, y3) == distancia(x3, y3, x4, y4)
				&& distancia(x3, y3, x4, y4) == distancia(x4, y4, x1, y1)) ? true : false;
	}

	/*
	 * Método dibujar
	 */

	/**
	 * dibujar dibuja el perimetro del cuadrado recorriendo con un bucle la longitud
	 * de los lados y dibujando un asterisco por cada unidad de medida
	 * 
	 */
	public void dibujar() {
		// Calculamos el valor del lado de nuesto cuadrado:

		double lado = lado();

		// System.out.println("El lado vale lado " + lado);
		for (int i = 0; i < lado; i++)
			System.out.print("* ");

		System.out.println();

		for (int j = 0; j < lado - 2; j++) {
			System.out.print("*");

			for (int i = 0; i < lado - 2; i++)
				System.out.print("  ");

			System.out.print(" *");
			System.out.println();
		}

		for (int i = 0; i < lado; i++)
			System.out.print("* ");

		System.out.println();

	}

	/*
	 * Método dibRellenando
	 */
	/**
	 * Dibuja el cuadrado rellenando con asteriscos tanto el area como el perimetro.
	 */
	public void dibRellenando() {

		double lado = lado();

		for (int j = 0; j < lado; j++) {
			for (int i = 0; i < lado; i++)
				System.out.print("* ");
			System.out.println();
		}

	}

	/*
	 * Método dibujarVertices
	 */
	/**
	 * Comprueba si es un cuadrado, si es así sitúa cada intervalo de los vertices
	 * en su posicion en el eje simulando un cuadrado. En caso de que no sea un
	 * cuadrado, imprime un mensaje indicando que no lo es.
	 */
	public void dibujarVertices() {
		if (esCuadrado()) {
			double lado = lado();

			System.out.printf("(%1d, %2d)", x2, y2);
			for (int i = 1; i < lado - 1; i++)
				System.out.print("  ");
			System.out.printf("(%1d, %2d)%n", x3, y3);
			for (int j = 0; j < lado - 2; j++) {
				for (int i = 0; i < lado; i++)
					System.out.print("  ");

				System.out.println();
			}
			System.out.printf("(%1d, %2d)", x1, y1);
			for (int i = 0; i < lado - 2; i++)
				System.out.print("  ");
			System.out.printf("(%1d, %2d)", x4, y4);
			System.out.println();
		} else
			System.out.println("¡No es un cuadrado!");
	}

	/**
	 * Calcula el area del cuadrado llamando al metodo lado para obtener la longitud
	 * de un lado y multiplicarlo por si mismo, devolviendo el area
	 * 
	 * @return l*l el calculo del area.
	 */

	private double area() {
		// Habría que plantearse un método que devuelva el lado sin
		// pasar parámetros, una vez comprobado que, efectivamente se trata de un
		// cuadrado
		double l = lado();
		return l * l;
	}

	/*
	 * Método compara
	 */
	/**
	 * Compara un objeto pasado por parametro con el objeto con el que se llama al
	 * metodo devolviendo un 1 si es menor que el thiscuadrado y -1 si es mayor.
	 * 
	 * @param c Objeto de tipo Cuadrado a comparar con el this
	 * @return 1 si el primer cuadrado es mayor que el segundo
	 */

	public int compara(Cuadrado c) {
		int resultadoComp = 0;

		if (area() > c.area())
			resultadoComp = 1;
		else if (area() < c.area())
			resultadoComp = -1;

		return resultadoComp;
	}

	/*
	 * Método toString
	 */
	/**
	 * @return devuelve la cadena a imprimir con los intervalos de los vertices
	 * @see toString <a
	 *      href="https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#toString()"/a>
	 * 
	 */
	public String toString() {
		return "Cuadrado definido por los vértices: (" + x1 + "," + y1 + ") " + " (" + x2 + "," + y2 + ") " + " (" + x3
				+ "," + y3 + ") " + " (" + x4 + "," + y4 + ")";
	}
}
