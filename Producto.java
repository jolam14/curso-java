package tp;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getStock() {
        return stock;
    }
	public double getTotal1(double precioConDescuento) {
		// TODO Auto-generated method stub
		return 0;
	}
   
    
    public double getPrecioConDescuento(double descuento) {
        return precio * (1 - descuento);
    }
    
    public double getTotal(double precioConDescuento) throws Exception {
        if (precio == 0) {
            throw new Exception("No se puede aplicar un descuento a un producto de precio 0.");
        }
        double total = precioConDescuento * stock;
        if (total < 0) {
            throw new Exception("El descuento resulta en un monto negativo.");
        }
        return total;
    }
    
}