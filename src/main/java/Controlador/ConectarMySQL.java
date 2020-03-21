package Controlador;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Esta clase permite conectar a una base de datos Mysql
 */


public class ConectarMySQL {

    //** Declaracion de variables
    protected Connection conexion;
    private final String driver =  "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://127.0.0.1:3306/prueba";
    private final String usuario = "root";
    private final String contraseña = "";
    
    /** 
     *Constructor general que se conecta a la base de datos dependiendo de los parametros
     *
     *@param servidorNombre Nombre del servidor o direccion IP
     *@param nombreBD  nombre de la base de datos
     *@param usuario Usuario autorizado
     *@param  password
     * @throws java.lang.Exception
     *
     */
    
    // hace la conexion a la base datos 
    public void Conectar() throws Exception{
        
        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            Class.forName(driver); 
        } catch (Exception e) {
            throw e;
        }
    }
    
    // terimina la conexion a la base datos 
    public void Cerrar() throws Exception{
        if (conexion != null){
            if (!conexion.isClosed()){
                conexion.close();
            }
        }
    }

    
    /** 
     * Devuelve el objeto que permite la conexion a la base de datos
     *
     * @return Connection Conexion a la base de datos
     *
     */

    


}


