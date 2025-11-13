/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date; // Importamos Date para la fecha
import java.util.List; // Importamos la clase List para poder usar listas
/**
/**
 *
 * @author Usuario
 */
/**
     */
/**
 * Esta clase representa un pedido hecho por un cliente.
 */

public class Pedido {
    // Atributos
    private int idPedido;
    private Cliente cliente; // El cliente que hizo el pedido
    private List<Plato> listaPlatos; // Los platos que pidió
    private Date fecha; // La fecha en que se hizo
    private String estado; // "en preparación", "entregado"
    private double total; // El total del pedido
    private Pago pago; // El pago asociado a este pedido

    //Constructor

    public Pedido(int idPedido, Cliente cliente, List<Plato> listaPlatos, Date fecha, String estado, double total, Pago pago) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.listaPlatos = listaPlatos;
        this.fecha = fecha;
        this.estado = estado;
        this.total = total;
        this.pago = pago;
    }
    //METODOS SET Y GET

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(List<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
//Metodo para ver atributos de mi objeto
    @Override
    public String toString() {
        return "Detalle del pedido" +"\n"+  
                "IdPedido: "+ idPedido +"\n"+  
                "Cliente: " + cliente +"\n"+
                "Lista de platos: "+ listaPlatos +"\n"+
                 "fecha: " + fecha +"\n"+
                "Estado: " + estado +"\n"+
                "Total: " + total +"\n"+
                "Pago: " + pago;

    }
    
    
}
