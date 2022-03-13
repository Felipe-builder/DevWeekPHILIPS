package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.Regiao;
import com.dio_class.devweek.Repository.RegiaoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class RegiaoController {


    private final RegiaoRepository regiaoRepository;


    public RegiaoController(RegiaoRepository regiaoRepository) {
        this.regiaoRepository = regiaoRepository;
    }

    @GetMapping(value = "/regioes")
    public List<Regiao> getRegiao(){
        return regiaoRepository.findAll();
    }

    @GetMapping(value = "/regioes/{id}")
    public ResponseEntity<?> getRegiaoById(@PathVariable Long id) {
        Optional regiaoRepositoryById = regiaoRepository.findById(id);
        if (regiaoRepositoryById.isPresent()){
            Object regiaoEscolhida = regiaoRepositoryById.get();
            return new ResponseEntity<>(regiaoEscolhida, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/regioes/novo")
    public Regiao putRegiao(@RequestBody Regiao newRegiao){
        return regiaoRepository.save(newRegiao);
    }

    @DeleteMapping(value = "/regioes/delete/{id}")
    public void deleteRegiao(@PathVariable Long id) {
        regiaoRepository.deleteById(id);

    }
}
