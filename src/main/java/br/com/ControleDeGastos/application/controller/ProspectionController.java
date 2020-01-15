package br.com.ControleDeGastos.application.controller;

import br.com.ControleDeGastos.application.domain.entity.Prospection;
import br.com.ControleDeGastos.application.service.impl.ProspectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/prospection")
public class ProspectionController {

    @Autowired
    ProspectionServiceImpl prospectionService;

    @GetMapping("")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(prospectionService.findAll());

    }

    @GetMapping("/id/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(prospectionService.findById(id));

    }

    @PutMapping("")
    public ResponseEntity save(@RequestBody Prospection prospection){
        return ResponseEntity.ok(prospectionService.save(prospection));

    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id){
        prospectionService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
