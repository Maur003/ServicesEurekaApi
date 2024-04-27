package com.co.bonilla.usuarios.controller;

import com.co.bonilla.usuarios.entity.Alumno;
import com.co.bonilla.usuarios.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class AlumnoController {

    @Autowired
    AlumnoService service;

    @Value("${config.balanceador.test}")
    private String balanceadorTest;

    @GetMapping("/balanceador-Test")
    public ResponseEntity<?> balanceadorTest(){
        Map<String, Object> response = new HashMap<String, Object>();

        response.put("balanceador", balanceadorTest);
        response.put("alumno", service.findAll());

        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/listarAlumnos")
    public ResponseEntity<?> listarAlumnos(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/buscarAlumno/{id}")
    public ResponseEntity<?> ver(@PathVariable Long id){
        Optional <Alumno> ob = service.findById(id);

        if(ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(ob.get());
    }

    @PostMapping("/crearAlumno")
    public ResponseEntity<?> crear(@RequestBody Alumno alumno){

        Alumno alumnoDB = service.save(alumno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDB);
    }

    @PutMapping("/editarAlumno/{id}")
    public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id){
        Optional <Alumno> ob = service.findById(id);

        if(ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        Alumno alumnoDB = ob.get();
        alumnoDB.setNombre(alumno.getNombre());
        alumnoDB.setApellido(alumno.getApellido());
        alumnoDB.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDB));
    }

    @DeleteMapping("/eliminarAlumno/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
