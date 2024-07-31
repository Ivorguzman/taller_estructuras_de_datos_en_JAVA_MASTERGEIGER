// TDA no implementado con memoria estatica
package tallerEstructuraDeDatos.tad_V05;

public class TdaEsfera_V05 {

	private double radio;

	// TDA ==> TIPO DE DATO ASTRACTO COM MEMORIA STATICA

	/*
	 * // ******** VALIDACIÓN UTILIZANDO EL TRY CATCH ********************
	 *
	 * public TdaEsfera(double radioInicial) throws Exception {
	 *
	 * 
	 * try{
	 * if (radioInicial <= 0){
	 * 
	 * throw new IllegalArgumentException("El radio  y  debe ser mayor a cero.");
	 * 
	 * }
	 * 
	 * if (!(Double.valueOf(radioInicial).getClass() == Double.class) ){
	 * 
	 * throw new IllegalArgumentException("El valor debe ser de tipo Decimal.");
	 * }
	 * 
	 * this.radio = radioInicial;
	 * 
	 * 
	 * } catch(NumberFormatException ex){
	 * // Manejar errores de conversión numérica
	 * System.out.println("Error de formato: " + ex.getMessage());
	 * this.radio = 0.0;
	 * 
	 * } catch(NullPointerException ex){
	 * // Manejar errores de referencias nulas
	 * System.out.println("Referencia nula: " + ex.getMessage());
	 * this.radio = 0.0;
	 * 
	 * } catch(Exception ex){
	 * // Capturar cualquier otra excepción genérica
	 * System.out.println("Error general: " + ex.getMessage());
	 * this.radio = 0.0;
	 * }
	 */


	// Contructor
	public TdaEsfera_V05(double radioInicial) {

		// ******** VALIDACIÓN SIN LA UTILIZACIÓN DEL TRY CATCH ********************
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
