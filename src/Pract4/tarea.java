package Pract4;

import java.util.Scanner;

public class tarea {
public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int num1;
		int resultado;
		do {
			System.out.println("Introduce el primer valor");
		num=teclado.nextInt();
		}while(num<0 || num>99);
		
		
		System.out.println("Introduce un valor");
		num1=teclado.nextInt();
		
		if(num*num1==64) {
			System.out.println("He dibujado tu cara");
		}
		
		resultado= num*num1;
		
		System.out.println("La multiplicacion de"+num+"y"+num1+"es de"+resultado);
		
	}
	
}
