package clase;

public class p4ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []vectorA = {34,10,14};
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

		boolean orden_asc = false;
		if (orden_asc) {

		vecOrdenado[0]=mayor;

		vecOrdenado[1]=aux1;

		vecOrdenado[2]=aux2;

		}else {

		vecOrdenado[0]=aux2;

		vecOrdenado[1]=aux1;

		vecOrdenado[2]=mayor;

		}

		System.out.print("Ascendentes:[");
        for (int i = 0; i < vecOrdenado.length; i++) {
            System.out.print( vecOrdenado[i] + ", ");
        }
        System.out.print("]\n");
        //
        System.out.print("Descendentes: [");
        for (int j = (vecOrdenado.length - 1); j >= 0; j--) {
            System.out.print( vecOrdenado[j] + ", ");
        }
        System.out.print("]\n");
		

}
	}
