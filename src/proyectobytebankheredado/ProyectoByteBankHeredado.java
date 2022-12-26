/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobytebankheredado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Crist
 */
public class ProyectoByteBankHeredado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Cuenta c = new CuentaCorriente(2,2);
       c.depositar(200);
        try {
            c.retirar(210);
        } catch (ExceptionSaldoInsuficiente ex) {
            ex.printStackTrace();
        }
       System.out.println(c.getSaldo());
        
    }
    
}
