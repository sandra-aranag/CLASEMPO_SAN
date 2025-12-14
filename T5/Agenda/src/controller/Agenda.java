package controller;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Agenda {

    //Atributos -> Sirve para cualificar ls clases
    private ArrayList<Object[]> listaContactos;

    //CONSTRUCTOR
    public Agenda(){
        listaContactos = new ArrayList<>(); //Ahora no es un valor null, sino una lista en la que meter cosas.
    }

    //MÉTODOS
        //agregar
    public void agregarContactos(Object[] contacto){
        listaContactos.add(contacto);
        System.out.println("Contacto agregado correctamente");
        //MENSAJE DE ERROR PARA QUE NO DEJE REGISTRAR  CONTACTOS CON E L MISMO DNI
    }

        //borrar

    public void borrarContacto(String dni){

     boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
         @Override
         public boolean test(Object[] objects) {
             return objects[3].equals(dni);
         }
     });
     if(borrado){
         System.out.println("Contacto borrado correctamente");
     }else{
         System.out.println("Contacto no encontrado");
     }

       /* for (Object[] item : listaContactos) {
            if(item[3].equals(dni)){
                listaContactos.remove(item);
                return;
            }
        }
        System.out.println("No encontrado.");*/
    }

        //buscar
    public void buscarContacto(String dni){
        for (Object[] item : listaContactos) {
            if(item[3].equals(dni)){
                System.out.println("Contacto encontrado: ");
                System.out.println("Nombre "+item[0]);
                System.out.println("Correo "+item[2]);
                System.out.println("Teléfono "+item[4]);
                return;
            }
        }
        System.out.println("No encontrado.");
    }

        //listar contactos
    public void listarContactos(){
        for (Object[] item : listaContactos) {
                System.out.println("Contacto encontrado: ");
                System.out.println("Nombre "+item[0]);
                System.out.println("Correo "+item[2]);
                System.out.println("Teléfono "+item[4]);
                return;
        }
    }

    //GETTER Y SETTER
    //Los necesitamos porque como son privados no son accesibles directamente.
    public ArrayList<Object[]> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Object[]> listaContactos) {
        this.listaContactos = listaContactos;
    }





}
