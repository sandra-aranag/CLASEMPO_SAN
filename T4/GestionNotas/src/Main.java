import model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Borja", "Martin", "123456A", 8);
        Alumno alumno2 = new Alumno("Sandra", "Arana", "66666a");
        Alumno alumno3 = new Alumno("Eva", "Pazos", "333333b");
        Alumno alumno4 = new Alumno("Jorge", "Martin", "454545a");
        Alumno alumno5 = new Alumno("Marta", "Hernandez", "12457896F");

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);

        /*for (Alumno item : alumnos) {
            item.mostrarDatos();
        }*/

        //FUNCIÓN DE FLECHA (ARROW FUNCTION O LAMBDA) son funciones que se llaman después de otras funciones
        //parámetros de la funcion->cuerpo de la función ||| param>cuerpo
        //tras la llamada a la funcion foreach, se llama en cada iteracin a la funcion de flecha definida en los parametros

        /*alumnos.forEach(element->{
            System.out.println("Vamos a imprimir los datos de "+element.getNombre());
            element.mostrarDatos();
        });*/

        alumnos.forEach(Alumno::mostrarDatos); // Los  :: significa-> acceso directo a un metodo
        alumnos.forEach(Alumno::calcularRestante);

        //map->recorro y transformo
        alumnos.stream().map(Alumno::getNota).forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> funcionMulti = (p1, p2)->p1*p2;
                /*
                * public int suma(int n, int p
                * */

    }

}
