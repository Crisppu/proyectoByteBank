/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado;

/**
 *
 * @author Crist
 */
public class ControlBonificacion {
    private double suma;
    
    public double registrarSalario(Funcionario xfuncionario){// esperamos un objeto
     this.suma = xfuncionario.getBonificacion() + this.suma;
       System.out.println("calculo actual: "+this.suma );
    return this.suma;
    }

    public double getSuma() {
        return suma;
    }
    
   
}
