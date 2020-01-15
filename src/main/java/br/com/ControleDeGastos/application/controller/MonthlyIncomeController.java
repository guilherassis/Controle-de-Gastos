package br.com.ControleDeGastos.application.controller;

import br.com.ControleDeGastos.application.domain.entity.MonthlyIncome;
import br.com.ControleDeGastos.application.service.impl.MonthlyIncomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/monthlyincome")
public class MonthlyIncomeController {

    @Autowired
    MonthlyIncomeServiceImpl monthlyIncomeService;

    @GetMapping("")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(monthlyIncomeService.findAll());

    }

    @GetMapping("/id/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(monthlyIncomeService.findbyId(id));

    }

    @PutMapping("")
    public ResponseEntity save(@RequestBody MonthlyIncome monthlyIncome){
        return ResponseEntity.ok(monthlyIncomeService.save(monthlyIncome));

    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id){
        monthlyIncomeService.deleteById(id);
        return ResponseEntity.ok().build();


    }
}
