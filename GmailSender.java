package com.logical;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class GmailSender {

   public static void main(String[] args) throws AddressException, MessagingException {
   
   
   
      final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
   // Get a Properties object
      Properties props = System.getProperties();
     props.setProperty("proxySet","true");
      props.setProperty("socksProxyHost","10.100.1.99");
      props.setProperty("socksProxyPort","8080");
      props.setProperty("mail.smtp.host", "smtp.gmail.com");
      props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
      props.setProperty("mail.smtp.socketFactory.fallback", "false");
      props.setProperty("mail.smtp.port", "465");
      props.setProperty("mail.smtp.socketFactory.port", "465");
      props.put("mail.smtp.auth", "true");
      props.put("mail.debug", "true");
      props.put("mail.store.protocol", "pop3");
      props.put("mail.transport.protocol", "smtp");
      final String username = "madhumathi1022@gmail.com";
      final String password = "M@dhum@thi48";
      Session session = Session.getDefaultInstance(props, 
                           new Authenticator(){
                              protected PasswordAuthentication getPasswordAuthentication() {
                                 return new PasswordAuthentication(username, password);
                              }});
   
    // -- Create a new message --
      Message msg = new MimeMessage(session);
   
   // -- Set the FROM and TO fields --
      msg.setFrom(new InternetAddress("madhumathi1022@gmail.com"));
      msg.setRecipients(Message.RecipientType.TO, 
                       InternetAddress.parse("madhumathi.v@kggroup.com",false));
      msg.setSubject("Test mail from java");
      msg.setText("Welcom to java mail program");
      msg.setSentDate(new Date());
      Transport.send(msg);
      System.out.println("Message sent.");
   }
}