/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DatosEnviarCorreo;
import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.security.auth.login.FailedLoginException;

/**
 *
 * @author luis caldera
 */
public class ControladorCorreo {

    DatosEnviarCorreo dts_correo = new DatosEnviarCorreo();

    public boolean enviarCorreo( DatosEnviarCorreo dts_correo) {

        try {

            Properties propiedades = new Properties();
            propiedades.put("mail.smtp.host", "smtp.gmail.com");
            propiedades.setProperty("mail.smtp.starttls.enable", "true");
            propiedades.setProperty("mail.smtp.port", "587");
            propiedades.setProperty("mail.smtp.user", dts_correo.getUsuarioCorreo());
            propiedades.setProperty("mail.smtp.uth", "true");

            Session ses = Session.getDefaultInstance(propiedades, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText(dts_correo.getMensaje());
            BodyPart adjunto = new MimeBodyPart();
//
            if (!dts_correo.getRutaArchivo().equals("")) {

                adjunto.setDataHandler(new DataHandler(new FileDataSource(dts_correo.getRutaArchivo())));
                adjunto.setFileName(dts_correo.getNombreArchivo());
            }
//
            MimeMultipart mm = new MimeMultipart();
            mm.addBodyPart(adjunto);
//
            if (!dts_correo.getRutaArchivo().equals("")) {
                mm.addBodyPart(adjunto);
            }
            MimeMessage mensaje = new MimeMessage(ses);
            mensaje.setFrom(new InternetAddress(dts_correo.getUsuarioCorreo()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(dts_correo.getDestino()));
            mensaje.setSubject(dts_correo.getAsunto());
            mensaje.setContent(mm);

            Transport transporte = ses.getTransport("smtp");
            transporte.connect(dts_correo.getUsuarioCorreo(), dts_correo.getContraseña());
            transporte.sendMessage(mensaje, mensaje.getAllRecipients());
            transporte.close();

            return true;

        } catch (Exception e) {
            System.out.println("Error envio...");
            return false;
        }
    

    }

   
}
