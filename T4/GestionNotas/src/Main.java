import controller.Gestor;
import model.Alumno;

public class Main {

    public static void main(String[] args) {

        Gestor gestor = new Gestor();
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "1234f",1));
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "156", 8));
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "124f", 2));
        gestor.agregarAlumno(new Alumno("Alumno1", "Alumno1", "4564", 9));
        //gestor.mostrarAlumno();
        //gestor.calcularMedia();

       /* if(gestor.getAlumnoByDni("1234f").isPresent()){
            System.out.println("El alumno está");
        }else {
            System.out.println("El alumno no está");
        }*/

        String dni = "678";
        //gestor.getAlumnoByDni(dni).ifPresent(Alumno::mostrarDatos);
        gestor.getAlumnoByDni(dni).ifPresentOrElse(Alumno::mostrarDatos,
                ()-> gestor.agregarAlumno(new Alumno("Nuevo", "Nuevo", dni, 7)));
        gestor.getAlumnoByDni(dni).ifPresentOrElse(Alumno::mostrarDatos,
                ()-> gestor.agregarAlumno(new Alumno("Nuevo", "Nuevo", dni, 7)));

        //gestor.ordenarNotas();
        //gestor.mostrarAlumno();

        //gestor.getAlumnosUmbral(6);
        gestor.getAlumnosUmbral((item, nota)-> item.getNota()>nota, 8);

    }

}
