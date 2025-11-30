package Ejercicio7;


/*Desarrolla un programa que cree un array de 6 números. Usa bucles for para encontrar el número mayor y el número
menor del array, y muestra ambos resultados.*/

public class Main {

    public static void main(String[] args) {
        int [] numeros = new int[]{15, 8, 23, 4, 19, 12};
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int item : numeros ) {

            if (item>mayor){
                mayor = item;
            }

            if (item<menor){
                menor = item;
            }
        }

        System.out.println("Numero mayor: " +mayor);
        System.out.println("Número menor: " +menor);
    }

}
