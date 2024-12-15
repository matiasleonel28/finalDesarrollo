
package finaldesarrollo;


public class Proyector extends Producto {
    private int lumen;
    
    public Proyector(String nombre, String marca, String modelo, int stock, int stockMinimo, double precio, int lumen){
        super(nombre, marca, modelo, stock, stockMinimo, precio);
        this.lumen=lumen;
    }
    
    public String toString() {
        return "Nombre: " + super.getNombre()+ ", Marca:" + super.getMarca() + ", Modelo:" + super.getModelo() + ", Stock:" + super.getStock() + ", Stock" + super.getStock() + ", Stock minimo:" + super.getStockMinimo() + ", Precio:" + super.getPrecio() + ", Lumenes:" + lumen;
}

}