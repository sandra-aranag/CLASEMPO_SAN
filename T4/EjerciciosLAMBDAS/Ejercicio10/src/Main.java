import java.util.List;

public class Main {
/*Crea un sistema de gestión de calificaciones que utilice:

- BiFunction para calcular la nota final (teoría 60%, práctica 40%)
- BiPredicate para verificar si un alumno ha aprobado (nota >= 5)
- Function para convertir notas numéricas a letras (A, B, C, D, F)
- BiConsumer para imprimir el informe completo del alumno
- Predicate para filtrar alumnos aprobados/suspensos

Implementa una clase Alumno con nombre, nota de teoría y nota de práctica.
Crea una lista de al menos 8 alumnos y aplica todas las funciones lambda para generar un informe completo.*/
    public static void main(String[] args) {

        GestionAlumnos gestor = new GestionAlumnos();
        gestor.agregarAlumno(new Alumno("Ana", 7.5, 8));
        gestor.agregarAlumno(new Alumno("Borja", 6, 4));
        gestor.agregarAlumno(new Alumno("Diana", 4, 5));
        gestor.agregarAlumno(new Alumno("Eva", 8, 7));
        gestor.agregarAlumno(new Alumno("Fabián", 3, 4));
        gestor.agregarAlumno(new Alumno("Gabriela", 10, 9));
        gestor.agregarAlumno(new Alumno("Héctor", 5, 6));
        gestor.agregarAlumno(new Alumno("Irene", 6.5, 7.5));


        gestor.generarInforme();

        System.out.println("Aprobados:");
        gestor.obtenerAprobados().forEach(al -> System.out.println(al.getNombre()));

        System.out.println("Suspensos:");
        gestor.obtenerSuspensos().forEach(al -> System.out.println(al.getNombre()));
    }

    }

