/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

//import java.util.ArrayList;// ArrayList es una implementación de la interfaz List, que permite crear listas dinámicas.

import Controlador.PlatoControlador;
import Vista.PlatoVista;
import modelo.Plato;

//import java.util.Date; //Se utiliza para trabajar con fechas
//import java.util.List;// List define cómo deben comportarse las listas de objetos (agregar, eliminar, buscar, etc.).
//import modelo.Carrito;
//import modelo.Cliente;
//import modelo.Menu;
//import modelo.Pago;
//import modelo.Pedido;
//import modelo.Plato;
//import modelo.Restaurante;




public class Main {

    public static void main(String[] args) {
        // PUNTO DE ENTRADA DE LA APLICACIÓN
        // Este método se ejecuta primero cuando inicia la aplicación/sistema
        // Paso 1: Crear el MODELO (donde guardamos los datos del plato)
        Plato modelo= new Plato();
         // Paso 2: Crear la VISTA (interfaz gráfica que ve el usuario)
        PlatoVista vista = new PlatoVista();
         // Paso 3: Crear el CONTROLADOR (conecta modelo y vista)
        PlatoControlador controlador = new PlatoControlador(modelo, vista);
         // Paso 4: Iniciar la aplicación
        controlador.iniciar();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Creamos un cliente
//        Cliente cliente1 = new Cliente(1,"Lorena","lo@gmail.com", "1234", "0123456789");
//        System.out.println(cliente1.toString());
//        System.out.println("\n");
//        
//        // Creamos un objeto pago
//        Pago pago1 = new Pago(101, 12.50, "transferencia", "completado"); // o "efectivo", "pendiente"
//              System.out.println(pago1.toString());
//        System.out.println("\n");
//        
//        //Creamos platos
//        Plato plato1 = new Plato( "Pizza con queso", 10.50, "Con queso y tomate", "plato fuerte");
//        Plato plato2 = new Plato("Refresco", 2.00, "Coca Cola 500ml", "bebida");
//        System.out.println(plato1.toString());
//        System.out.println(plato2.toString());
//        System.out.println("\n");
//        
//        // Creamos una lista de platos y agregamos los platos
//        List<Plato> listaPlatosPedido = new ArrayList<>();
//        listaPlatosPedido.add(plato1);
//        listaPlatosPedido.add(plato2);
//        System.out.println("\n");
//
//        
//        // Creamos la fecha actual
//        Date fechaPedido = new Date(); // Fecha y hora actual
//        System.out.println("\n");
//        
//        // Creamos el objeto Pedido usando el constructor
//        Pedido pedido1 = new Pedido(
//            1001,                         
//            cliente1,                 
//            listaPlatosPedido,              
//            fechaPedido,                    
//            "en preparación",               
//            12.50,                         
//            pago1                 
//        );
//        System.out.println(pedido1.toString());
//        System.out.println("\n");
//
//        
//        // Creamos un objeto Restaurante
//        Restaurante rest1 = new Restaurante(1, "La Pizzería", "Calle A", "0911111111", "10:00 - 22:00");
//        System.out.println(rest1.toString());
//        System.out.println("\n");
//
//        // Creamos un objeto Menu
//        Menu menu1 = new Menu(1, "Menú del Día", "Platos del día", listaPlatosPedido);
//        System.out.println(menu1.toString());
//        System.out.println("\n");
//
//        
//        // Creamos una lista de platos para el carrito
//        List<Plato> listaPlatosCarrito = new ArrayList<>();
//        listaPlatosCarrito.add(plato1);
//        listaPlatosCarrito.add(plato2);
//        System.out.println("\n");
//
//
//        // Calculamos el total y la cantidad de ítems (esto debería hacerlo el carrito, pero como está en el constructor, lo hacemos aquí)
//        double totalCarrito = plato1.getPrecio() + plato2.getPrecio(); // Sumamos precios
//        int cantidadItems = listaPlatosCarrito.size(); // Contamos elementos
//        System.out.println("\n");
//
//        // Creamos un objeto Carrito
//        Carrito carrito1 = new Carrito(listaPlatosCarrito, totalCarrito, cantidadItems);
//        System.out.println(carrito1.toString());
//        System.out.println("\n");


    } 
}
