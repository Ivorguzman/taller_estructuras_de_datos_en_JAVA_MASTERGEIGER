package tallerEstructuraDeDatos.tad_V07;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TDAMemmoriaDinamica_V07 {


	@SuppressWarnings({ "null", "unlikely-arg-type" })
	public static void main(String[] args) {


		// Declarando y creando objetos o instancias de tipo de dato ArrayList
		ArrayList<String> listaCadenas = new ArrayList<>();

		// Declaracion de propiedades ( Variables )
		String fraseUsuario;
		String respuesta = null;
		int contador = 0;


		// solicitar frase de manera dinamica
		do{
			// Solicito el ingreso de la frase por el usuario
			fraseUsuario = JOptionPane.showInputDialog(null, "Ingresa la frase");
			
			// Agrego la frase a la lista por medio del metodo add() de la clase ArrayList
			listaCadenas.add(fraseUsuario);

			// Utilizando el metodo get(..)
			System.out.println("Frase Ingresada (" + listaCadenas.get(contador) + ") en el indice :  [" + listaCadenas.indexOf(fraseUsuario) + "]");

			// Utilizando el metodo indexOf(...)
			System.out.println("Contenido del array list  listaCadenas:  ==> " + listaCadenas);

			// Utilizando el metodo size(...)
			System.out.println("El tamaño de la instancia listaCadenas de la clase ArrayList  es de : " + listaCadenas.size() + " elementos");
			contador++;
			System.out.println();




			
			respuesta = JOptionPane.showInputDialog(null, "Deseas Ingresar otra frase");
			respuesta = respuesta.toUpperCase();

			// Evalua se la cadena introducida e la variable respuesta es diferente "Si"
		} while (respuesta.equals("SI"));
		/* while (respuesta.equals("SI") || respuesta.equals("Si") || respuesta.equals("si") || respuesta.equals("sI")); */






		int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Iidica el indice a modificar"));
		String nuevaFrase = JOptionPane.showInputDialog(null, "Indica la nueva frase");

		// Utilizando el metodo get(..)
		System.out.println("La Frase (" + listaCadenas.get(indice) + ")");

		// utilizando el metodo set(...)
		listaCadenas.set(indice, nuevaFrase);

		// Utilizando el metodo get(..)
		System.out.println("Cambiada por la Frase (" + listaCadenas.get(indice) + ")");

		// Muestra el contenidi total del arrray list
		System.out.println("Contenido del array list  listaCadenas despues de utilizar el metod set(...):  ==> " + listaCadenas);

		System.out.println();

		// Muestra por consola DE LA DESPEDIDA
		System.out.println("GRACIAS POR PARTICIPAR  esplorando la memoria dinamica con ArrayList! HASTA PRONTO ¡");



	}
}





















