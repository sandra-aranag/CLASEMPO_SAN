package model;

import lombok.*;

@AllArgsConstructor

public class Contacto {

    private int id;
    private String nombre, apellido, dni;
    private int telefono; //en elemento separado para gestionarlo de forma correcta en el constructor.


    public Contacto() {
    }

    public Contacto(String nombre, String apellido, String dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.println("Mostrando datos del contacto " +nombre);
        System.out.println("id = " + id);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("telefono = " + telefono);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
