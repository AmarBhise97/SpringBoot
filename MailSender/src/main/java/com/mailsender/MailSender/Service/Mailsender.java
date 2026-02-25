package com.mailsender.MailSender.Service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.mailsender.MailSender.Entity.Student;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class Mailsender {

	@Autowired
	JavaMailSender sender;

	public String sendermessage(String useremail) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(useremail);
		message.setFrom("bhiseamarwagholi@gmail.com");
		message.setSubject("placement update");
		message.setText("hi,please find attach !");
		System.out.println("sending the email ");
		sender.send(message);
		return "mail send";
	}

	public String sendermimimessage(Student user) throws MessagingException {
		MimeMessage mime = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime, true, "UTF-8");

		String htmlcard = """
				<html>
				<head>
				    <style>
				        .card {
				            max-width: 400px;
				            margin: auto;
				            padding: 20px;
				            border-radius: 10px;
				            background-color: #ffffff;
				            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
				            font-family: Arial, sans-serif;
				            text-align: center;
				        }
				        .btn {
				            display: inline-block;
				            padding: 10px 20px;
				            background-color: #4CAF50;
				            color: white;
				            text-decoration: none;
				            border-radius: 5px;
				        }
				    </style>
				</head>
				<body style="background-color:#f4f4f4;padding:20px;">
				    <div class="card">
				        <h2>Welcome, [[${name}]]!</h2>
				        <p>Thank you for registering with us.</p>
				        <a href="[[${link}]]" class="btn">Verify Account</a>
				    </div>
				</body>
				</html>""";

		String html2 = htmlcard.replace("user_name", user.getName());

		helper.setTo(user.getEmail());
		helper.setFrom("bhiseamarwagholi@gmail.com");
		helper.setText(html2, true);
		helper.setSubject("demo hiiiiiii");
		sender.send(mime);

		System.out.println("Sending the mails,,,,,,,");
		return "Mail sent";
	}
}
