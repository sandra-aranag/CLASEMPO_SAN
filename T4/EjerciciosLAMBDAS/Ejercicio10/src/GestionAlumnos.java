import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class GestionAlumnos {

    private List<Alumno> alumnos;


    public GestionAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    // BiFunction: calcula nota final
    //- BiFunction para calcular la nota final (teoría 60%, práctica 40%)
    private final BiFunction<Double, Double, Double> calcularNotaFinal =
            (teoria, practica) -> teoria*0.6 + practica*0.4;

    //- BiPredicate para verificar si un alumno ha aprobado (nota >= 5)

    private final BiPredicate<Alumno, Double> aprobado =
            (al, nota) -> nota >=5;

    // - Function para convertir notas numéricas a letras (A, B, C, D, F)

    private final Function<Double, String> letra =
            nota -> {
        if (nota>=9) return "A";
        else if (nota >=7) return "B";
        else if(nota >= 5) return "C";
        else if(nota >= 4) return "D";
        else return "F";
    };

    //- BiConsumer para imprimir el informe completo del alumno
    private final BiConsumer<Alumno, Double> imprimirInforme = (al, nota) -> {
        System.out.println("Aumnos: " +al.getNombre());
        System.out.println("Nota teoría: " +al.getNotaTeoria());
        System.out.println("Nota práctica: " +al.getNotaPractica());
        System.out.println("Nota letra: " +letra.apply(nota));
        System.out.println("¿Has aprobado?: " +(aprobado.test(al,nota) ? "Sí" : "No"));

    };



    //- Predicate para filtrar alumnos aprobados/suspensos
    // Predicate para alumnos aprobados
    private final Predicate<Alumno> esAprobado = alumno ->
            aprobado.test(alumno, calcularNotaFinal.apply(alumno.getNotaTeoria(), alumno.getNotaPractica()));

    // Predicate para alumnos suspensos
    private final Predicate<Alumno> esSuspenso = esAprobado.negate();

    public void generarInforme() {
        alumnos.forEach(al -> {
            double notaFinal = calcularNotaFinal.apply(al.getNotaTeoria(), al.getNotaPractica());
            imprimirInforme.accept(al, notaFinal);
        });
    }

    public List<Alumno> obtenerAprobados() {
        return alumnos.stream()
                .filter(esAprobado)
                .toList();
    }

    public List<Alumno> obtenerSuspensos() {
        return alumnos.stream()
                .filter(esSuspenso)
                .toList();
    }
}
