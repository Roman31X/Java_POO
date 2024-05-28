package Ejercicios_POO.Ejer_4;

import java.util.Date;

public class EjemploOrdenCompra {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Mercado");
        orden1.setCliente(new Cliente("Daniel","Cavero"));
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("Molitalea","Fideos",11));
        orden1.addProducto(new Producto("Cocinero","Aceite",10));
        orden1.addProducto(new Producto("Nicoline","Harina",13));
        orden1.addProducto(new Producto("Sayon","Paneton",25));

        OrdenCompra orden2 = new OrdenCompra("Ropa");
        orden2.setCliente(new Cliente("Diego","Guerra"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Jeans","pantalones",15));
        orden2.addProducto(new Producto("Pier","Chaleco",10));
        orden2.addProducto(new Producto("Kamin","Camisas",15));
        orden2.addProducto(new Producto("Sagara","Chompa",25));

        OrdenCompra orden3 = new OrdenCompra("Computo");
        orden3.setCliente(new Cliente("Rene","Magallanes"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Asus","Placa Madre",700));
        orden3.addProducto(new Producto("Corei","Procesador",900));
        orden3.addProducto(new Producto("Samsung","Monitor",250));
        orden3.addProducto(new Producto("Logitec","Teclado",250));

        OrdenCompra[] ordenes = {orden1,orden2,orden3};
        int a = 1;
        for (OrdenCompra orden : ordenes) {
            int i = 1;
            System.out.println("|+++++++++++++++++++++++++++++++++++++++++++|");
            System.out.println("| N° Boleta : " + a);
            System.out.println("| Cliente : " + orden.getCliente());
            System.out.println("| Descripción: " + orden.getDescripcion());
            System.out.println("| Fecha: " + orden.getFecha());
            System.out.println("|-------------------------------------------|");
            for (Producto p : orden.getProductos()) {
                System.out.println("| Producto " + i + ": " + p.getFabricante() + " | " + p.getNombre() + " | precio $" + p.getPrecio());
                i++;
            }
            System.out.println("|-------------------------------------------|");
            System.out.println("| Total: " + orden.granTotal());
            System.out.println("|+++++++++++++++++++++++++++++++++++++++++++|");
            a++;
        }

    }
}
