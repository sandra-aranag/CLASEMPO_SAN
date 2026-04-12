import controller.Gestor;
import model.Categoria;
import model.Producto;

public class Main {

    public static void main(String[] args) {

        Producto television = new Producto("TV LG", "0GK_15", Categoria.TECNOLOGIA);
        Producto silla = new Producto("Baga", "124_ag", 200.0, Categoria.MUEBLES);

        Gestor gestor = new Gestor();
        gestor.agregarProducto(television);
        gestor.agregarProducto(silla);
        //System.out.println(gestor.calcularPrecioMedio());
        gestor.getProductosPorCondicion((item, val)-> item.getPrecio()>val
        , 90.0);


    }

}
