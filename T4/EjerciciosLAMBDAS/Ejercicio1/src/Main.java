import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*Crea una función lambda que reciba un número entero y devuelva su cuadrado. Pruébala con los números del
        1 al 5.*/

        Function<Integer, Integer> cuadrado = n->n*n;
        IntStream.rangeClosed(1,5).forEach(n->
                System.out.println("Cuadrado de " +n+ " = " +cuadrado.apply(n)));


    }

}
