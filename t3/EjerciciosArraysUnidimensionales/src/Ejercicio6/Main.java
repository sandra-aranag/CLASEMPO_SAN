package Ejercicio6;

/*Crea un programa con un array de 8 números decimales. Recorre el array con un bucle for para calcular la suma de
todos los elementos. Luego, calcula y muestra el promedio.*/

public class Main {

    public static void main(String[] args) {

        double [] decimales = new double[]{4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};
        double suma = 0;
        for (double item : decimales ) {

           suma += item;
        }

        double promedio = suma / decimales.length;

        System.out.println("Suma total: " +suma);
        System.out.println("El promedio es: " +promedio);
    }

}
