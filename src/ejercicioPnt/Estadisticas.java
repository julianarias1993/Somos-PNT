package ejercicioPnt;

import java.util.ArrayList;

public class Estadisticas {
    private ArrayList<Producto> productos;
	
	public Estadisticas(ArrayList<Producto> productos){
		this.productos = productos;
	}
	
	public Producto masBarato() {
            return productos.stream().min(Producto::compareTo).get();
	}
		
	public Producto masCaro() {
            return productos.stream().max(Producto::compareTo).get();
	}
}