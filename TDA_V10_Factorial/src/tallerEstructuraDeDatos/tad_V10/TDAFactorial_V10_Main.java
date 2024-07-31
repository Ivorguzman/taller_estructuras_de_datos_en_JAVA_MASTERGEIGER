package tallerEstructuraDeDatos.tad_V10;

import javax.swing.JOptionPane;

public class TDAFactorial_V10_Main {

	public static void main(String[] args) {

		TDAFactorial_V10 factorialRecursivo = new TDAFactorial_V10();
		int numeroRecursivo = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero a factorizar en forma recursiva"));
		System.out.println("El factorial de numero: " + numeroRecursivo + " es " + factorialRecursivo.factorialRecursivo(numeroRecursivo)
				+ " (Calculado en forma recursiva)");


		// ******************************************************************************************************************************************************


		TDAFactorial_V10 factorialCiclico = new TDAFactorial_V10();
		int numeroCiclo = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero a factorizar en ciclica"));
		System.out.println("El factorial de numero: " + numeroCiclo + " es " + factorialCiclico.factorialCiclos(numeroCiclo) + " (Calculado en forma ciclica)");

}

}
