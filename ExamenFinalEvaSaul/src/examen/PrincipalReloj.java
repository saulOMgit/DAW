package examen;

public class PrincipalReloj {

	public static void main(String[] args) {
		Reloj Reloj1 = new Reloj(11,59,59);
		Reloj Reloj2 = new Reloj(21,98,23);
		
		Reloj1.AdelantaSegundo();
		Reloj2.RetrasaSegundo();
		Reloj1.MuestraHora();
		Reloj2.MuestraHora();

	}

}
