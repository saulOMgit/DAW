package examen;

import java.util.Scanner;
public class Ejercicio2Multiplo {
//comprobamos si es multiplo
	public static boolean esMultiplo(int n) {
		if(n%3==0) {
			return true;
		}else {		
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num=1,c=0;
		Boolean multiplo3=false;
		while(num!=0) {
			System.out.println("Introduce un número (0 para parar): ");
			num=teclado.nextInt();
			if (num<0) {
				System.out.println("No pueden introducirse numeros negativos.");
			}else {
				if (num==0){

				}
				//escribimos si es multiplo
				else {
					multiplo3=esMultiplo(num);

					if (multiplo3==true) {
						System.out.println("El numero "+num+ " es multiplo de 3");
						c++;
					}
					else {
						System.out.println("El numero "+num+ " no es multiplo de 3");
					}
				}
			}

		}
		//Decimos cuantos hemos introducido
		System.out.println("Has introducido "+c+" multiplos de 3");
	}

}
