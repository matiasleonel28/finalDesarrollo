
package finaldesarrollo;

import java.util.ArrayList;


public class Stock {
private ArrayList<Producto> listaDeStock;

public Stock(){
this.listaDeStock=new ArrayList <>();
}

public String toString(){
String cad= "";
for (Producto producto : listaDeStock) {
cad= cad+producto+"\n";
}
return cad;
}

public ArrayList<Producto> productosAReponer() {   //Punto 6
    ArrayList<Producto> aReponer = new ArrayList<>();
    for (Producto p : listaDeStock) { 
        if (p.getStock() < p.getStockMinimo()) {
            aReponer.add(p);
        } else {
            System.out.println("El producto tiene stock suficiente");
        }
    }
    return aReponer;
    
    
}
  
public float stockValorizado() {   //Punto 7
    float stockValorizado = 0;
    for (Producto p : listaDeStock) {
        stockValorizado += p.getPrecio() * p.getStock(); 
    }
    return stockValorizado; 
}

public ArrayList<Producto> productosMasCaro(int importe){  //Ejercicio 8
    ArrayList <Producto> listadeProductoMasCaro = new ArrayList <>(); {
        for (Producto p : listaDeStock){
            if (p.getPrecio()>importe){
            listadeProductoMasCaro.add(p);
            } else {
                System.out.println("El valor del producto es menor al importe");}
            
        }
        return listadeProductoMasCaro;
}
}

public void agregarProducto(Producto producto){
    if (listaDeStock.contains(producto)) {
        System.out.println("El producto ya está en el listado");
    }  else {
        listaDeStock.add(producto);
    }
}
}
