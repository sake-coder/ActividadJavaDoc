package ejerciciosDesarrolloClase;

/**
 * La clase Empleado sirve como clase para la definición de objetos de tipo
 * empleado dados por su DNI, el nombre del empleado, la fecha de alta en la
 * empresa y el codigo de empleado que se le asigna segun el oficio que tenga.
 *  
 * @version 1.0.
 * @author sakina
 *
 */
public class Empleado {
	private String DNI;
	private String nombre;
	private String fechaAlta;
	private int codigoEmpleado;

	public Empleado() {

	}

	/**
	 * Contructor. Construye un objeto de tipo Empleado dado su DNI, nombre, la
	 * fecha en la que se da de alta y el codigo de empleado
	 * 
	 * @param DNI            Numero de documento de identidad
	 * @param nombre         Nombre del empleado
	 * @param fecha          Fecha en la que se da de alta en la empresa
	 * @param codigoEmpleado Codigo o numero de empleado
	 */
	public Empleado(String DNI, String nombre, String fecha, int codigoEmpleado) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.fechaAlta = fecha;
		this.codigoEmpleado = codigoEmpleado;
	}

	/**
	 * @return devuelve la cadena a imprimir con los datos del empleado
	 * @see toString <a
	 *      href="https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#toString()"/a>
	 * 
	 */
	public String toString() {
		String aux;
		aux = ("DNI: " + this.DNI + " Nombre: " + this.nombre + " Fecha Alta: " + this.fechaAlta + " Tipo Empleado:"
				+ getTipoEmpleado() + " Codigo empleado: " + this.codigoEmpleado);
		return aux;
	}

	/**
	 * Metodo utilizado para asignar el mismo DNI al objeto referenciado que el
	 * objeto Empleado que se le pasa por parametro
	 * 
	 * @param e Objeto de tipo Empleado
	 * @return DNI Devuelve el DNI asignado
	 */
	public boolean equals(Empleado e) {
		return this.DNI == e.getDNI();
	}

	/**
	 * getNombre obtiene el nombre del objeto referenciado
	 * 
	 * @return Nombre Devuelve el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setNombre fija el nombre del objeto referenciado
	 * 
	 * @param nombre Nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getFechaAlta obtiene la fecha de alta del objeto referenciado
	 * 
	 * @return fechaAlta Devuelve la fecha de alta en la empresa
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * setFechaAlta fija la fecha de alta en la empresa del objeto referenciado
	 * 
	 * @param fechaAlta Fecha de alta en la empresa
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * setCodigoEmpleado disntigue entre el tipo de oficio y le asigna un codigo
	 * diferente segun el oficio que sea
	 * 
	 * @param tipoEmpleado indica el tipo de oficio
	 */
	public void setCodigoEmpleado(String tipoEmpleado) {

		if (tipoEmpleado.toLowerCase().contains("analista")) {
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("programador") ? 1299 : 1255;
		} else if (tipoEmpleado.toLowerCase().contains("programador")) {
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1555 : 1599;
		} else if (tipoEmpleado.toLowerCase().contains("administrador")) {
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1955 : 1999;
		}

	};

	/**
	 * getTipoEmpleado obtiene el oficio del empleado a partir del codigo de
	 * empleado
	 * 
	 * @return aux devuelve el oficio
	 */
	public String getTipoEmpleado() {
		String aux = "";
		switch (this.codigoEmpleado) {
		case 1255:
			aux = "ANALISTA";
			break;
		case 1299:
			aux = "ANALISTA-PROGRAMADOR";
			break;
		case 1555:
			aux = "PROGRAMADOR SENIOR";
			break;
		case 1599:
			aux = "PROGRAMADOR JUNIOR";
			break;
		case 1955:
			aux = "ADMINITRADOR JUNIOR";
			break;
		case 1999:
			aux = "ADMINITRADOR JUNIOR";
			break;
		}
		return aux;
	}

	/**
	 * getCodigoEmpleado obtiene el codigo del empleado
	 * 
	 * @return codigoEmpleado codigoEmpleado
	 */
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	/**
	 * setCodigoEmpleado fija el codigo de empleado al objeto referenciado
	 * 
	 * @param codigooEmpleado codigo de empleado
	 */
	public void setCodigoEmpleado(int codigooEmpleado) {
		this.codigoEmpleado = codigooEmpleado;
	}

	/**
	 * setDNI fija el DNI del objeto empleado referenciado
	 * 
	 * @param DNI Documento de identidad del empleado
	 */

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	/**
	 * getDNI obtiene el DNI del objeto empleado referenciado
	 * 
	 * @return DNI Documento de identidad del empleado
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * compareTo compara la longitud de la cadena DNI con la cadena Fecha, si son
	 * diferentes, se restan las longitudes, si son iguales devuelve cero.
	 * 
	 * @param fecha
	 * @return dif devuelve la diferencia entre dos longitudes o en su defecto, 0
	 */
	public int compareTo(String fecha) {
		int dif;
		int f1 = this.getDNI().length();
		int f2 = fecha.length();
		dif = (f1 != f2) ? f1 - f2 : 0;
		return dif;
	}

}
