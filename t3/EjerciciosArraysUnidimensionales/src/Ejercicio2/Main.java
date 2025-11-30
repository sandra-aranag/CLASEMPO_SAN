package Ejercicio2;

public class Main {

    /*Escribe un programa que cree un array de 6 números enteros. Usa un bucle for para recorrer el array y
    mostrar cada número junto con su posición (índice).*/
    public static void main(String[] args) {

        int []  numeros = new int[]{10,20,30,40,50,60};
        int posicion=0;

        System.out.println("Recorriendo el array: ");
        for ( int item : numeros) {
            System.out.println("Posición " +posicion+ ": " +item);
            posicion++;
        }

    }

}
