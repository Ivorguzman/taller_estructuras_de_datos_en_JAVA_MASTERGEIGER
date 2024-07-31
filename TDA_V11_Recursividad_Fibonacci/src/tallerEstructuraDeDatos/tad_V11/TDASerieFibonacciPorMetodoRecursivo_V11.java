package tallerEstructuraDeDatos.tad_V11;

import javax.swing.JOptionPane;

public class TDASerieFibonacciPorMetodoRecursivo_V11 {

	public static void main(String[] args) {

		TDASerieFibonacciPorMetodoRecursivo_V11 fibonacci = new TDASerieFibonacciPorMetodoRecursivo_V11();



		 int numeroFibonacci;
	        try {
	            numeroFibonacci = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número para calcular su posición en la secuencia de Fibonacci:"));
	            if (numeroFibonacci >= 0) {
	                // Llamamos a la función que calcula la posición en la secuencia de Fibonacci

					fibonacci.fibonacciRecursivo(numeroFibonacci);
	            } else {
	                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número mayor o igual a 0.");
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Por favor, ingresa un número entero válido.");
	        }
	    }



		// Creando metodo recursivo para sececiòn Fibonacci
		public int fibonacciRecursivo(int numero) {

			if (numero == 1 || numero == 2){
				// Caso Base ( Respuesta explicita)
				return 1;

			} else{
				// Dominio (problema -1)
				int fibonacci = this.fibonacciRecursivo(numero - 2) + this.fibonacciRecursivo(numero - 1);
				System.out.print("Números de Fibonacci de [" + numero + "] son :(");
				System.out.print(fibonacci);
				System.out.print(")");
				return fibonacci;
			}
		}


}














