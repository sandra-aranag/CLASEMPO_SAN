public class Main {

    static void main(String[] args) {

        //Autoboxing
        int numero = 100;
        Integer numeroComplejo = numero;

        //Unboxing
        int numeroPrimitivo = numeroComplejo;

        //OPERADORES
            //Aritmeticos: + - * / %
            //Asignacion: = =+ =- =* =/ =%
            //Relacionales: < <= == > >= !=
            //Lógicos: || && !

        int numero1=5;
        int numero2=6;
        int resultado = 5&6;
        System.out.println("El resultado de la comparación & es: "+resultado);

        numero1=12;
        numero2=13;
        resultado = numero1 | numero2;
        System.out.println("El resultado de la comparación | es: "+resultado);

       /* String palabra = "supercalifragilisticoespialidoso";
        System.out.println(palabra.length());*/

        numero1=23;
        numero2=25;
        String palabra = null;
        boolean resultadoBool = numero1>numero1 || numero2<100 || numero1!=0 || palabra.length()!=0;
        System.out.println("El resultado de la comparación es: " +resultadoBool);



        //conversores
        //CASTEO -> Cambiar tipo temporalmente (tipo)variable
        //PARSEO

        char letra = 200;
        System.out.println("La letra es: "+letra);

        String frase = "Esta frase la vamos a codificar";
        for (int i = 0; i < frase.length(); i++) {
            char letraPalabra = frase.charAt(i);
            int codigo = letraPalabra;
            //PARA CIFRAR EL CODIGO
            if (i%2==0){
                codigo*=2;
            } else{
                codigo*=4;
            }
            System.out.print(codigo+" ");
        }
    }

}
