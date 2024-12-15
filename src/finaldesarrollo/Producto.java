
package finaldesarrollo;




public abstract class Producto {
    private String nombre;
    private String marca;
    private String modelo;
    private int stock;
    private int stockMinimo;
    private double precio;
    
 public Producto (String nombre,String marca,String modelo,int stock,int stockMinimo, double precio){
     this.nombre=nombre;
     this.marca=marca;
     this.modelo=modelo;
     this.stock=stock;
     this.stockMinimo=stockMinimo;
     this.precio=precio;
 }
 
    
 public abstract String toString();
 
 public boolean productoAReponer() {
        if (stock<stockMinimo){
            return true;
        }else{
        return false;
        }
    }
// otra manera es 
/*public boolean productoAReponer() {
    return stock < stockMinimo;
}*/ 

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getStock() {
        return stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public double getPrecio() {
        return precio;
    }

    


}
