import java.util.Arrays;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {
        /*Implementa un BiPredicate que reciba dos Strings y determine si tienen la misma longitud. Pruébalo
        con varios pares de palabras.*/

        BiPredicate<String, String> palabra = (s1,s2)-> s1.length() == s2.length();

        String[][] pares = {
                {"Gato", "Perro"},
                {"Bombilla", "Taza"},
                {"Boli", "Bolo"}
        };

        Arrays.stream(pares).forEach(par->{
            String palabra1 = par[0];
            String palabra2= par[1];
            System.out.println("¿\"" + palabra1 + "\" y \"" + palabra2 + "\" tienen la misma longitud? "
                    + palabra.test(palabra1, palabra2));
        });

    }


}
