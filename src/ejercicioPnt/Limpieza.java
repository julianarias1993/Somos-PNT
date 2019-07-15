package ejercicioPnt;

public class Limpieza extends Producto{
    public Limpieza(String nombre, String unidad, Double capacidad, Integer precio) {
	super(nombre, unidad, capacidad, precio);
    }

    @Override
    public String toString() {	
    	return "Nombre: " + this.getNombre() +" /// " + this.getUnidad() +": "+ Math.round(this.getCapacidad()) +"ml /// Precio: $"+ this.getPrecio();
    }
}