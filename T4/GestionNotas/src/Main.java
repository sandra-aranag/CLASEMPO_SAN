import controller.Gestor;
import model.Alumno;

public class Main {

    public static void main(String[] args) {

        Gestor gestor = new Gestor();
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "1234f",1));
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "156", 8));
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "124f", 8));
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "4564", 9));
        //gestor.mostrarAlumno();
        gestor.calcularMedia();


    }

}
