/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.gestordecorreo;


import Vista.ControlMensaje;
import Vista.LeerCorreo;
import Vista.Login;
import Vista.RedactarCorreo;
import Vista.VisualizarCorreo;
import  com.twilio.Twilio ; 
import  com.twilio.rest.api.v2010.account.Message ; 
import  com.twilio.type.PhoneNumber ; 

/**
 *
 * @author luis caldera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static final String ACCOUNT_SID = "ACadb04de5b03702e01bad7c2a0af196de";
    public static final String AUTH_TOKEN = "59f0df1284bc752020ea1d516ba7db00";
   
    public static void main(String[] args) {
//        // TODO code application logic here
//         java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
          new ControlMensaje().setVisible(true);
////                new LeerCorreo().setVisible(true);
////                new VisualizarCorreo().setVisible(true);
             // new RedactarCorreo().setVisible(true);
            //  new Login().setVisible(true);
//
//            }
//        });

//Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//Message mensaje = Message.creator(new PhoneNumber("+573024452837"), 
//        new PhoneNumber("+14243733350"), "mensaje de verificacion." ).create();
//
//        System.out.println(mensaje.getSid());
    }
    
}
