package br.com.ControleDeGastos.application.controller;

import br.com.ControleDeGastos.application.domain.entity.Bills;
import br.com.ControleDeGastos.application.service.impl.BillsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/bills")
public class BillsController {

    @Autowired
    BillsServiceImpl billsService;

    @GetMapping("")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(billsService.findAll());

    }

    @GetMapping("/id/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(billsService.findById(id));

    }

    @PostMapping("")
    public ResponseEntity save(@RequestBody Bills bills){
        return ResponseEntity.ok(billsService.save(bills));

    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id){
        billsService.deleteById(id);
        return ResponseEntity.ok().build();

    }

}
