package br.com.ControleDeGastos.application.controller;

import br.com.ControleDeGastos.application.domain.entity.User;
import br.com.ControleDeGastos.application.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController{

    @Autowired
    UserServiceImpl userService;

    @PostMapping("")
    public ResponseEntity save(@RequestBody User user){
        return ResponseEntity.ok(userService.save(user));

    }

    @GetMapping("/id/{id}")
    public ResponseEntity findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping("")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(userService.findAll());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id){
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/name/{name}")
    public ResponseEntity findByName(@PathVariable("name") String name) {
    	return ResponseEntity.ok(userService.findByName(name));
    	
    }
    
    @PutMapping("/changeName/{name}/{newName}")
    public ResponseEntity changeNameByName(@PathVariable("name") String name, @PathVariable("newName") String newName) {
    	return ResponseEntity.ok(userService.changeNameByName(name, newName));
    	
    }
    
    @PutMapping("/changeEmail/{name}/{email}")
    public ResponseEntity changeEmailByName(@PathVariable("name") String name,@PathVariable("email") String email) {
    	return ResponseEntity.ok(userService.changeEmailByName(name, email));
    	
    }
    
    @PutMapping("/changePassword/{name}/{password}")
    public ResponseEntity changePasswordByName(@PathVariable("name") String name, @PathVariable("password") String password) {
    	return ResponseEntity.ok(userService.changePasswordByName(name, password));
    	
    }

}
