/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado;

/**
 *
 * @author Crist
 */
public class CuentaAhorro extends Cuenta {
    public CuentaAhorro(int agencia, int numero){
        super(agencia, numero);
    }
    
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

     
}
