package ejercicioAlumno;

/**
 * La clase alumno sirve para crear objetos de tipo alumno y almacenar datos
 * como el numero de expediente, el nombre, las asignaturas y sus respectivas
 * notas
 * 
 * @author sakina
 * @version 1.0.
 *
 */

public class Alumno 
{
	private int numExpediente;
	private String nombre;
	private String[] asignaturas;
	private int[] notas;
	
	/**
	 * Constructor. Se crea un objeto de tipo alumno que contiene un array con las distintas asignaturas 
	 * y otro de notas 
	 */

	public Alumno() 
	{
		asignaturas = new String[11];
		asignaturas[0] = new String("Desarrollo de aplicaciones en el servidor");
		asignaturas[1] = new String("Desarrollo de aplicaciones web en el cliente");
		asignaturas[2] = new String("Despliegue de aplicaciones");
		asignaturas[3] = new String("Diseño de interfaces");
		asignaturas[4] = new String("Acceso a datos");
		asignaturas[5] = new String("Programación de servicios y procesos");
		asignaturas[6] = new String("Programación multimedia y de móviles");
		asignaturas[7] = new String("Sistemas de gestión empresarial");
		asignaturas[8] = new String("Desarrollo de interfaces");
		asignaturas[9] = new String("Iniciativa emprendedora");
		asignaturas[10] = new String("Inglés");
		notas = new int [11];
	}
	/**
	 * El metodo existeMateria recibe una asignatura y busca si esta en el array
	 * @param asignatura Nombre de la asignatura que se ha de buscar.
	 * @return true si existe la asignatura  y es encontrada
	 */
	private boolean existeMateria (String asignatura) 
	{
		boolean existe = false;
		for (int i = 0; i < asignaturas.length && !existe; i++) 
		{
			existe = this.asignaturas[i] == asignatura;
		}
		return existe;
	}
	
	/**
	 * getIndexMateria devuelve la posicion de la asignatura buscada en el array si esta es encontrada,
	 *  en su defecto devuelve -1
	 *  
	 * @param asignatura Nombre de la asignatura que se ha de buscar.
	 * @return i devuelve la posicion del array donde se halla la asignatura.
	 */
	private int getIndexMateria (String asignatura) 
	{
		int posicion = -1;
		for (int i = 0; i < asignaturas.length && posicion == -1; i++) 
		{
			if (this.asignaturas[i] == asignatura)
			{
			 posicion = i;	
			}
			
		}
		return posicion;
	}
	
	/**
	 * El metodo llama al metodo existeMateria() para comprobar 
	 * que exista la materia y posteriormente llama a getIndexMateria() para obtener el indice
	 * del array de asignaturas e introduce la nota en la misma posicion en el array de notas. Si no 
	 * se asigna nota devuelve false.
	 * @param nota Es la nota en entero que se va a asignar.
	 * @param asignatura Nombre de la asignatura.
	 * @return validNota devuelve true si se ha asignado la nota
	 */
	public	boolean ponerNota (int nota, String asignatura)
	{
		boolean validNota = false;
		if (existeMateria(asignatura))
		{
			notas[getIndexMateria(asignatura)] = nota;
			validNota = true;
		}
		return validNota;
	}
	/**
	 * dameNota obtiene la nota de la asignatura que se le pasa por parametro.
	 * @param asignatura Nombre de la asignatura que se ha de buscar para introducir la nota.
	 * @return nota devuelve la nota o en su defecto un -1 si no existe la asignatura
	 */
	public	int dameNota( String asignatura) 
	{
		int nota = -1;
		if (existeMateria(asignatura))
		{
		  nota = this.notas[getIndexMateria(asignatura)];	
		}
		return nota;
	}
	
	/**
	 * getNumExpediente obtiene el numero de expediente
	 * @return  numExpediente
	 */
	public int getNumExpediente() {
		return numExpediente;
	}

	/**
	 * setNumExpediente fija el numero de expediente
	 * @param numExpediente the numExpediente to set
	 */
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	/**
	 * getNombre obtiene el nombre 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setNombre sirve para fijar el nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getAsignaturas obtiene el array asignaturas
	 * @return the asignaturas
	 */
	public String[] getAsignaturas() {
		return asignaturas;
	}

	/**
	 * setAsignaturas metodo fija el array de asignaturas
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * getNotas para obtener el array de notas
	 * @return the notas
	 */
	public int[] getNotas() {
		return notas;
	}

	/**
	 * setNotas sirve para fijar el array nota
	 * @param notas the notas to set
	 */
	public void setNotas(int[] notas) {
		this.notas = notas;
	}


}
