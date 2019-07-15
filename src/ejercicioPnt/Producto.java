package ejercicioPnt;

import java.util.ArrayList;
import java.util.List;

public class Producto implements Comparable<Producto>{
    private String nombre;
    private String unidad;
    private Double capacidad;
    private Integer precio;
    private ArrayList listaDeProductos = new ArrayList();
    
    public Producto(){}
    
    public Producto(String nombre, String unidad, Double capacidad, Integer precio) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    
    public Producto(String nombre, Integer precio, String unidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    //Carga todos los productos en el array 'listaDeProductos', a través del método 'agregarProducto'
    public void cargarListaDeProductos() {
	Producto producto1 = new Bebida("Coca-Cola Zero", "Litros", 1.5, 20);
	Producto producto2 = new Bebida("Coca-Cola", "Litros", 1.5, 18);
	Producto producto3 = new Limpieza("Shampoo Sedal", "Contenido", 500.00, 19);
	Producto producto4 = new Fruta("Frutillas", 64, "kilo");
	
	this.agregarProducto(producto1);
	this.agregarProducto(producto2);
	this.agregarProducto(producto3);
	this.agregarProducto(producto4);
    }

    //Agrega Productos al array 'listaDeProductos'
    public void agregarProducto(Producto producto) {
        this.listaDeProductos.add(producto);
    }

    //Método que muestra la salida por consola
    public void mostrarProductos() {
        (listaDeProductos).forEach(System.out::println);
	System.out.println("=============================");
        Estadisticas estadistica = new Estadisticas(listaDeProductos);
        System.out.println("Producto más caro: " + estadistica.masCaro().getNombre());
        System.out.println("Producto más barato: " + estadistica.masBarato().getNombre());
    }
    
    @Override
    public String toString() {
        return null;
    }
    
    @Override
    public int compareTo(Producto o) {
       return this.getPrecio() - o.getPrecio();
    }
}