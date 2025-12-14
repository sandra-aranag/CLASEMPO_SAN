import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {

    static ArrayList<Object[]> listaContactos = new ArrayList<>();
    public static void main(String[] args) {
        // Agenda de contactos -> ArrayList<Object[]> (porque no sé cuánto voy a guardar)
            //Necesito poder guardar tantos contactos como yo quiera
            //Cada contacto tiene unos datos FIJOS-> nombre, apellido, dni, tlf ->(array) Object[]


        listaContactos.add(new Object[]{"Rue", "Ruri", "12345A", 333666});
        listaContactos.add(new Object[]{"Kurtis", "K", "456789B", 666333});
        listaContactos.add(new Object[]{"Marta", "Hernandez", "45898B", 2225556});
        mostrarContactos();
        System.out.println("Vamos a sacar solo el nombre del último contacto: ");
       Object[] contacto = listaContactos.getLast();
        System.out.println(contacto[0]);
        System.out.println("Procedemos a borrar un elemento...");
        //borrarContactos("45898B");
        listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                return objects[2].equals("45898B");
            }
        });
        mostrarContactos();

    }

    public static void mostrarContactos(){
        for (Object[] contacto : listaContactos) {
            System.out.println("Impriendo datos del contacto...");
            System.out.printf("\tNombre: %s Apellido: %s DNI: %s Telf: %d%n",
                    contacto[0], contacto[1], contacto[2], (int)contacto[3]);
        }
    }

    public static void borrarContactos(String dni){
        //listaContactos.remove(posicion)->borra el elemento de dicha posicion
        for (int i = 0; i < listaContactos.size(); i++) {
            if (listaContactos.get(i)[2].equals(dni)){
                listaContactos.remove(i);
                break;
            }
        }
    }

}
