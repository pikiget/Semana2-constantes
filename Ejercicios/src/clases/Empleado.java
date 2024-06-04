/*Main 2*/
package clases;

public class Empleado {
	private int codigo;
	private String nombre;
	private int categoria;
	private int celular;
	
	//variables privadas de la clase
	private static int cantidadEmpleados;
	private static double sueldosNetosEmpleados;
	
	//constante publica de clase
	public static final double descuentoTodos;
	
	//inicializamos los static
	static {
		cantidadEmpleados =0;
		sueldosNetosEmpleados =0;
		descuentoTodos = 0.15;
	}
	
	//Constructor 
	public Empleado(int codigo, String nombre, int categoria, int celular) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.celular = celular;
		
		cantidadEmpleados++;
		sueldosNetosEmpleados += sueldoNeto();
		
	}
	
	
	public Empleado(int codigo, String nombre) {
		this(codigo, nombre, 2, 9999999);
	}
	
	public Empleado() {
		this(4444, "Ninguno");
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public static int getCantidadEmpleados() {
		return cantidadEmpleados;
	}


	public static void setCantidadEmpleados(int cantidadEmpleados) {
		Empleado.cantidadEmpleados = cantidadEmpleados;
	}


	public static double getSueldosNetosEmpleados() {
		return sueldosNetosEmpleados;
	}


	public static void setSueldosNetosEmpleados(double sueldosNetosEmpleados) {
		Empleado.sueldosNetosEmpleados = sueldosNetosEmpleados;
	}

	//METODOS
	public double sueldoBruto() {
		switch (categoria){
		case 0: return 7200;
		case 1: return 6300;
		case 2: return 5100;
		default: return 000;
		}
	}
	
	public double descuento() {
		return sueldoBruto() * descuentoTodos; 
	}
	
	public double sueldoNeto() {
		return sueldoBruto() - descuento();
	}
	
	
}
