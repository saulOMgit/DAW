package examen;

import java.util.Scanner;
public class Ejercicio1 {

	public static int ElevarNumeroIterativo(int base, int exp) {		
		int resul=base;
		for (int i=1;i<exp;i++) {
			resul=resul*base;
		}
		return resul;
		
	}
	public static int ElevarNumeroRecursivo(int base,int exp) {
		int resul;
		if (exp==1) {
			resul=base;
			return resul;
		}
		else {
			resul=ElevarNumeroRecursivo(base,exp-1);
			resul=resul*base;
		}
		return resul;
	}
	public static void main(String[] args) {
		int base,exp,elevado;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la base: ");
		base=teclado.nextInt();
		System.out.println("Introduce el exponente: ");
		exp=teclado.nextInt();
		
		elevado=ElevarNumeroIterativo(base,exp);
		System.out.println("El resultado por iterativo es "+elevado);
		elevado=ElevarNumeroRecursivo(base,exp);
		System.out.println("El resultado por recursividad es "+elevado);
		elevado=(int) Math.pow(base,exp);
		System.out.println("El resultado por Math.pow es "+elevado);
	}

}
