import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*Utiliza Function y el metodo andThen() para crear una cadena de operaciones: toma un número,
        súmale 10, multiplícalo por 2, y conviértelo a String. Aplícalo a una lista de números.*/

        Function<Integer, Integer> suma10 = n-> n+10;
        Function<Integer, Integer> multi20 = n->n*2;
        Function<Integer, String> aString = n->"Resultado: "+n;

        Function<Integer, String> operaciones = suma10.andThen(multi20).andThen(aString);

        IntStream.rangeClosed(1,5).mapToObj(operaciones::apply).forEach(System.out::println);


    }

}
