package model;

public class Alumno {

    private String nombre, apellido, dni;
    int nota;

    public Alumno(String nombre, String apellido, String dni, int nota){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.nota=nota;
    }
    //sobrecarga
    public Alumno(String nombre, String apellido, String dni){
        this(nombre, apellido, dni,-1);
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("nota = " + nota);
    }

    public void calcularRestante(){
        int restante = 100-nota;
        System.out.println(restante);
    }

    public int getNota(int nota){
        return nota;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
