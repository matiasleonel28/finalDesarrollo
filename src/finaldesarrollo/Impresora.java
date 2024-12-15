
package finaldesarrollo;


public class Impresora extends Producto {
    private String tipo;
    private int velocidad;

    public Impresora(String nombre, String marca, String modelo, int stock, int stockMinimo, double precio, String tipo, int velocidad) {
        super(nombre, marca, modelo, stock, stockMinimo, precio);
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()+ ", Marca:" + super.getMarca() + ", Modelo:" + super.getModelo()+ ", Stock:" + super.getStock() + ", Stock minimo:" +super.getStockMinimo() + ", Precio:" + super.getPrecio() + ", Tipo: " + tipo + ", Velocidad: " + velocidad ;
       
       
    }
}
