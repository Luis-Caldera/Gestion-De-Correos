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


/**
 *
 * @author luis caldera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//         java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
               new ControlMensaje().setVisible(true);
////                new LeerCorreo().setVisible(true);
////                new VisualizarCorreo().setVisible(true);
             // new RedactarCorreo().setVisible(true);
////               new Login().setVisible(true);
//
//            }
//        });
    }
    
}
