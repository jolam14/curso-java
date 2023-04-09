package tp;
	import java.util.ArrayList;
	import java.util.List;
public class carrito {
	    
	    public static void main(String[] args) {
	        
	        // Creamos una lista de productos
	        List<Producto> listaProductos = new ArrayList<>();
	        
	        // Añadimos algunos productos a la lista
	        listaProductos.add(new Producto("001", "Leche", 1.50, 50));
	        listaProductos.add(new Producto("002", "Pan", 0.80, 100));
	        listaProductos.add(new Producto("003", "Huevos", 3.20, 30));
	        
	        // Calculamos el total de todas las compras
	        double totalCompras = 0.0;
	        for (Producto producto : listaProductos) {
	            totalCompras += producto.getPrecio() * producto.getStock();
	        }
	        
	        // Mostramos el total de todas las compras
	        System.out.println("El total de todas las compras es: $" + totalCompras);
	    }
	}