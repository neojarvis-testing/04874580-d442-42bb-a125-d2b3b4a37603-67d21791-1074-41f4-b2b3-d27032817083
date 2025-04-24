package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import jakarta.activation.DataHandler;
import jakarta.activation.FileDataSource;
import jakarta.mail.BodyPart;
import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class SendEmailWithAttachment {
	final static String projectPath = System.getProperty("user.dir");
	final static String relativePath = "reports/NYKAA_Report.html";
	final static String fullPath = projectPath + File.separator + relativePath;
	public static FileInputStream configfile;
	public static Properties prop;

	/*
	 * a. Method Name:sendEmailWithAttachment
	 * b. Author:Likitha
	 * c. Description:This method sends email with file attachment to the specified
	 * email address
	 * And also verifies whether email sent and the required file path is found
	 * d. Parameters:
	 * -toEmail : The receiver's email
	 * -fromEmail: The sender's email
	 * -password: appPassword
	 * -subject: subject to send email
	 * -body: The body of email
	 * e. return type: void
	 */
	public static void sendEmailWithAttachment(String toEmail, String fromEmail, String subject,
			String body) throws IOException {
		String propertiesPath = System.getProperty("user.dir") + "/config/config.properties";
		try {
			configfile = new FileInputStream(propertiesPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(configfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String password = prop.getProperty("password");
		File file = new File(fullPath);
		if (!file.exists()) {
			System.out.println("not found" + file.getAbsolutePath());
			return;
		}
		if (!file.exists() || !file.canRead()) {
			throw new IOException("Attachment file not found or cannot be read: " + file.getAbsolutePath());
		}

		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
			message.setSubject(subject);

			// Create body part for the email text
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText(body);

			// Create a multipart to combine the parts
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);

			// Create attachment part
			MimeBodyPart attachmentPart = new MimeBodyPart();
			FileDataSource source = new FileDataSource(file);
			attachmentPart.setDataHandler(new DataHandler(source));
			attachmentPart.setFileName(file.getName());
			multipart.addBodyPart(attachmentPart);

			// Set the multipart content to the message
			message.setContent(multipart);

			// Send the email
			Transport.send(message);
			System.out.println("Email sent successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
