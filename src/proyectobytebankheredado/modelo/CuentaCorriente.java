/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado.modelo;

import proyectobytebankheredado.modelo.Cuenta;

/**
 *
 * @author Crist
 */
public class CuentaCorriente extends Cuenta implements Tributacion {
    public CuentaCorriente(int agencia, int numero){
     super(agencia, numero);   
    }

   /* @Override
    public Double retirar(double valor) {
        double comision = 0.2;
        return super.retirar(comision+valor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }*/

    /*@Override
    public void retirar(double valor) {
        super._retirar(valor, 20); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }*/
 @Override
    public void retirar(double valor) throws ExceptionSaldoInsuficiente {
        super.retirar(valor);
        
    }
    
    
    @Override
    public Double depositar(double valor) {
        if(valor > 0){
            this.saldo = this.saldo + valor;
            
        }else{
            System.out.println("error, intentar de nuevo");
        }
         
       return this.saldo;
       
    }

    @Override
    public double getValorImpuesto() {
        return super.saldo * 0.01;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
   
}
