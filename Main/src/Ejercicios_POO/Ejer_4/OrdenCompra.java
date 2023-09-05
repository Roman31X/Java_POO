package Ejercicios_POO.Ejer_4;

import java.util.Date;

public class OrdenCompra {
    /*
    * Se requiere crear la clase OrdenCompra con los siguientes campos privados:
    * identificador tipo Integer autoincremental, descripcion String, fecha tipo Date,
    * cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos
    * con 4 elementos: Producto[] productos.
    * En la clase OrdenCompra, crear constructor que inicialice solo la descripción.
    * En la clase OrdenCompra, crear métodos getter para todos los atributos.
    * En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.
    * Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar
    * usando el método public void addProducto (Producto producto), nada más, es
    * decir no se pueden agregar en el constructor ni en métodos setter.
    * La clase OrdenCompra debe tener un método que devuelva el gran total,
    * sumando los precios de los productos.*/

    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private static int contador;
    private int indice;

    public OrdenCompra(String descripcion) {
        identificador++;
        this.descripcion = descripcion;
        this.contador = ++contador;
        this.productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto (Producto producto){
        if(indice < this.productos.length){
            this.productos[indice++] = producto;
        }
    }
    public Double granTotal(){
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            total+= productos[i].getPrecio();
        }
        return total;
    }
}
