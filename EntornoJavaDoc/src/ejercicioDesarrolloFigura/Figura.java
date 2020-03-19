package ejercicioDesarrolloFigura;

/**
 * La clase Figura sirve como clase para la definición de objetos de tipo Figura
 * compuestos por su color y su forma. Esta clase proporciona la forma de la
 * figura y su color.
 * 
 * @version 1.0.
 * @author sakina
 *
 */
public class Figura {
	private String forma;
	private String color;
	private static final String ListaColores[] = { "rojo", "anaranjado", "amarillo", "verde", "azul", "violeta", "rosa",
			"negro", "blanco", "oro", "plata", "bronce" };

	/**
	 * Constructor por defecto de clase Figura.
	 */

	public Figura() {

	}

	/**
	 * Constructor. Crea un objeto de tipo Figura dado su forma y su color.
	 * 
	 * @param forma Forma de la figura
	 * @param color Color de la figura
	 */
	public Figura(String forma, String color) {
		this.forma = "";
		this.color = "";
	}

	/**
	 * Constructor. Crea un objeto de tipo Figura dado su forma y el numero de
	 * color.
	 * 
	 * @param forma Forma de la figura
	 * @param color Numero de color de la figura asociado a la posicion en el array
	 */
	public Figura(String forma, int color) {
		this.forma = forma;
	}

	/**
	 * getForma obtiene la forma del objeto referenciado
	 * 
	 * @return forma Devuelve la forma de la figura
	 */
	public String getForma() {
		return forma;
	}

	/**
	 * setForma fija la forma del objeto figura
	 * 
	 * @param forma Forma de la figura
	 */
	public void setForma(String forma) {
		this.forma = forma;
	}

	/**
	 * getColor devuelve el color del objeto figura.
	 * 
	 * @return color Color de la figura
	 */
	public String getColor() {
		return color;
	}

	/**
	 * validColor obtiene el color cuyo numero este entre el cero y la cantidad de
	 * posiciones del array ListaColores sin incluir ambos.
	 * 
	 * @param color Numero de color asociado a la posicion en el array
	 * @return color Numero de color entre el 0 y el tamaño max del array
	 */

	public static boolean validColor(int color) {
		return color > 0 && color < ListaColores.length;
	}

	/**
	 * validColor comprueba que el color que se le pasa por parametro está dentro
	 * del array ListaColores y devuelve un true o en su defecto, false
	 * 
	 * @param color Color de la figura
	 * @return isValid devuelve true o false
	 */

	public static boolean validColor(String color) {
		boolean isValid = false;
		for (int i = 0; i < ListaColores.length && !isValid; i++) {
			isValid = ListaColores[i] == color;
		}
		return isValid;
	}

	/**
	 * setColor fija el color si este es validado previamente llamando a otro metodo
	 * 
	 * @param color Color de la figura
	 */
	public void setColor(String color) {
		if (validColor(color)) {
			this.color = color;
		}

	}

	/**
	 * setColor valida el color pasado por parametro llamando a otro metodo, y si
	 * este devuelve true llama otro metodo pasandole el color para obtener la
	 * posicion de este en el array
	 * 
	 * @param color Numero de podicion del color asociado a la posicion en el array
	 */
	public void setColor(int color) {
		if (validColor(color)) {
			this.color = colorToColor(color);
		}
	}

	/**
	 * colorToColor recibe un color por parametro y devuelve la posicion del array
	 * en la que se encuentra almacenado el color buscado. En caso de que ese color
	 * no se encuentrara, devuelve -1
	 * 
	 * @param color Nombre del color de la figura
	 * @return posicion Posicion donde se encuentra el color o en su defecto -1
	 */
	private int colorToColor(String color) {
		int posicion = -1;
		for (int i = 0; i < ListaColores.length && posicion != -1; i++) {
			if (ListaColores[i] == color) {
				posicion = i;
			}
		}
		return posicion;
	}

	/**
	 * colorToColor devuelve el color que se encuentra en dicha posicion si cumple
	 * con la condicion de que el parametro pasado sea mayor que cero o menor que el
	 * tamaño del array, si no es asi devuelve un espacio en blanco
	 * 
	 * @param color Posicion del color en el array
	 * @return color Devuelve el color asociado a la posicion pasada, en su defecto
	 *         devuelve un espacio
	 */

	private String colorToColor(int color) {
		return color > 0 && color < ListaColores.length ? ListaColores[color] : "";
	}
}
