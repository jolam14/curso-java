package tp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaProductos {
    
    public static void main(String[] args) {
        
        // Creamos una lista de productos
        List<Producto> listaProductos = new ArrayList<>();
        
        // Añadimos algunos productos a la lista
      
        // Obtenemos el día actual
        LocalDate fechaActual = LocalDate.now();
        
        // Calculamos el total de todas las compras con descuento
        double totalCompras = 0.0;
        for (Producto producto : listaProductos) {
            double precioConDescuento = 0.0;
            if (fechaActual.getDayOfMonth() % 2 == 0) {
                precioConDescuento = producto.getPrecioConDescuento(0.02);
            } else {
                precioConDescuento = producto.getPrecioConDescuento(0.03);
            }
            try {
                double totalProducto = producto.getTotal(precioConDescuento);
                totalCompras += totalProducto;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        // Mostramos el total de todas las compras con descuento
        System.out.println("El total de todas las compras con descuento es: $" + totalCompras);
    }
}

