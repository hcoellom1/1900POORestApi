package hn.unah.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.dtos.Alumno;
import hn.unah.demo.services.AlumnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/crear")
    public String crearAlumno(@RequestBody Alumno alumno) {
        return alumnoService.crearAlumno(alumno);
    }
    
    //@GetMapping("/obtener/todos")
    //public List<Alumno> obtenerAlumnos() {
        //return this.listaAlumnos;
    //}
    

    
}
