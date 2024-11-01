package hn.unah.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.dtos.Alumno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    private List<Alumno> listaAlumnos = new ArrayList<>();

    @GetMapping("/crear")
    public String crearAlumno(@RequestBody Alumno alumno) {
        this.listaAlumnos.add(alumno);
        return "Se ha agregado el alumno: " +  alumno.toString();
    }
    
    @GetMapping("/obtener/todos")
    public List<Alumno> obtenerAlumnos() {
        return this.listaAlumnos;
    }
    

    
}
