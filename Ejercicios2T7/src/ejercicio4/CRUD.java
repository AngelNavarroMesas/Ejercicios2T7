package ejercicio4;

import java.util.Scanner;

public class CRUD {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Disco[] discos= new Disco[10];
		for(int i=0;i<discos.length;i++) {
			discos[i] = new Disco();
		}
		menu(discos);
	}
	
	public static void menu(Disco[] discos) {
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

	public static void borrar(Disco[] array, int cont){
        String codigo;
        System.out.println("Introduzca el codigo del disco que desea borrar");
        codigo = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo.equals(codigo)){
                array[i].codigo = "LBRE";
                cont--;
            }else
                System.out.println("No hay ningún disco con ese código");
        }
    }

	public static void modificar(Disco[] array){
        String codigo;
        System.out.println("Introduzca el codigo del disco que desea modificar");
        codigo = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo.equals(codigo)){
                System.out.println("Introduzca los nuevos datos del disco");
                array[i].autor = sc.nextLine();
                array[i].titulo = sc.nextLine();
                array[i].genero = sc.nextLine();
                array[i].duracion = sc.nextInt();
            }else
                System.out.println("No hay ningún disco con ese código");
        }
    }

	public static void nuevoDisco(Disco[] array, int cont){
        int i=0;
		while(i < array.length) {
            if (array[i].codigo == "LIBRE"){
                array[i].codigo = String.valueOf(cont);
                cont++;
                System.out.println("Introduzca los datos del nuevo disco");
                array[i].autor = sc.nextLine();
                array[i].titulo = sc.nextLine();
                array[i].genero = sc.nextLine();
                array[i].duracion = sc.nextInt();
                break;
            }else if(array[i].codigo != "LIBRE") {
            	i++;
            }
        }
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

