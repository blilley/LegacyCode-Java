import org.joda.time.DateTime;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmailManager
{
    private EmailGenerator emailGenerator;

    public EmailManager(EmailGenerator emailGenerator) {
        this.emailGenerator = emailGenerator;
    }

    public void send()
    {
        log();
        sendEmail();
    }

    private void log() {
        Logger.getAnonymousLogger().log(Level.ALL, "Sending Email at " + DateTime.now().toString());
    }

    private void sendEmail() {
        String body = emailGenerator.generate();
        String to = "Bob@testerville.com";
        String subject = "Generating emails";

        // Sender's email ID needs to be mentioned
        String from = "us@team.com";

        // Assuming you are sending email from localhost
        String host = "localhost";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try{
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(subject);

            // Now set the actual message
            message.setText(body);

            // Send message
            Transport.send(message);
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
