import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*Utiliza un Predicate para crear una función lambda que determine si un número es par. Aplícala a una
        lista de números del 1 al 20 y muestra solo los pares.*/

        Predicate<Integer> esPar = n->n%2==0;
        IntStream.rangeClosed(1,20).filter(esPar::test).forEach(System.out::println);

    }

}
