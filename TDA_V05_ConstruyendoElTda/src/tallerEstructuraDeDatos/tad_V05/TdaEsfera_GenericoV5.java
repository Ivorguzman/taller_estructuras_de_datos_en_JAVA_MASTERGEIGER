// TDA no implementado con memoria estatica
package tallerEstructuraDeDatos.tad_V05;

public class TdaEsfera_GenericoV5 {

	private double radio;


	// Contructor
	public TdaEsfera_GenericoV5(double radioInicial) {




		if (radioInicial <= 0){
			this.radio = 0.0;
			throw new IllegalArgumentException("El radio debe ser mayor a cero.");
		}


		if (!(Double.valueOf(radioInicial).getClass() == Double.class)){
			this.radio = 0.0;
			throw new IllegalArgumentException("El valor debe ser de tipo double.");
		}


		this.radio = radioInicial;
	}





	// Metodos Getters

	// Metodo para obtener el RADIO
	public double getRadio() {
		return this.radio;
	}


	// Metodo para obtener el DIAMETRO
	public double getDiametro() {
		return this.radio * 2;
	}


	// Metodo para obtener el CIRCUNFERENCIA
	public double getCircunferencia() {
		return Math.PI * this.getDiametro();
	}



	// Metodo para obtener el AREA
	public double getArea() {
		return 4 * Math.PI * (this.radio * this.radio);
	}



	// Metodo para obtener el Volumen
	public double getVolumen() {
		return 4 * Math.PI * Math.pow(this.radio, 3) / 3;
	}
  


}
