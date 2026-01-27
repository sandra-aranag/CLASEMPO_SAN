package model;

public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private int gLocal, gVisitante;
    private boolean jugado;

    public void jugarPartido(){
        if (!jugado){
            gLocal = (int) (Math.random()*4);
            gVisitante = (int) (Math.random()*4);
            jugado=true;
        }else{
            System.out.println("Partido ya disputado.");
        }
    }
    public Partido(){}

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int gLocal, int gVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.gLocal = gLocal;
        this.gVisitante = gVisitante;
        equipoLocal.setgFavor(equipoLocal.getgFavor()+gLocal);
        equipoLocal.setgContra(equipoLocal.getgContra()+gVisitante);
        equipoVisitante.setgFavor(equipoVisitante.getgFavor()+gVisitante);
        equipoVisitante.setgContra(equipoVisitante.getgContra()+gLocal);
        jugado=true;
    }

    public void mostrarDatos(){
        System.out.printf("%s:%d VS %d:%s%n", equipoLocal.getNombre(), gLocal,
                gVisitante, equipoVisitante.getNombre());
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getgLocal() {
        return gLocal;
    }

    public void setgLocal(int gLocal) {
        this.gLocal = gLocal;
    }

    public int getgVisitante() {
        return gVisitante;
    }

    public void setgVisitante(int gVisitante) {
        this.gVisitante = gVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }
}
