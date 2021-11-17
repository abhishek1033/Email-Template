package com.email.template;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.email.template.model.Mail;
import com.email.template.service.EmailSenderService;

@SpringBootApplication
public class EmailTemplateDemoApplication implements ApplicationRunner
{
	@Autowired
    private EmailSenderService emailService;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(EmailTemplateDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{

        Mail mail = new Mail();
        mail.setFrom("fromEmailAddress");//replace with your desired email
        mail.setMailTo("toEmailAddress");//replace with your desired email
        mail.setSubject("Email with Spring boot and thymeleaf template!");

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name", "Developer!");
        model.put("location", "United States");
        model.put("sign", "Java Developer");
        mail.setProps(model);

        emailService.sendEmail(mail);
		
	}
}
