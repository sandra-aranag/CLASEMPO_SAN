import java.util.Scanner;

public class Ejercicio {

    private Scanner lecturaTeclado;

    /*EJERCICIO 1: Hágase una aplicación que permita introducir el número de bebidas y bocadillos
        comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
        bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
        €). También se podrá introducir el número de alumnos que realizaron la compra
        (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
        bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
        redondeada a 2 decimales. (CosteBar)*/


    public void ejercicio1(){
        // 1.- introducir valores
        // 2.- guardar en variables



        System.out.println("Cuántos bocatas vais a pedir");
        lecturaTeclado = new Scanner(System.in);
        int numeroBocatas = lecturaTeclado.nextInt();

        System.out.println("Cuántas bebidas vais a pedir");
        lecturaTeclado = new Scanner(System.in);
        int numeroBebidas = lecturaTeclado.nextInt();

        System.out.println("Cuánto cuesta cada vbocata");
        lecturaTeclado = new Scanner(System.in);
        double precioBocata = lecturaTeclado.nextDouble();

        System.out.println("Cuánto cuesta cada bebida");
        lecturaTeclado = new Scanner(System.in);
        double precioBebida = lecturaTeclado.nextDouble();

        System.out.println("Cuántas personas entran en la cuenta");
        int personas = lecturaTeclado.nextInt();

        // 3.-Realizar calculos

        double precioBocatas = numeroBocatas*precioBocata;
        double precioBebidas = numeroBebidas*precioBebida;
        double costeTotal = precioBocatas*precioBebidas;
        double precioPersona = costeTotal/personas;

        // 4.- Mostrar datos

        System.out.printf("El precio de los bocatas es %.2f%n",precioBocatas); //aqui formateams, no concatenamos. Por eso está la coma y no el +
        System.out.printf("El precio de las bebidas es %.2f%n",precioBebidas);
        System.out.printf("El precio total es %.2f%n" ,costeTotal);
        System.out.printf("El precio por persona es %.2f%n",precioPersona);
        lecturaTeclado.close();
    }

    /*EJERCICIO 4: Hágase un programa que convierta segundos en horas, minutos y segundos.*/
    public void ejercicio4(){
        lecturaTeclado = new Scanner(System.in);
        //1. pedir datos
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int segundosTotal = lecturaTeclado.nextInt(); //24973

        //2. realizar calculos
            //Segundos en una hora -> 3600
            //minutos en una hora -> 60
            //segundos en un minuto -> 60

        int horas = segundosTotal/3600;
        int minutos = (segundosTotal%3600)/60;
        int segundos = segundosTotal%60;

        // 3. mostrar datos
        System.out.println("El numero de horas es "+horas);
        System.out.println("El numero de minitos "+minutos);
        System.out.println("El numero de segundos "+segundos);
        lecturaTeclado.close();
        lecturaTeclado=null; //para borrar memoria.




    }

    /*
    * Permítase introducir el valor con IVA de una compra con dos decimales (la
    * compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha
    * compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto fue
    * el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra) */

}
