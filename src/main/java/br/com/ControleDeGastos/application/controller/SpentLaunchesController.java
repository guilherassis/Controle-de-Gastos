package br.com.ControleDeGastos.application.controller;

import br.com.ControleDeGastos.application.domain.entity.SpentLaunches;
import br.com.ControleDeGastos.application.service.impl.SpentLaunchesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/spentlaunches")
public class SpentLaunchesController {

    @Autowired
    SpentLaunchesServiceImpl spentLaunchesService;

    @GetMapping("")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(spentLaunchesService.findAll());

    }

    @GetMapping("/id/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(spentLaunchesService.findById(id));

    }

    @PostMapping("")
    public ResponseEntity save(@RequestBody SpentLaunches spentLaunches){
        return ResponseEntity.ok(spentLaunchesService.save(spentLaunches));

    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id){
        spentLaunchesService.deleteById(id);
        return ResponseEntity.ok().build();

    }

}
