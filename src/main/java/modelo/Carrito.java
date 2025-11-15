/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;  // Importamos la clase List para poder usar listas
/**
 *
 * @author Usuario
 */

/**
 * Esta clase representa el carrito de compras del cliente.
 */
public class Carrito {
    // Atributos
    private List<Plato> listaPlatos; // Lista de todos los platos que el cliente ha agregado al carrito Ejemplo: [Arroz con pollo, Ceviche, Jugo de naranja] Nota: Es como el carrito de compras en una tienda online
    private double total;// Monto total del carrito (suma de los precios de todos los platos) Ejemplo: 45.50, 78.99, 125.00
    private int cantidadItems; // Cantidad total de platos (items) que hay en el carrito Ejemplo: 3, 5, 10, etc. Si hay 2 Arroz con pollo y 1 Ceviche, la cantidad es 3

    //Constructor

    public Carrito(List<Plato> listaPlatos, double total, int cantidadItems) {
        this.listaPlatos = listaPlatos;
        this.total = total;
        this.cantidadItems = cantidadItems;
    }
    
    //Metodos set y get

    public List<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(List<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidadItems() {
        return cantidadItems;
    }

    public void setCantidadItems(int cantidadItems) {
        this.cantidadItems = cantidadItems;
    }

    @Override
    public String toString() {
        return "Datos del carrito"+"\n"+
                "Lista de los platos: " + listaPlatos +"\n"+
                "Total: " + total +"\n"+
                "Cantidad de items: " + cantidadItems; 
    }
    
 
}