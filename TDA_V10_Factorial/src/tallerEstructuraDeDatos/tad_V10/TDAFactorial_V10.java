package tallerEstructuraDeDatos.tad_V10;

public class TDAFactorial_V10 {
	/*
	 * Ejemplo de un factorial 4! = 1 * 2 *3 * 4 = 24
	 */



	// caso base

	// Creando un metodo que calcule el factorial de un numero de manera recursiva
	public int factorialRecursivo(int numeroAFactorizar) {


		// Validacion para evitar introducir numeros negativos
		if (numeroAFactorizar < 0){
			return 0;
		} else if (numeroAFactorizar == 0){
			return 1;
		} else{
			// dominio ( n -1)
			return numeroAFactorizar * this.factorialRecursivo(numeroAFactorizar - 1);
		}
	}





	/*
	 * Ejemplo de un factorial 4! = 1 * 2 *3 * 4 = 24
	 */
	// Creando un metodo que calcule el factorial de un numero de manera Ciclica
	long factorial = 1;
	public long factorialCiclos(int numeroFactorizar) {
		if(numeroFactorizar < 0) {
			return 0;
		} else if (numeroFactorizar == 0){
			return 1;
		} else{
			for (int i = 1; i <= numeroFactorizar; ++i){
				this.factorial *= i;
				// System.out.println(this.factorial);
			}
			return this.factorial;
		}
	}
}


















