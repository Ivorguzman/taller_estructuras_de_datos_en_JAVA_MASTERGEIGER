package tallerEstructuraDeDatos.tad_V11;

import javax.swing.JOptionPane;

public class TDASerieFibonacciConCiclo_V11 {

	public static void main(String[] args) {

		TDASerieFibonacciConCiclo_V11 fibonacci = new TDASerieFibonacciConCiclo_V11();

		int numeroFibonacci;
		try{
			numeroFibonacci = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número para calcular su posición en la secuencia de Fibonacci:"));
			if (numeroFibonacci >= 0){
				// Llamamos a la función que calcula la posición en la secuencia de Fibonacci
				fibonacci.fibonacciCiclo(numeroFibonacci);
			} else{
				JOptionPane.showMessageDialog(null, "Por favor, ingresa un número mayor o igual a 0.");
			}
		} catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Por favor, ingresa un número entero válido.");
		}
	}


	// Creando metodo por ciclo para sececiòn Fibonacci
	public int fibonacciCiclo(int numero) {

		int fibo = 0;
		int primero = 1;
		int segundo = 0;
		int contador = numero;

		System.out.print("Números de Fibonacci de [" + numero + "] son :(");
		while (contador > 0){
			fibo = primero + segundo;
			primero = segundo;
			segundo = fibo;
			contador--;
			System.out.print(fibo + ", ");
		}
		System.out.println(")");
		return numero;
	}

}
