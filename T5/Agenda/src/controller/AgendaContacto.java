package controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.Contacto;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor

public class AgendaContacto {

    private ArrayList<Contacto> listaContactos;
    private int id;
    public AgendaContacto(){
        listaContactos = new ArrayList<>();
        id = 1;
    }

    public void agregarContacto(Contacto contacto){
       //Solo lo tengo que hacer cuando el dni del contacto a agregar no está en la lista

        if (estaContacto(contacto.getDni())==null){
        //el contacto no está, por lo que lo añado
            contacto.setId(id);
            listaContactos.add(contacto);
            id++;
        } else {
            System.out.println("No se puede añadir porque el dni está duplicado");
        }


    }

    public void borrarContacto(String dni){

        Contacto contacto = estaContacto(dni);
        if (contacto!=null){
            listaContactos.remove(contacto);
            System.out.println("Borrado correctamente");
        } else{
            System.out.println("Contacto no encontrado. No se puede borrar");
        }

    }

    public void buscarContacto(String dni){

        Contacto contacto = estaContacto(dni);
        if (contacto!=null){
           contacto.mostrarDatos();
        } else{
            System.out.println("Contacto no encontrado.");
        }

    }

    public void listarContactos(){
        for (Contacto contacto : listaContactos) {
            contacto.mostrarDatos();
        }
    }

    public void vaciarLista(){
        listaContactos.clear();
    }

    private Contacto estaContacto(String dni){
        //dni
        //lista
        //recorrer y preguntar
        for (Contacto contacto : listaContactos) {
            if (contacto.getDni().equals(dni)){
                return contacto;
            }

        }
        return null;
    }

}
