import model.Equipo;
import model.Partido;

public class Main {


    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Equipo1");
        Equipo equipo2 = new Equipo("Equipo2");
        Equipo equipo3 = new Equipo("Equipo3");
        Equipo equipo4 = new Equipo("Equipo4");

        Partido partido1 = new Partido(equipo1, equipo2, 3, 0);
        Partido partido2 = new Partido(equipo1, equipo2, 2, 1);

        equipo2.mostrarEstadisticas();

    }

}
