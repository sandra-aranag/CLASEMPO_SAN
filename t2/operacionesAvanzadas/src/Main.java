
//Como el Main está fuera de los paquetes, está en una jerarquía distinta al resto de clases.
//Así que tenemos que importarla:

import controller.GestorDocumental;
import controller.GestorUsuarios;
import java.util.Scanner;
//si pones import controller.* si necesitas importar TODAS las clases de un paquete, pero es peligroso

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        GestorDocumental gestorDocumental = new GestorDocumental();
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.evaluarUsuario("");
        gestorDocumental.archivarDocumento("");


    }



}
