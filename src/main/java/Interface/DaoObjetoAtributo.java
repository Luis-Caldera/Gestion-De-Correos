/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.DatosRegistrarBasedato;

/**
 *
 * @author luis caldera
 */
public interface DaoObjetoAtributo {
    
    public void     Registrar(DatosRegistrarBasedato       datos)   throws Exception;
    public String   BuscarUsuarioRegistrado(String correo, String contraseña)   throws Exception;
    public void     LimpiarBD()   throws Exception;
    public void     Listar(DatosRegistrarBasedato          datos)   throws Exception;
    public void     validarDatosUsuario(DatosRegistrarBasedato    datos)   throws Exception;
    public String   TraerCorreoUsuario(String correo, String contraseña) throws Exception;
    public String   TraerCorreo() throws Exception;
    public String   TraerContraseñaUsuario()throws Exception;
    public String   TraerNombreUsuario(String correo, String contraseña) throws Exception;
    public String   TraerApellidoUsuario(String correo, String contraseña) throws Exception;
    public String   BuscarInformacionUsuario(String correo, String contraseña) throws Exception;
 
}