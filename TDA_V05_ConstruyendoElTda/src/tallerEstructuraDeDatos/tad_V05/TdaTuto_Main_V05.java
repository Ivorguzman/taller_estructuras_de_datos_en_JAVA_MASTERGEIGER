package tallerEstructuraDeDatos.tad_V05;

public class TdaTuto_Main_V05 {

	public static void main(String[] args) throws Exception {
		
		TdaEsfera_V05 esferita = new TdaEsfera_V05(-3);

		System.out.println("Radio: " + esferita.getRadio());
		System.out.println("Diámetro: " + esferita.getDiametro());
		System.out.println("Circunferencia :" + esferita.getCircunferencia());
		System.out.println("Área: " + esferita.getArea());
		System.out.println("Volumen:" + esferita.getVolumen());

	}

}
