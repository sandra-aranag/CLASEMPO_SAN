package Ejercicio5;

/*Escribe un programa que defina un array de 10 números enteros. Usa un bucle for para contar cuántos números son
mayores que 50 y muestra el resultado.*/


public class Main {

    public static void main(String[] args) {

        int [] numeros = new int[]{23, 67, 45, 89, 12, 56, 78, 34, 90, 43};
        int mayor = 0;

        for (int item : numeros) {
            if (item>50){
                mayor++;
            }
        }
        System.out.println("Cantidad de números mayores que 50: " +mayor);
    }

}
