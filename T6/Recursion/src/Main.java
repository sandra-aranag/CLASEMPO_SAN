import controller.ControllerMatematico;

public class Main {

    public static void main(String[] args) {

        ControllerMatematico controllerMatematico = new ControllerMatematico();

        for (int i = 0; i < 10; i++) {
            System.out.println("El número de FB de la posicion " +i + " es " +controllerMatematico.calculoNumeroFB(i));
        }

    }

}
