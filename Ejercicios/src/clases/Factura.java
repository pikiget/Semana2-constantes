/*Main 1*/
package clases;

public class Factura {
	//ATRIBUTOS
	 private String ruc;
	 private String empresa;
	 private int unidades;
	 private double precioUnitario;

	 private static int cantidadFactura;
	 private static double importesFacturados;
	 public static final String ENTIDAD;
	 
	 static {
		 cantidadFactura = 0;
		 importesFacturados = 0;
		 ENTIDAD = "Sunat";
	 }

	public Factura(String ruc, String empresa, int unidades, double precioUnitario) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
	
		cantidadFactura ++;
		importesFacturados += importefacturado();
	}
	 
	public Factura(String ruc, String empresa) {
		this(ruc, empresa, 10, 50.0);
	}
	 
	
	public Factura() {
		this("11111111111", "MN-Global SRL");
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public static int getCantidadFactura() {
		return cantidadFactura;
	}

	public static void setCantidadFactura(int cantidadFactura) {
		Factura.cantidadFactura = cantidadFactura;
	}

	public static double getImportesFacturados() {
		return importesFacturados;
	}

	public static void setImportesFacturados(double importesFacturados) {
		Factura.importesFacturados = importesFacturados;
	}
	
	
	public double importefacturado() {
		return unidades * precioUnitario;
	}
}
