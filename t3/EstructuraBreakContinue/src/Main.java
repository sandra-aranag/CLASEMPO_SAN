public class Main {
 //Break -> para la repetición en el momento donde se indica. SIEMPRE la última línea del cuerpo de repetición.
    //RETURN-> Retorna un valor (el metodo). El metodo termina. Es la última línea del  metodo.
    //CONTINUE-> Vas a pasar el turno cuando te indiquen
    //IF TERNARIO - Decide el valor de una variable dependiendo de una condicion logica
    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            System.out.println("Repitiendo..." +i);
            if (i==3){
                break; //solo se repite una vez.
            }

        }*/
        /*  for (int i = 0; i < 10; i++) {
            System.out.println("La tabla del " +i);
            for (int j = 0; j < 10; j++) {
                System.out.printf("El resultado de %d * %d = %d%n", i,j,i*j);
                if (j==1){
                    break;
                }
            }
        }*/
        /* do{
            acumulador += (int) (Math.random()*41);
            if (acumulador>100 && acumulador<125){
                System.out.println("Te acercas peligrosamente");
            }
            return;
        }while (acumulador <= 301);*/
        /* while(acumulador<301){
            System.out.println("Acumulador insuficiente");
            return;
        }*/
        /*  int acumulador=1000;
        System.out.println("El acumulador tiene un valor de " +acumulador);
        System.out.println("Terminando el programa");
        int[] numeros = {1,4,34,12,-56,12,-56,78,-12,56}; //length :10; primera posicion: 0; ultima posicion: 9;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<0){
                continue; //asi no saca los numeros negativos
            }
            System.out.println(numeros[i]);
        }*/

        int nota = 7;
        //IF NORMAL:

      /*  if (nota>=5){
            System.out.println("Examen aprobado");
        } else{
            System.out.println("Examen suspenso");
        }*/



    //IF TERNARIO. una variable va a tomar un valor que depende de una condición lógica,


        String resultado = nota<5 ? "suspenso" : "aprobado"; //HE HECHO LO MISMO QUE ARRIBA CON MENOS CODIGO
        char letraNota = nota<=5 ? 'A' : 'F';
        System.out.println(resultado);
        System.out.println(letraNota);


    }



}
