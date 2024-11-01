package hn.unah.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/mensajes")
public class MensajesController {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "Say hello to my little friend";
    }

    @GetMapping("/saludo/{nombre}/{apellido}/{edad}")
    public String decirNombre(@PathVariable(name="nombre")String nombre,
                             @PathVariable(name="apellido") String apellido,
                             @PathVariable(name="edad") int edad) {
        return "Hola " + nombre + " " + apellido + " " + "edad: " + edad;
    }

    @GetMapping("/par")
    public String esPar(@RequestParam(name="numero") int numero){
        if(numero%2 == 0)  
            return "es par";
        else
            return "es impar";
    }
    

    

}
