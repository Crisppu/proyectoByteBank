/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  proyectobytebankheredado.modelo;

import proyectobytebankheredado.modelo.Cliente;

/**
 *
 * @author Crist
 */
public abstract class Cuenta {
    private Cliente cliente = new Cliente();
    //Cliente cliente;
    protected double saldo;
    int agencia;
    int numero ;
    private static int totalDeCuentas = 0;
    //String titular;
    
    public Cuenta( int agencia, int numero){
        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia invalida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero de cuenta invalido");
        }
            this.agencia = agencia;
            this.numero =  numero;
            totalDeCuentas++;
            
        
    
    }
     public abstract Double depositar(double valor);
     
    /*public abstract void retirar (double valor);
     
     
    public void _retirar (double valor, int comision) throws ExceptionSaldoInsuficiente{
        //valor = valor + (comision/100);
        //valor = valor + (1+(comision/100));
        valor = valor+comision;
        if(valor <= this.saldo && valor > 0){
            this.saldo = this.saldo - valor;
        }else{
            throw new ExceptionSaldoInsuficiente("el retiro es mayor que el saldo actual");
        }
        
       valor = valor+comision;
       if(valor > this.saldo){
           throw new ExceptionSaldoInsuficiente("el retiro es mayor que el saldo actual");
       }else if(valor < 0){
           throw new ExceptionSaldoInsuficiente("no se resiven numeros negativos");

       }
       
        this.saldo = this.saldo - valor;
    }*/
   
public void retirar (double valor) throws ExceptionSaldoInsuficiente{
       
        
      
       if(valor > this.saldo){
           throw new ExceptionSaldoInsuficiente("el retiro es mayor que el saldo actual");
       }else if(valor < 0){
           throw new ExceptionSaldoInsuficiente("no se resiven numeros negativos");

       }
       
        this.saldo = this.saldo - valor;
    }
    
    public void transferir(double valor,Cuenta cuenta)throws ExceptionSaldoInsuficiente{
        this.retirar(valor);
        cuenta.depositar(valor);
    }
    
    
    public Double getSaldo(){
       return this.saldo;
    }
    /*
    public void setAgencia(int agencia){
        if(agencia > 0){
        this.agencia = agencia;
        }else{
            System.out.println("no se permiten numeros negativos");
        }
       
    }*/
    public int getAgencia(){
    return agencia;
    }
   

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public static int getTotalDeCuentas() {
        
        return totalDeCuentas;
    }
     
    
    
}
