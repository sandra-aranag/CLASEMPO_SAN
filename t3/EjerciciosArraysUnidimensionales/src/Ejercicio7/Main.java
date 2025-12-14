package Ejercicio7;


/*Desarrolla un programa que cree un array de 6 números. Usa bucles for para encontrar el número mayor y el número
menor del array, y muestra ambos resultados.*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] numeros = new int[]{15, 8, 23, 4, 19, 12};
      /*  int mayor = numeros[0], menor = numeros[0];

        for (int item : numeros ) {

            if (item>mayor){
                mayor = item;
            }

            if (item<menor){
                menor = item;
            }
        }*/

        Arrays.sort(numeros);
        int menor = numeros[0], mayor = numeros[numeros.length-1];

        System.out.println("Numero mayor: " +mayor);
        System.out.println("Número menor: " +menor);
    }

}
