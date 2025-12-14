import controller.Agenda;

import java.util.Scanner;

public class MainAgenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Agenda agenda = new Agenda();
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
                    System.out.println("Introduce correo: ");
                    String correo = scanner.next();
                    System.out.println("Introduce dni: ");
                    String dni  = scanner.next();
                    System.out.println("Introduce teléfono: ");
                    int telefono = scanner.nextInt();
                    agenda.agregarContactos(new Object[]{nombre, apellido, correo, dni, telefono});
                }
                case 2->{
                    System.out.println("Indica el DNI que quieres buscar: ");
                    String dni = scanner.next();
                    agenda.borrarContacto(dni);
                }
                case 3->{
                    System.out.println("Indica el DNI que quieres buscar: ");
                    String dni = scanner.next();
                    agenda.buscarContacto(dni);

                }
                case 4->{
                    agenda.listarContactos();
                }
                case 5->{
                    System.out.println("Salir......");
                }
            }
        }while (opcion!=5);

    }
}
