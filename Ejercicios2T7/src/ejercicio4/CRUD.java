package ejercicio4;

import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {
		Disco[] discos= new Disco[10];
		menu(discos);
	}
	
	public static void menu(Disco[] discos) {
		Scanner sc = new Scanner(System.in);
		int opc=0;
		int cont=1;
		
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
			switch (opc){
            case 1:
                listado(discos);
                break;
            case 2:
                nuevoDisco(discos, cont);
                break;
            case 3:
                modificar(discos);
                break;
            case 4:
                borrar(discos, cont);
                break;
            case 5:
                break;
            default:
                System.out.println("Opción no válida");
        }
    }while (opc!=5);
		}

	private static void borrar(Disco[] discos, int cont) {
	}

	private static void modificar(Disco[] discos) {
	}

	private static void nuevoDisco(Disco[] discos, int cont) {
	}

	public static void listado(Disco[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo != "LIBRE"){
                array[i].toString();
            }else
                System.out.println();
        }
    }
		
	}

}
