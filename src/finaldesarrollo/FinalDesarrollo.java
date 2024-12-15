
package finaldesarrollo;

public class FinalDesarrollo {

    
    public static void main(String[] args) {
        Computadora pc1= new Computadora("Dell", "inspiron", "f557", 20, 5, 5000, 8, 500, "i5 10400f");
        Impresora ip1= new Impresora ("Hp", "lx", "s500", 15, 20, 2000, "color",5000);
        Proyector p1= new Proyector("Samsung", "xj", "5j500",50 , 5, 2500, 6500);
        
        Stock stock = new Stock();
        stock.agregarProducto(pc1);
        stock.agregarProducto(ip1);

        System.out.println("Productos en stock:");
        System.out.println(stock.toString());

        System.out.println("Productos a reponer:");
        for (Producto p : stock.productosAReponer()) {
            System.out.println(p);
        }

        System.out.println("Valor total del stock: " + stock.stockValorizado());

        System.out.println("Productos mas caros que $500:");
        for (Producto p : stock.productosMasCaro(500)) {
            System.out.println(p);
        }
    }
     }
    

