package clase;

import java.util.Scanner;

public class tp6 {
	private static Scanner leer;

	public static void main(string[]args) {
		leer = new Scanner(System.in);
		int opcion;
		int n1;
		int n2;
		int r;
		
		System.out.println("1.suma");
		System.out.println("2.resta");
		System.out.println("3.multiplicacion");
		System.out.println("4.division");
		System.out.println("5.limpiar");
		System.out.println("6.salir");
		opcion =leer.nextInt();
		
		System.out.println("escribir el primer numero");
		n1 =leer.nextInt();
		
		System.out.println("escribir es segundo numero");
		n2 =leer.nextInt();
		
		switch(opcion) {
		
		case 1:
			r=n1+n2;
			System.out.println("es resultado de la suma es:"+r);
			break;
		case 2:
			r=n1-n2;
			System.out.println("es resultado de la resta es:"+r);
			break;
		case 3:
			r=n1*n2;
			System.out.println("es resultado de la multiplicacion es:"+r);
			break;
		case 4:
			r=n1/n2;
			System.out.println("es resultado de la division es:"+r);
			break;
		case 5:
			break;
		
		}
		
		
	}
}


