/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controlador.ConectarMySQL;
import Interface.DaoObjetoAtributo;
import Modelo.DatosRegistrarBasedato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author luis caldera
 */
public class DaoAtributoIMP extends ConectarMySQL implements DaoObjetoAtributo {

    ConectarMySQL conectarMySQL;
    DatosRegistrarBasedato datos;

// constructor de clase que crea un objeto y le pasa los datos de prueba, ip, usuario y password en caso de tener la base datos 
    public DaoAtributoIMP() throws Exception {

        //conectarMySQL = new ConectarMySQL("127.0.0.1", "registro correo", "root", "");
    }

    //** Registra los datos, nombre, apellido, contraseña y correo electronico en la base de datos correo */
    @Override
    public void Registrar(DatosRegistrarBasedato datos) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO correo values(?,?,?,?,?)");
            st.setString(1, datos.getNombre());
            st.setString(2, datos.getApellido());
            st.setString(3, datos.getContraseña());
            st.setString(4, datos.getCorreoElectronico());
            st.setLong(5, datos.getTelefono());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } 
//        finally {
//            this.Cerrar();
//        }

    }

    // metodo que me permite validar al usuario con los campos correo eleectronico y contraseña 
    @Override
    public String BuscarUsuarioRegistrado(String correo, String contraseña ) throws Exception {

        String busqueda_usuario = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT `Contraseña`, `Correo Electrónico` FROM `correo` WHERE `Correo Electrónico` = '"+ correo +"' && `Contraseña` = '"+contraseña+"'" );
            ResultSet resultado = st.executeQuery();
           
            if (resultado.next()) {                             // inicia la busqueda
               
                busqueda_usuario = ("Usuario encontrado.");     //  envia este mensaje si los datos son correctos
                
            }else{
                busqueda_usuario = ("usuario no fue encontrado.");  // envia este si los datos son incorrectos 
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());                 // mensaje de posibñle eror en la conexion 
        } 
//        finally {
//            this.Cerrar();                                      // permite cerrar el canal de la conexion a la base datos 
//        }
        
        return busqueda_usuario;                                // retorna el vlaor string de la busqueda 
    }

    @Override
    public void LimpiarBD() throws Exception {
         
           try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(" DELETE FROM `correo` WHERE 1 " );
            st.executeQuery();

        } catch (Exception e) {
            System.out.println(e.getMessage());                 // mensaje de posibñle eror en la conexion 
        } 
          
          
    }

    @Override
    public void Listar(DatosRegistrarBasedato datos) throws Exception {
        
    }

    @Override
    public void validarDatosUsuario(DatosRegistrarBasedato datos) throws Exception {

    }

    @Override
    public String TraerCorreoUsuario(String correo, String contraseña) throws Exception {
       
        String busqueda_correo = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT `Nombre`, `Apellido`, `Contraseña`, `Correo Electrónico`, `Teléfono` FROM `correo` WHERE `Correo Electrónico` = '"+ correo +"' && `Contraseña` = '"+contraseña+"'" );
            ResultSet resultado = st.executeQuery();
          
            if (resultado.next()) {                             // inicia la busqueda
               
                busqueda_correo = resultado.getString(4);     // 
              
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());                 // mensaje de posibñle eror en la conexion 
        } 
        
        return busqueda_correo;
        
    }

    @Override
    public String TraerContraseñaUsuario() throws Exception {
        
        String busqueda_contraseña = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT `Contraseña` FROM `correo` " );
            ResultSet resultado = st.executeQuery();
           
            if (resultado.next()) {                             // inicia la busqueda
               
                busqueda_contraseña = resultado.getString(1);     //  

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());                 // mensaje de posibñle eror en la conexion 
        } 
        
        return busqueda_contraseña;
    }

    @Override
    public String TraerNombreUsuario(String correo, String contraseña) throws Exception {
       
        String busqueda_nombre = null;
        

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT `Nombre`, `Apellido`, `Contraseña`, `Correo Electrónico`, `Teléfono` FROM `correo` WHERE `Correo Electrónico` = '"+ correo +"' && `Contraseña` = '"+contraseña+"'" );
            ResultSet resultado = st.executeQuery();
           
            if (resultado.next()) {                             // inicia la busqueda
               
                busqueda_nombre = (resultado.getString(1));     //  

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());                 // mensaje de posibñle eror en la conexion 
        } 
      
        
        return busqueda_nombre;
    }

    @Override
    public String TraerApellidoUsuario(String correo, String contraseña) throws Exception {
       String busqueda_apellido = null;
        

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT `Nombre`, `Apellido`, `Contraseña`, `Correo Electrónico`, `Teléfono` FROM `correo` WHERE `Correo Electrónico` = '"+ correo +"' && `Contraseña` = '"+contraseña+"'"  );
            ResultSet resultado = st.executeQuery();
           
            if (resultado.next()) {                             // inicia la busqueda
               
                busqueda_apellido = (resultado.getString(2));     //  

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());                 // mensaje de posibñle eror en la conexion 
        } 
      
        
        return busqueda_apellido;
    }
    

    @Override
    public String BuscarInformacionUsuario(String correo, String contraseña ) throws Exception {

        String busqueda_usuario = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT `Nombre`, `Apellido`, `Contraseña`, `Correo Electrónico`, `Teléfono` FROM `correo` WHERE `Correo Electrónico` = '"+ correo +"' && `Contraseña` = '"+contraseña+"'" );
            ResultSet resultado = st.executeQuery();
           
            if (resultado.next()) {                             // inicia la busqueda
               
                busqueda_usuario = (resultado.getString(1));     //  envia este mensaje si los datos son correctos
                busqueda_usuario = (resultado.getString(2));
                busqueda_usuario = (resultado.getString(3));
                busqueda_usuario = (resultado.getString(4));
                busqueda_usuario = (resultado.getString(5));
                
            }else{
                busqueda_usuario = ("usuario no fue encontrado.");  // envia este si los datos son incorrectos 
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());                 // mensaje de posibñle eror en la conexion 
        } 
//        finally {
//            this.Cerrar();                                      // permite cerrar el canal de la conexion a la base datos 
//        }
        
        return busqueda_usuario;                                // retorna el vlaor string de la busqueda 
    }

    @Override
    public String TraerCorreo() throws Exception {
      String busqueda_correo = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT `Correo Electrónico` FROM `correo` ");
            ResultSet resultado = st.executeQuery();
           
            if (resultado.next()) {                             // inicia la busqueda
               
                busqueda_correo = resultado.getString(1);     //  

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());                 // mensaje de posibñle eror en la conexion 
        } 
        
        return busqueda_correo;
    }
}
