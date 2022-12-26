/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  proyectobytebankheredado;

/**
 *
 * @author Crist
 */
public class Cliente implements Autenticable {
    private String nombre;
    private String documento;
    private String telefono;
    private AutenticacionUtil util;
   
   public Cliente(){
       this.util = new AutenticacionUtil();
    
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
//metodo de implements
    @Override
    public void setclave(String clave) {
        this.util.setclave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);

    }
    
    
}
