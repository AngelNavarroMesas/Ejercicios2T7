package ejercicio4;

import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String discos[]= new String[10];
		int opc=0;
		
		while(opc!=5) {
			System.out.println("COLECCION DE DISCOS");
			System.out.println("===================");
			System.out.println();
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			opc = sc.nextInt();
			
			
		}
		
	}

}
