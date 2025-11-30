package Ejercicio8;


/*Crea un programa con un array de 10 palabras (pueden repetirse). Pide al usuario una palabra y usa un bucle for para
contar cuántas veces aparece esa palabra en el array.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String [] palabra = new String[]{"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};

        System.out.println("¿Qué palabra vas a buscar?");
        String palabraPedida = scanner.nextLine();
        int contador=0;

        for (String item : palabra ) {

            if (palabraPedida.equals(item)){
                contador++;

            }

        }


        System.out.println("La palabra aparece " +contador+ " veces en el array.");

    }

}
