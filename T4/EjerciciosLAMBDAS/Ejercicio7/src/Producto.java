import java.util.Arrays;
import java.util.function.BiFunction;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("precio = " + precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static Producto obtenerMasCaro(Producto[] productos) {
        return Arrays.stream(productos)
                .reduce((p1, p2) -> p1.getPrecio() >= p2.getPrecio() ? p1 : p2)
                .orElse(null);
    }
}

