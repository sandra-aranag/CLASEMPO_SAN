import controller.Agenda;
import controller.AgendaContacto;
import model.Contacto;

import java.util.Scanner;

public class MainContacto {


    public static void main(String[] args) {
        AgendaContacto agendaContacto = new AgendaContacto();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        //System.out.println("El tamaño de la lista es de " +agenda.getListaContactos());


        do {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Borrar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar contactos");
            System.out.println("5. Salir");
            System.out.println("¿Qué opción quieres hacer?");

            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Introduce nombre: ");
                    String nombre = scanner.next();
                    System.out.println("Introduce apellido: ");
                    String apellido = scanner.next();
                    System.out.println("Introduce dni: ");
                    String dni  = scanner.next();
                    System.out.println("Introduce teléfono: ");
                    int telefono = scanner.nextInt();
                    agendaContacto.agregarContacto(new Contacto(nombre, apellido, dni, telefono));
                }
                case 2->{
                   System.out.println("Introduce dni: ");
                    String dni  = scanner.next();
                    agendaContacto.borrarContacto(dni);
                }
                case 3->{
                    System.out.println("Introduce dni: ");
                    String dni  = scanner.next();
                    agendaContacto.buscarContacto(dni);

                }
                case 4->{

                    agendaContacto.listarContactos();
                }
                case 5->{
                    System.out.println("Salir......");
                }
            }
        }while (opcion!=5);
    }
}
