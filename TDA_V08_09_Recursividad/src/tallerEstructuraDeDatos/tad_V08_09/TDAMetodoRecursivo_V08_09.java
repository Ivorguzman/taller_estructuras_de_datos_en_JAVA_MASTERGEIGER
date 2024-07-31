package tallerEstructuraDeDatos.tad_V08_09;

public class TDAMetodoRecursivo_V08_09 {


	// metodo recursivo que simula bajar unas escaleras

	public void bajarEscaleras(int escalones) {

		// Este indica que terminamos de bajar los escalones
		// osea que no queden escalones que bajar
		if (escalones <= 0){
			// Condicional que evalua caso base (que sabes que ocurrui algo), respuesta explicita
			System.out.println("No existen escalones que bajar en la escalera");

		} else{


			try{
				// temporizador Thread.sleep(1000);
				Thread.sleep(1000);
			} catch(InterruptedException ex){
				ex.printStackTrace();
			}
			// Dominio (division del problema original ( problema-1)
			System.out.println("Bajando Escalón: " + escalones);


			// Haciendo uso de la recursividad Se invoca el metodo asimismo
			this.bajarEscaleras(escalones - 1); // esto es la recursividad ( Metodo que se invoca a si mismo)

		}
	}

}




























