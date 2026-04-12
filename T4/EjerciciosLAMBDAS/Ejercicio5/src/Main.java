import java.util.function.BiConsumer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*Crea un BiConsumer que reciba un nombre (String) y una edad (Integer) e imprima un mensaje formateado
        como "Nombre: [nombre], Edad: [edad]". Úsalo para imprimir información de varios estudiantes.*/

        BiConsumer<String, Integer> persona = (nombre, edad)->
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);

        String[] nombres = {"Ana", "Paula", "Romina"};
        Integer[] edades = {30, 28, 33};

        IntStream.range(0, nombres.length)
                .forEach(i -> persona.accept(nombres[i], edades[i]));

    }


}
