package examen;
import java.util.*;
public class Ejercicio2 {
	/**
	 * Autor: Saúl Otero Mechor
	 * Ejercicio 2
	 * 
	 * Crear un programa principal en el que se gestionará una lista de cajas(sin que haya repetidas) y se puedan hacer las
	siguientes cosas:
	Añadir una caja a la lista
	Mostrar la lista ordenada por tamaño, si él tamaño es el mismo el orden lo marca el peso.
	Controlar si se pudiera producir alguna excepción que hiciese que se parase la ejecución.
	Nota: Para mostrar la lista se debe de recorrer usando la clase Iterator.
	Nota2: La clase caja puede ser modificada.
	 * */

	public static void main(String[] args) {
		TreeSet<Caja> c1 = new TreeSet<Caja>(new ComparaCaja());
		
		int opcion;
		opcion=menu();
		Scanner teclado=new Scanner(System.in);
		while (opcion!=3) {
			switch(opcion) {
			case 1:
				int tamaño,peso;
				String nombre;
				try {
				System.out.println("Introduzca el tamaño");
				tamaño=teclado.nextInt();
				teclado.nextLine();
				System.out.println("Introduzca el peso");
				peso=teclado.nextInt();
				teclado.nextLine();
				System.out.println("Introduzca el nombre");
				nombre=teclado.next();

				Caja c=new Caja(tamaño,peso,nombre);
				
				c1.add(c);
				}catch(Exception e) {
					System.out.println("Valor no valido");
				}
			

				
				break;
			case 2:
				Iterator it= c1.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());

				}
				break;
			case 3: 
				System.out.println("Hasta pronto!!");
				break;
			default:
				break;

			}
			opcion=menu();
		}
		
	}

	public static int menu(){
		Scanner tecla2=new Scanner(System.in);
		int opcion=0;
		do {
		System.out.println("Pulse 1 para añadir una caja");
		System.out.println("Pulse 2 para mostrar la lista ordenada");
		System.out.println("Pulse 3 para salir");
		opcion=tecla2.nextInt();
		tecla2.nextLine();
		}while (opcion<=0 || opcion>3);
		
		return opcion;
	}
}
