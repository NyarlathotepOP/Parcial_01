package com.config.Parcial_1.Controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternacionalizacionController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/saludo")

    /*
    public String obtenerSaludo(@RequestHeader(name = "Accept-Language", required = false) Locale locale)
        Accept-Language es un encabezado HTTP que indica el idioma preferido del cliente
        no es obligatorio, si no se envía, se utiliza el idioma del sistema
        pero esta entregando es-419,es;q=0.9 a Spring un Locale en lugar de un String
        Failed to convert value of type 'java.lang.String' to required type 'java.util.Locale'; Locale part "es-419,es;q=0.9" contains invalid characters]
        return messageSource.getMessage("welcome.message", null, locale);
    */

    public String obtenerSaludo(@RequestHeader(name = "Accept-Language", required = false, defaultValue = "en") String language) {
        Locale locale = Locale.forLanguageTag(language.split(",")[0]); // Extrae solo el primer parametro del idioma válido antes de la coma
        return messageSource.getMessage("welcome.message", null, locale);
    }

}
