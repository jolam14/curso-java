package clase;

public class Producto {

		private int codigo;

		private String nombre;

		private String desc;

		private double precio;

		private int stock;

		

		public Producto(int cod, String nom, String descripcion, double prec, int stc) {

		codigo = cod;

		nombre = nom;

		desc = descripcion;

		precio = prec;

		stock = stc;

		}

		

		public int un_codigo() {

		return codigo;

		}

		public String un_nombre() {

		return nombre;

		}

		public String un_desc() {

		return desc;

		}

		public double un_precio() {

		return precio;

		}

		public int un_stock() {

		return stock;

		}

		}
