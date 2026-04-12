import java.util.HashMap;

public class Agenda {

    HashMap<String, Contacto> listaContactos;

    public Agenda(){
        listaContactos = new HashMap<>();
    }

    //Crear metodo void agregarContacto(String nombre, String telefono) que añada o actualice un contacto.

    public void agregarContacto(Contacto contacto){
        if (listaContactos.containsKey(contacto.getNombre())){
            System.out.println("No se puede agregar, contacto duplicado");
        } else {
            listaContactos.put(contacto.getNombre(), contacto);
        }
    }

    //Crear metodo String buscarContacto(String nombre) que devuelva el teléfono del contacto o un mensaje si no existe.

    public String buscarContacto(String nombre){
        return listaContactos.containsKey(nombre)
                ? listaContactos.get(nombre).getTelefono()
                : "No encontrado";
    }

    //Crear metodo boolean eliminarContacto(String nombre) que elimine un contacto si existe.

    public boolean borrarContacto(String nombre){
        if(listaContactos.containsKey(nombre)){
            return listaContactos.remove(nombre) != null;
        }
        return false;
    }

    //Crear metodo void listarContactos() que muestre todos los contactos en la agenda.

    public void listarContactos(){
        listaContactos.values().forEach(contacto -> {
            System.out.println("Nombre: " + contacto.getNombre());
            System.out.println("Teléfono: " + contacto.getTelefono());
            System.out.println("----------------------");
        });
    }

    //Crear metodo int contarContactos() que devuelva el número total de contactos.
    public int contarContactos(){
        return listaContactos.size();
    }

    //Crear metodo boolean existeContacto(String nombre) que verifique si un contacto existe.

    public boolean existeContacto(String nombre){
        return listaContactos.containsKey(nombre);
    }


}
