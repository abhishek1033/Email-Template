package com.email.template.config;

import java.nio.charset.StandardCharsets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class ThymeleafTemplateConfig 
{
	@Bean
    public SpringTemplateEngine springTemplateEngine() 
	{
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        return templateEngine;
    }
	
	
}
