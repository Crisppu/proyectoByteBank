/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado;

/**
 *
 * @author Crist
 */
public class AutenticacionUtil {

   private String clave;
    
     public void setclave(String clave) {
        this.clave = clave;
    }

    
    public boolean iniciarSesion(String clave) {
        if(clave == this.clave){       
            return true;
         }else{
            return false;

        }
    }
}
