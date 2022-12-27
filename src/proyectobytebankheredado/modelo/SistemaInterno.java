/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobytebankheredado.modelo;

import proyectobytebankheredado.modelo.Autenticable;

/**
 *
 * @author Crist
 */
public class SistemaInterno {
    private String clave = "1234";
    public boolean autentica(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if(puedeIniciarSesion){
            System.out.println("login Existoso");
            return true;
        }else{
            System.out.println("contrasenia incorrecta");
            return false;
        }
    }
}