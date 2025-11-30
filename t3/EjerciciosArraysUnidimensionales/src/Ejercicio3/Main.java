package Ejercicio3;

import java.util.Scanner;

public class Main {

    /*Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for para pedir al usuario que introduzca
    5 nombres, guardándolos en el array. Al final, muestra todos los nombres almacenados.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] nombres = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el nombre "+ (i+1));
            nombres [i] = scanner.nextLine();
        }

        System.out.println("Nombres introducidos: ");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);
        System.out.println(nombres[4]);

    }

}
