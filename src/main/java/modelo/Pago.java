/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */

/**
 * Esta clase representa el pago de un pedido.
 * Implementa la interfaz Ipago, lo que significa que DEBE tener el método procesarPago.
 */

public class Pago implements Ipago { // Aquí dice que "implementa" Ipago
    // Atributos
    private int idPago;
    private double monto;
    private String metodo; // "transferencia", "efectivo"
    private String estado; // "pendiente", "completado", "fallido"

    //Constructor

    public Pago(int idPago, double monto, String metodo, String estado) {
        this.idPago = idPago;
        this.monto = monto;
        this.metodo = metodo;
        this.estado = estado;
    }
    
// Este es el método que implementa la interfaz Ipago.
// Debe tener exactamente la misma firma (nombre, parámetros y tipo de retorno) que la interfaz.
@Override
public boolean procesarPago(double monto) {
    // Aquí va la lógica de procesamiento real (simulada o real).
    // Por ahora, simulamos que solo funciona con transferencia.

    // Comparamos si el atributo 'metodo' de ESTA instancia de Pago es igual a "transferencia"
    if ("transferencia".equals(this.metodo)) { //equals me compara cadenas de texto
        // Si es así, imprimimos un mensaje en la consola simulando el proceso
        System.out.println("Procesando pago de $" + monto + " por transferencia...");
        // Cambiamos el estado del pago a "completado"
        this.estado = "completado";
        // Devolvemos true para indicar que el proceso fue exitoso
        return true;
    } else {
        // Si el método NO es "transferencia", imprimimos un mensaje
        System.out.println("Pago no procesado. Método: " + this.metodo);
        // Devolvemos false para indicar que el proceso falló o no se realizó
        return false;
    }
}
    
    // Metodos set y get

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "descripción del pago" +"\n"+  
                "idPago: " + idPago +"\n"+  
                "Monto: " + monto +"\n"+  
                "Metodo: " + metodo +"\n"+  
                "Estado: " + estado ;
                
    }
    
    
    
}