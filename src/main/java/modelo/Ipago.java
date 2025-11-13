/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
/**
 * Esta es una INTERFAZ. No es una clase, es como un "contrato".
 * Define que MÉTODO debe tener cualquier clase que diga que la "implementa".
 * En este caso, define que debe haber un método llamado "procesarPago".
 */
public interface Ipago {
    /**
     * Este es el MÉTODO que define la interfaz.
     * Cualquier clase que diga "implements Ipago" DEBE tener este método.
     * Recibe un número decimal (monto) y devuelve un booleano (verdadero o falso).
     */
    boolean procesarPago(double monto);
}