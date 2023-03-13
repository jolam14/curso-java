package clase;

import java.util.Arrays;

public class dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []vector3 = {4,76,89,10,6};

		System.out.println();

		System.out.println("Segundo vector: ");

		for (int indice1=0; indice1 < vector3.length; indice1++) {

			System.out.print(vector3[indice1] + "  ");		

		}



		/////////////////////////////////////////////////////////////////////

					int x=50, suma=0;

					

					System.out.println();

					System.out.println("Segundo vector: ");

					

					for (int indice1=0; indice1 < vector3.length; indice1++) {

						if(vector3[indice1] > x) {

							suma = suma + vector3[indice1];			

						}			

					}

					System.out.print("La suma es:  "+suma);}
	   int [] a  = {4,76,89,10,6};
	   int menor;

	    for(int i = 0; i < 10; i++){
	        menor = a[0];

	        if (a[i] < menor){
	            menor = a[i];
	        }
	        else{
	            if (a[i] > menor){
	            }      
	        }
	    }
	    System.out.println(Arrays.toString(a));
}
	}