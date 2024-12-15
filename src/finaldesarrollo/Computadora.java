
package finaldesarrollo;


public class Computadora extends Producto {
    private int memoria;
    private int disco;
    private String procesador;

    public Computadora(String nombre, String marca, String modelo, int stock, int stockMinimo, double precio, int memoria, int disco, String procesador) {
        super(nombre, marca, modelo, stock, stockMinimo, precio);
        this.memoria = memoria;
        this.disco = disco;
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre()+ ", Marca:" + super.getMarca() + ", Modelo:" + super.getModelo()+ ", Stock:" + super.getStock() + ", Stock minimo:" +super.getStockMinimo() + ", Precio:" + super.getPrecio() + ", Memoria:" + memoria + " gb Ram, Disco:" + disco + " GB, Procesador:" + procesador;
    }
    

}
