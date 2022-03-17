package examen;
import java.util.*;
public class Ejercicio1 {

	/** Autor: Saúl Otero Melchor
	 * 
	 * 	Codificar un programa en lenguaje Java que nos pida notas musicales para componer una canción (dejara de pedir
		notas cuando introduzcamos -1), los guarde en una lista de elementos String, y nos calcule y muestre por pantalla las
		siguientes informaciones:
		Número de notas de cada tipo y la media resultante de ellas:
	*/
	public static void main(String[] args) {
		//Declaro mi lista y variables para el ejercicio
		ArrayList<String> cancion= new ArrayList<>();
		Scanner teclado=new Scanner(System.in);
		String nota="";
		int cdo=0,cre=0,cmi=0,cfa=0,csol=0,cla=0,csi=0,media=0;
		
		/**
		 * En este while comprobamos que las notas son notas y no otro string y añadimos
		 * */
		
		try {
			while(!nota.equalsIgnoreCase("-1")) {
				System.out.println("Introduce una nota: (-1 para salir)");
				nota=teclado.nextLine().toLowerCase();

				switch (nota) {
				case "do":
					cdo++;
					media++;
					cancion.add(nota);
					break;
				case "re":
					cre++;
					media++;
					cancion.add(nota);
					break;
				case "mi":
					cmi++;
					media++;
					cancion.add(nota);
					break;
				case "fa":
					cfa++;
					media++;
					cancion.add(nota);
					break;
				case "sol":
					csol++;
					media++;
					cancion.add(nota);
					break;
				case "la":
					cla++;
					media++;
					cancion.add(nota);
					break;
				case "si":
					csi++;
					media++;
					cancion.add(nota);
					break;
				case "-1":

					break;
				default:					
					break;

				}

			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//Imprimimos cuantas notas de cada tenemos
		System.out.println("Lista de Notas:");
		
		if(cdo>0) {
			System.out.println(cdo + "- Do");
			
		}
		if(cre>0) {
			System.out.println(cre + "- Re");
			
		}
		if(cmi>0) {
			System.out.println(cmi + "- Mi");
			
		}
		if(cfa>0) {
			System.out.println(cfa + "- Fa");
			
		}
		if(csol>0) {
			System.out.println(csol + "- Sol");
			
		}
		if(cla>0) {
			System.out.println(cla + "- La");
			
		}
		if(csi>0) {
			System.out.println(csi + "- si");
			
		}
		try {
		//Hacemos la media (con su excepcion por si es 0) y la imprimimos
		media=(cdo+cre+cmi+cfa+csol+cla+csi)/media;
		System.out.println("Media = "+media);
		} catch (ArithmeticException cero) {
			System.out.println("No has introducido ninguna nota");
		}
		//Mostramos la partitura
		System.out.println(cancion);
		teclado.close();
		
	}

}
