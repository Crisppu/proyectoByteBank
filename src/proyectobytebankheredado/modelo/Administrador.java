/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado.modelo;

/**
 *
 * @author Crist
 */
public class Administrador extends Funcionario implements Autenticable {
    private AutenticacionUtil util;
    
    public Administrador(){
    this.util = new AutenticacionUtil ();
    }
   //metodo de extends
    @Override
    public double getBonificacion() {
        return 0;
    }
//metodos de interface
      @Override
    public void setclave(String clave) {
        this.util.setclave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);

    }
}
