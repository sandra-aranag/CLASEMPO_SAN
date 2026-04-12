import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Main {

    /*Crea una BiFunction que reciba dos números enteros y devuelva su suma. Después, crea otras tres BiFunctions
    para resta, multiplicación y división.*/


    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> suma = (n1, n2)->n1+n2;
        BiFunction<Integer, Integer, Integer> resta = (n1, n2)->n1-n2;
        BiFunction<Integer, Integer, Integer> multi = (n1, n2)->n1*n2;
        BiFunction<Integer, Integer, Integer> division = (n1, n2)->n1/n2;

        int n1=10;
        int n2= 5;

        System.out.println("Suma: " +suma.apply(n1,n2));
        System.out.println("Resta: " +resta.apply(n1,n2));
        System.out.println("Multiplicación: " +multi.apply(n1,n2));
        System.out.println("División: " +division.apply(n1,n2));
    }

}
