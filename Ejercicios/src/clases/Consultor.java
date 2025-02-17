package clases;

public class Consultor {
	private int codigo;
	private String nombre;
	private int horas;
	private double tarifa;
	
	private static int cantidad;
	private static double sueldos;
	public static final double AFP, EPS;
	
	static {
		cantidad=0;
		sueldos=0;
		AFP=0.10;
		EPS=0.05;
	}

	public Consultor(int codigo, String nombre, int horas, double tarifa) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
		
		cantidad ++;
		sueldos += sueldoNeto();
	}

	public Consultor(int codigo, String nombre, int horas) {
		this(codigo, nombre, horas, 65);
	}
	
	public Consultor() {
		this(333, "Juan", 30);
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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Consultor.cantidad = cantidad;
	}

	public static double getSueldos() {
		return sueldos;
	}

	public static void setSueldos(double sueldos) {
		Consultor.sueldos = sueldos;
	}
	
	
	public double sueldoBruto() {
		return horas * tarifa;
	}
	public double descuentoAfp() {
		return AFP * sueldoBruto();
	}
	public double descuentoEps() {
		return EPS * sueldoBruto();
	}
	public double sueldoNeto() {
		return sueldoBruto() - descuentoAfp() - descuentoEps();
	}
	
	
	
	
}
