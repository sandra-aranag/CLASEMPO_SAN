public enum MesesAnio {
    Enero("invierno", 1), Febrero("invierno", 2), Marzo("primavera",3),
    Abril("primavera",4), Mayo("primavera",5), Junio("Verano",6),
    Julio("Verano",7), Agosto("Verano",8), Septiembre("Otoño",9),
    Octubre("Otoño",10), Noviembre("Otoño",11), Diciembre("Invierno",12);

    //ESTO DE AQUI ABAJO ES UN CONSTRUCTOR.
    //VALE PARA CREAR LOS ENUM DE MesesAnio
    int numeroMes;
    String estacion;
    MesesAnio(String estacionP, int numeroMesP){
        estacion = estacionP;
        numeroMes = numeroMesP;
    }
}
