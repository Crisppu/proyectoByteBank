/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado;

/**
 *
 * @author Crist
 */
public interface Autenticable  {

    public void setclave(String clave);
    public boolean iniciarSesion(String clave);
}
