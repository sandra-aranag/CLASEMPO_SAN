import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

            /*Crea varios Predicates para filtrar una lista de números:

- Números mayores que 50
- Números pares
- Números divisibles por 3

Combínalos usando `and()`, `or()` y `negate()` para crear filtros complejos.*/

        List<Integer> numeros = IntStream.rangeClosed(1, 60).boxed().toList();

        Predicate<Integer> mayor50 = n->n>50;
        Predicate<Integer> esPar = n->n%2 == 0;
        Predicate<Integer> divisible3 = n->n%3==0;

        //Mayores que 50 y es par
        List<Integer> resultado1 =
                numeros.stream().filter(mayor50.and(esPar)).toList();
        System.out.println("Mayores que 50 y pares: " +resultado1);

        //Pares o divisibles por 3

        List<Integer> resultado2=
                numeros.stream().filter(esPar.or(divisible3)).toList();
        System.out.println("Números pares o divisibles entre 3: " +resultado2);

        //impares
        List<Integer> resultado3=
                numeros.stream().filter(esPar.negate()).toList();
        System.out.println("Números impares: " +resultado3);

        //mayores que 50 y pares o divisible por 3
        List<Integer> resultado4=
                numeros.stream().filter(mayor50.and(esPar).or(divisible3)).toList();
        System.out.println("Mayores que cincuenta y pares o divisibles entre 3: " +resultado4);




    }

}
