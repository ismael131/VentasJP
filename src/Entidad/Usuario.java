/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author ISMAEL HUAYTALLA
 */
public class Usuario {
    private int id;
    private String nomUsuario;
    private String clave;
    private int idempleado;
    
    //constructor vacio

    public Usuario() {
    }
    
    //constructor que devuelve valores

    public Usuario(int id, String nomUsuario, String clave, int idempleado) {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.clave = clave;
        this.idempleado = idempleado;
    }
    
    //Crear el metodo Get y Set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getclave() {
        return clave;
    }

    public void setclave(String clave) {
        this.clave = clave;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public void clave(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
