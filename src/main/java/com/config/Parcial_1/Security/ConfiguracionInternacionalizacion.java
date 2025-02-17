package com.config.Parcial_1.Security;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ConfiguracionInternacionalizacion {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages"); // Nombre base de los archivos de propiedades de mensajes
        messageSource.setDefaultEncoding("UTF-8"); // Codificación UTF-8 para caracteres especiales
        return messageSource;
    }
}
