package hn.unah.demo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import hn.unah.demo.dtos.Alumno;

@Service
public class AlumnoService {
    
    private List<Alumno> listaAlumnos = new ArrayList<>();

    public String crearAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
        return "Se ha agregado el alumno: " +  alumno.toString();
    }

}
