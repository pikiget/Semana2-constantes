/*Main 4*/
package clases;

public class Asesor {
	private String nombre;
	private int dni;
	private int codigo;
	private double remuneracion;
	
	private static int cantidadObj;
	private static double sumRemune;
	public static final String NAME;
	
	static {
		cantidadObj =0;
		sumRemune =0;
		NAME = "CIBERTEC";
	}

	public Asesor(String nombre, int dni, int codigo, double remuneracion) {
		this.nombre = nombre;
		this.dni = dni;
		this.codigo = codigo;
		this.remuneracion = remuneracion;
		
		cantidadObj ++;
		sumRemune += getRemuneracion();
	}
	
	public Asesor(String nombre, int dni) {
		this(nombre, dni, 55555, 2000.0);
	}
	
	public Asesor() {
		this("NN", 88888888);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}

	public static int getCantidadObj() {
		return cantidadObj;
	}

	public static void setCantidadObj(int cantidadObj) {
		Asesor.cantidadObj = cantidadObj;
	}

	public static double getSumRemune() {
		return sumRemune;
	}

	public static void setSumRemune(double sumRemune) {
		Asesor.sumRemune = sumRemune;
	}
	
	
	
}
