/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado.modelo;

import proyectobytebankheredado.modelo.Funcionario;
import proyectobytebankheredado.modelo.AutenticacionUtil;
import proyectobytebankheredado.modelo.Autenticable;

/**
 *
 * @author Crist
 */
public class Gerente extends Funcionario implements Autenticable{
    
   private AutenticacionUtil util;
   
   public Gerente(){
       this.util = new AutenticacionUtil();
    
}

   /* public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean iniciarSeccion(String clave){
        return clave == this.clave;
    }
    */
  
    @Override
    public double getBonificacion() {
        System.out.println("desde Gerente");
        return 2000;
       // return super.getSalario() + this.getSalario()*0.05; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
//metodo de implements interface
    @Override
    public void setclave(String clave) {
        this.util.setclave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);

    }

    
}
