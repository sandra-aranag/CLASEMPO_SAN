import java.util.Objects;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        /*Crea una clase Producto con nombre y precio. Implementa una BiFunction que reciba dos Productos y
        devuelva el producto con mayor precio. Pruébala con una lista de al menos 5 productos.*/

        Producto producto1 = new Producto("Taza", 12.50);
        Producto producto2 = new Producto("Libro", 23.95);
        Producto producto3 = new Producto("Exlibris", 49.99);
        Producto producto4 = new Producto("Boli", 3.99);
        Producto producto5 = new Producto("Cámara de fotos", 300.49);

        Producto[] productos = {producto1, producto2, producto3, producto4, producto5};

        Producto masCaro = Producto.obtenerMasCaro(productos);

        System.out.println("El producto más caro es:");
        masCaro.mostrarDatos();

    }

}
