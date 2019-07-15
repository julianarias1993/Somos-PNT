package ejercicioPnt;

public class Fruta extends Producto{
    public Fruta(String nombre, Integer precio, String unidad) {
        super(nombre, precio, unidad);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +" /// Precio: $"+ this.getPrecio() +" /// Unidad de venta: "+ this.getUnidad();
    }
}