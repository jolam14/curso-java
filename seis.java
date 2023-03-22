package clase;

public class seis {

	public static void main(String[] args) {


		System.out.println("Lista de productos del Carrito: ");

		Producto p1 = new Producto(100,"Dulce de leche","Repostero x 500grs.",450.30,1000);

		Producto p2 = new Producto(101,"Leche","En polvo x 500grs.",200,1000);

		Producto p3 = new Producto(102,"Pan","Casero x 500grs.",150.30,500);

		Producto p4 = new Producto(103,"Café","Frasco x 500grs.",450.30,1000);

		System.out.println("Codigo: "+p1.un_codigo()+" Nombre: "+p1.un_nombre()+" Precio: "+p1.un_precio());

		System.out.println("Codigo: "+p2.un_codigo()+" Nombre: "+p2.un_nombre()+" Precio: "+p2.un_precio());

		System.out.println("Codigo: "+p3.un_codigo()+" Nombre: "+p3.un_nombre()+" Precio: "+p3.un_precio());

		System.out.println("Codigo: "+p4.un_codigo()+" Nombre: "+p4.un_nombre()+" Precio: "+p4.un_precio());
		
		Object suma = (p1.un_precio()+ p2.un_precio()+p3.un_precio()+p4.un_precio());
		System.out.println("la suma es: " + suma);
		
}
}