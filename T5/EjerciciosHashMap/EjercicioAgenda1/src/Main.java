public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();


        agenda.agregarContacto(new Contacto("Ana", "123456789"));
        agenda.agregarContacto(new Contacto("Borja", "987654321"));
        agenda.agregarContacto(new Contacto("Carla", "555555555"));
        agenda.agregarContacto(new Contacto("Diana", "444444444"));

        //total contactos
        System.out.println("Número total de contactos: " +agenda.contarContactos());

        //Buscar contacto
        String telefono = agenda.buscarContacto("Carla");
        System.out.println("Teléfono de Carla: " + telefono);

        //Listado
        System.out.println("Listado de contactos: ");
        agenda.listarContactos();

        //borrar contacto
        if (agenda.borrarContacto("Diana")) {
            System.out.println("Diana eliminada correctamente");
        } else {
            System.out.println("No se pudo eliminar a Diana");
        }

        System.out.println("Listado de contactos actualizado:");
        agenda.listarContactos();

        System.out.println("Número total de contactos: " + agenda.contarContactos());



    }

}
