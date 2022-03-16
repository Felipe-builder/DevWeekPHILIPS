package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.FaixaEtaria;
import com.dio_class.devweek.Entity.Incidencia;
import com.dio_class.devweek.Repository.FaixaEtariaRepository;
import com.dio_class.devweek.Repository.IncidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class IncidenciaController {

    @Autowired
    private IncidenciaRepository incidenciaRepository;

    @GetMapping(value = "/incidencias")
    public ResponseEntity<List<Incidencia>> findAll(){
        try {
            List<Incidencia> list = incidenciaRepository.findAll();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/incidencias/{id}")
    public ResponseEntity<Incidencia> findById(@PathVariable Long id) {
        Optional<Incidencia> regiaoRepositoryById = incidenciaRepository.findById(id);
        if (regiaoRepositoryById.isPresent()){
            Incidencia faixaEtariaEscolhida = regiaoRepositoryById.get();
            return new ResponseEntity<>(faixaEtariaEscolhida, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/incidencias/novo")
    public Incidencia create(@RequestBody Incidencia newIncidencia){
        return incidenciaRepository.save(newIncidencia);
    }

    @DeleteMapping(value = "/incidencias/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        incidenciaRepository.deleteById(id);
    }

}
