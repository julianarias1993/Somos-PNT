package ejercicioPnt;

public class Bebida extends Producto {
    public Bebida(String nombre, String unidad, Double capacidad, Integer precio) {
        super(nombre, unidad, capacidad, precio);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +" /// "+ this.getUnidad() +": "+ this.getCapacidad() +" /// Precio: $"+ this.getPrecio();
    }
}