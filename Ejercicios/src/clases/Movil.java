/*Main 3*/
package clases;

public class Movil {
	private int numMovil;
	private String nombre;
	private int segConsumidos;
	private double precioSeg;
	
	private static int cantidadObj;
	private static double importesApagar;
	public static final double IGV;
	
	static {
		cantidadObj=0;
		importesApagar=0;
		IGV =0.18;
	}

	public Movil(int numMovil, String nombre, int segConsumidos, double precioSeg) {
		this.numMovil = numMovil;
		this.nombre = nombre;
		this.segConsumidos = segConsumidos;
		this.precioSeg = precioSeg;
		cantidadObj ++;
		importesApagar += importePagar();
	}
	
	public Movil(int numMobil, String nombre) {
		this(numMobil , nombre, 75, 0.28);
	}
	
	public Movil() {
		this(987656789, "Juan");
	}

	public int getNumMovil() {
		return numMovil;
	}

	public void setNumMovil(int numMovil) {
		this.numMovil = numMovil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSegConsumidos() {
		return segConsumidos;
	}

	public void setSegConsumidos(int segConsumidos) {
		this.segConsumidos = segConsumidos;
	}

	public double getPrecioSeg() {
		return precioSeg;
	}

	public void setPrecioSeg(double precioSeg) {
		this.precioSeg = precioSeg;
	}

	public static int getCantidadObj() {
		return cantidadObj;
	}

	public static void setCantidadObj(int cantidadObj) {
		Movil.cantidadObj = cantidadObj;
	}

	public static double getImportesApagar() {
		return importesApagar;
	}

	public static void setImportesApagar(double importesApagar) {
		Movil.importesApagar = importesApagar;
	}
	
	
	public double costoConsumo() {
		return segConsumidos * precioSeg;
	}
	public double impuestoIgv() {
		return IGV * costoConsumo();
	}
	public double importePagar() {
		return costoConsumo() + impuestoIgv();
	}
	
}
