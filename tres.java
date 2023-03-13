package clase;

public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="Apapachar";

		int contador=0,posicion=0;

		char caracter = 'o';

		String palabra_minu = palabra.toLowerCase();

		posicion = palabra_minu.indexOf(caracter);

		System.out.println(posicion);

		if (posicion != -1 ) {

		while (posicion != -1 ) {

		contador++;

		posicion = palabra_minu.indexOf(caracter,posicion+1);

		}

		System.out.println("La cantidad de coincidencias es: " + contador);

		}else

		System.out.println("No hay coincidencia");

		

		String texto1= "Buenos dias";

		String texto2= "Buenas noches";

		boolean texto3 = texto1.equals(texto2);

		System.out.println("Los textos 1 y 2 son iguales?: "+texto3);

		texto3 = texto2.contains("che");

		System.out.println("Texto 2 contiene los caracteres \"che\"?"+ texto3);

		System.out.println("Pasamos a mayusculas texto1"+texto1.toUpperCase());

		String texto4 = texto2.replace("noches", "tardes");

		System.out.println("La variable texto4 a minusculas: "+texto4.toLowerCase());


		

		String frase = "Yo;tengo; un; elefante que se; llama trompita ... ";

		String fraseSplit[] = frase.split(";");

		for (String elemento : fraseSplit) {

		System.out.println(elemento);

		boolean orden_asc = false;

		int []vectorA = {800,0,10};

		int num1=0, num2=0,num3=0, aux1=0, aux2=0, mayor=0;

		num1 = vectorA[0];

		num2 = vectorA[1];

		num3 = vectorA[2];

		System.out.println(num1+" " + num2+" " + num3);

		if ((num1 > num2) && (num1 > num3)) {

		mayor=num1;

		if (num2 > num3) {

		aux1=num2;

		aux2=num3;

		}else {

		aux1=num3;

		aux2=num2;

		}

		}

		else{

		if ((num2 > num3) && (num2 > num1)) {

		mayor=num2;

		if (num1 > num3) {

		aux1=num1;

		aux2=num3;

		}else {

		aux1=num3;

		aux2=num1;

		}

		}else {

		mayor=num3;

		if (num2 > num1) {

		aux1=num2;

		aux2=num1;

		}else {

		aux1=num1;

		aux2=num2;

		}

		}

		}

		System.out.println("El mayor es: "+mayor);

		int vecOrdenado [] = new int[3];

		if (orden_asc) {

		vecOrdenado[0]=mayor;

		vecOrdenado[1]=aux1;

		vecOrdenado[2]=aux2;

		}else {

		vecOrdenado[0]=aux2;

		vecOrdenado[1]=aux1;

		vecOrdenado[2]=mayor;

		}

		for (int i=0; i< vecOrdenado.length; i++ ) {

		System.out.print(vecOrdenado[i]+"-");


	}

}
}
}