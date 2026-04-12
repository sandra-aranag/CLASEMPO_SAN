import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        /*Implementa una BiFunction que reciba dos listas de enteros y devuelva una nueva lista con todos los
        elementos de ambas listas, pero sin duplicados y ordenada de menor a mayor.*/

        List<Integer> lista1 = Arrays.asList(5, 2, 9, 1, 5);
        List<Integer> lista2 = Arrays.asList(3, 9, 7, 2, 10);
        System.out.println("Lista 1: "+lista1);
        System.out.println("Lista 2: "+lista2);


        BiFunction<List<Integer>, List<Integer>, List<Integer>> combinarYOrdenar = (li, l2) ->{
            return Stream.concat(lista1.stream(), lista2.stream()).distinct().sorted()
                    .collect(Collectors.toList());
        };

        List<Integer> resultado = combinarYOrdenar.apply(lista1, lista2);
        System.out.println("Lista combinada, sin duplicados y ordenada: " + resultado);

    }


}
