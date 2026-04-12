package controller;

import model.Producto;

import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {

    private List<Producto> productos;

    public Gestor(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        //¿Existe el codigo del producto que está intentando agregar?
      boolean existe =
              productos.stream()
                      .anyMatch(item->item.getCodigo().equalsIgnoreCase(p.getCodigo()));
      if(existe){
          System.out.println("Código ya usado. No se puede agregar");
      } else{
          productos.add(p);
          System.out.println("Producto agregado correctamente");
      }

  /*    if (buscarPorCodigo(p.getCodigo()).isPresent()){
          System.out.println("No puedo agregar, codigo duplicado");
      }else{
          productos.add(p);
      }*/

    }

    public void asignarPrecios(){
        productos.stream()
                .filter(item->item.getPrecio()<0)
                .forEach(item->item.setPrecio((Math.random()*100)+1));
    }

    public void mostrarProductos(){
        productos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio(){

        return productos.stream().mapToDouble(Producto::getPrecio).average().orElse(0.0);
    }

    public long getNumeroProductosCaros(double limite){
        return productos.stream().filter(item->item.getPrecio()>=limite).count();
    }

    public List<Producto> getListaProductosCaros(double limite){
        return productos.stream().filter(item->item.getPrecio()>=limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo){
        return productos.stream().filter(item->item.getCodigo().equalsIgnoreCase(codigo))
                .findFirst();
    }

    public void ordenarProductos(){
        productos.sort(Comparator.comparing(Producto::getPrecio));
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion, double valor){
        return productos.stream().filter(item->condicion.test(item, valor)).toList();
    }


}
