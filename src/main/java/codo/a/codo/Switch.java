package codo.a.codo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado= new Scanner(System.in); // se abre el teclado en este punto pero hay q cerrarlo
		 System.out.println("Ingrese nota");
		 
		int nota=teclado.nextInt();
		
		switch (nota) {
		case 7:
			System.out.println("aprobado");			
			break;
		case 10:
			System.out.println("excelente!!");			
			break;
		default:
			System.out.println("nose");		
			break;
		}
		
		// cierro teclado
		teclado.close();

	}

}
