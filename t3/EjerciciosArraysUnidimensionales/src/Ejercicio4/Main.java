package Ejercicio4;

/*Crea un programa con un array de 7 números. Pide al usuario un número a buscar y usa un bucle for para recorrer el
array. Si el número existe, muestra su posición. Si no existe, indica que no se encontró.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[]{5, 12, 8, 3, 15, 9, 6};
        System.out.println("Introduce el número a buscar: ");
        int numeroBuscado = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado){
                encontrado=true;
                System.out.println("El número " +numeroBuscado+ " se encuentra en la posición " +i);
                break;
            }


        }
        if (!encontrado){
            System.out.println("El número " +numeroBuscado+  " no se encuentra en el array.");
        }
        scanner.close();
    }


}
