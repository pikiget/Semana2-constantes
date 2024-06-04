/*Main 5*/
package clases;

public class Balon {
	private String marca;
	private double peso, presion, diametro, precio;

	private static int cantidadObj;
	private static double importes;
	public static final double PI, DESCUENTO;
	
	static {
		cantidadObj=0;
		importes=0;
		PI=3.1416;
		DESCUENTO=0.05;
	}

	public Balon(String marca, double peso, double presion, double diametro, double precio) {
		this.marca = marca;
		this.peso = peso;
		this.presion = presion;
		this.diametro = diametro;
		this.precio = precio;
		
		cantidadObj++;
		importes += calcularImpPagar();
	}
	
	public Balon(String marca, double peso, double presion) {
		this(marca, peso, presion, 18.5, 100.0);
	}
	
	public Balon() {
		this("Adidas", 1.5, 4.8);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPresion() {
		return presion;
	}

	public void setPresion(double presion) {
		this.presion = presion;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getCantidadObj() {
		return cantidadObj;
	}

	public static void setCantidadObj(int cantidadObj) {
		Balon.cantidadObj = cantidadObj;
	}

	public static double getImportes() {
		return importes;
	}

	public static void setImportes(double importes) {
		Balon.importes = importes;
	}
	
	
	
	public double calcularRadio() {
		return diametro / 2;
	}
	public double calcularVolumen() {
		return 4 * PI * calcularRadio() * calcularRadio() * calcularRadio() / 3;
	}
	public double calcularDescuento() {
		return DESCUENTO * precio;
	}
	public double calcularImpPagar() {
		return precio - calcularDescuento();
	}
}
