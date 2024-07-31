package tallerEstructuraDeDatos.tad_V06;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class TDAMemoriaEstatica_V06 {

	public static void main(String[] args) {

		// Declarar arreglo de tipo entero estatico
		int numeros[] = new int[5];
		int i;



		for (i = 0; i < 5; i++){

			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemneto del índice ==> " + i));
			// numeros[i] = i;


		}
		
		// Mostrando los datos como lo ingresamos
		System.out.println("Mostrando los datos como lo ingresamos");
		for (i = 0; i < 5; i++){

			System.out.print("[" + numeros[i] + "]");

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		// ===*****************************************************************************===
		System.out.println("//===*****************************************************************************===");


		// Mostrando los datos Ordenado con el metos sort de la clase Array
		// Ordenando el arreglo
		Arrays.sort(numeros);

		System.out.println("Ordenado el array[]  con el metodo sort() de la clase Array.");

		for (i = 0; i < 5; i++){
			System.out.print("[" + numeros[i] + "]");

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		// ===*****************************************************************************===
		System.out.println("//===*****************************************************************************===");



		System.out.println("Rellenando el array[] con el metdo  Fill() de la clase Array.");

		String palabras[] = new String[5];

		Arrays.fill(palabras, "Introducido automaticamente con el metodo fill()");

		for (i = 0; i < 5; i++){

			System.out.println("[" + palabras[i] + "]");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		// ===*****************************************************************************===
		System.out.println("//===*****************************************************************************===");



		// Copiando los arreglos de al array numero al array numerotes
		// copiando el arreglo.

		System.out.println("Elementos del array  numeros a copiar  al array numerotes.");

		for (i = 0; i < 5; i++){
			System.out.print("[" + numeros[i] + "]");

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		// ===*****************************************************************************===
		System.out.println("//===*****************************************************************************===");


		System.out.println("Copiando los elementos el array[]  numeros con el metdo  arraycopy() al array [] numerotes");


		// Creando el array numerotes
		int numerotes[] = new int[numeros.length];

		// Copiando los elementos de array numeros al array numerotes con metodo arraycopy(...)
		System.arraycopy(numeros, 0, numerotes, 0, numeros.length);


		// Mostrand los elemento copiados en numerotes
		for (i = 0; i < 5; i++){

			System.out.print("[" + numerotes[i] + "]");




	}



	}
}
