/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author luis caldera
 */
public class DatosRegistrarBasedato {

    public DatosRegistrarBasedato() {
    }
    
    private     String      nombre;
    private     String      apellido;
    private     String      correoElectronico;
    private     String      contraseña;
    private     int         telefono; 

    public void DatosRegistrarBasedato() {
        
    }
    public DatosRegistrarBasedato(String nombre, String apellido, String correoElectronico, String contraseña, int telefono) {
        this.nombre = "";
        this.apellido = "";
        this.correoElectronico = "";
        this.contraseña = "";
        this.telefono = 0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
                            
    
}
