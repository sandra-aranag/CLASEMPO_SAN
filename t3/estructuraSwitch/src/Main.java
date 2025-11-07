import java.sql.SQLOutput;

public class Main {


    static void main(String[] args) {
//EVALUAR DIA DE LA SEMANA Y VER SI LABORABLE O NO

        DiasSemana diaSemana = DiasSemana.Martes;
        //SI HAY UNA LINEA NO HAY QUE PONER LLAVES
        //Solo funciona si tengo un level de 14 o superior (tienes el 25 no worries)
        switch (diaSemana){
            case Lunes, Martes, Miercoles, Jueves -> System.out.println("Laborable");
            case Viernes -> System.out.println("Laborable, falta poco!!!!");
            case Sabado, Domingo -> System.out.println("Descanso");

            }

        System.out.println("La fecha de hoy es 7 de " +MesesAnio.Junio+" de 2025 y es " +DiasSemana.Viernes);
        System.out.printf("La fecha de hoy es %d de %s de %d y es %s y estamos en la estación de %s",7,
                MesesAnio.Noviembre,2025,DiasSemana.Viernes,MesesAnio.Noviembre.estacion);


        // Level 23
        //La variable a evaluar en los casos sea FINAL
        /*final int NUMERO = 22;
        switch (true){
            case (NUMERO>0 && NUMERO <10)->{
                System.out.println("2313");
            }
            case (NUMERO>10 && NUMERO <20)->{
                System.out.println("2313");
            }
            case (NUMERO>20 && NUMERO <30)->{
                System.out.println("2313");
            }
        }*/

        Operaciones operaciones = new Operaciones();
        operaciones.evaluarServidor("ok");



        }

    }


