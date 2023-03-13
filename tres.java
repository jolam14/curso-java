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

		
}
}
