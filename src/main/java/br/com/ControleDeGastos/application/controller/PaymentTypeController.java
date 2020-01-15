package br.com.ControleDeGastos.application.controller;


import br.com.ControleDeGastos.application.domain.entity.PaymentType;
import br.com.ControleDeGastos.application.service.impl.PaymentTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/paymenttype")
public class PaymentTypeController {

    @Autowired
    PaymentTypeServiceImpl paymentTypeService;

    @GetMapping("")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(paymentTypeService.findAll());

    }

    @GetMapping("/id/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(paymentTypeService.findById(id));

    }

    @PutMapping("")
    public ResponseEntity save(@RequestBody PaymentType paymentType){
        return ResponseEntity.ok(paymentTypeService.save(paymentType));

    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id){
        paymentTypeService.deleteById(id);
        return ResponseEntity.ok().build();

    }

}
