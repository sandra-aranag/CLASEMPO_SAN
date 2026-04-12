package model;

public enum Categoria {

    ALIMENTACION(),
    MUEBLES("Esta es la categoría de muebles"),
    ROPA(),
    TECNOLOGIA("Esta es tecnologia");


    private String descripcion;
    Categoria(){}

    Categoria(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
