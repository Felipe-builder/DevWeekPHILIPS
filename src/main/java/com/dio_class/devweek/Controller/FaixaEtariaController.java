package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.FaixaEtaria;
import com.dio_class.devweek.Entity.Regiao;
import com.dio_class.devweek.Repository.FaixaEtariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FaixaEtariaController {

    @Autowired
    private FaixaEtariaRepository faixaEtariaRepository;

    @GetMapping(value = "/faixaetarias")
    public ResponseEntity<?> findAll(){
        try {
            List<FaixaEtaria> list = faixaEtariaRepository.findAll();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/faixaetarias/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<FaixaEtaria> regiaoRepositoryById = faixaEtariaRepository.findById(id);
        if (regiaoRepositoryById.isPresent()){
            FaixaEtaria faixaEtariaEscolhida = regiaoRepositoryById.get();
            return new ResponseEntity<>(faixaEtariaEscolhida, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/faixaetarias/novo")
    public FaixaEtaria create(@RequestBody FaixaEtaria newFaixaEtaria){
        return faixaEtariaRepository.save(newFaixaEtaria);
    }

    @DeleteMapping(value = "/faixaetarias/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        faixaEtariaRepository.deleteById(id);
    }

}
