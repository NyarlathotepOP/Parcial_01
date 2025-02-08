package com.config.Parcial_1.Controllers;

import org.springframework.stereotype.Controller; //Se cambio la anotacion de RestController a Controller para una vista html en publico
import org.springframework.web.bind.annotation.GetMapping;

/* @RestController 
 * Se cambio la anotacion de RestController a Controller para una vista html en publico
*/
@Controller
public class MiControlador {

    @GetMapping("/publico")
    public String publico() {
        return "publico";
    }

    @GetMapping("/privado")
    public String privado() {
        return "privado";
    }
}
