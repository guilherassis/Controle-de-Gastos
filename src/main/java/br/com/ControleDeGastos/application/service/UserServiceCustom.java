package br.com.ControleDeGastos.application.service;

import br.com.ControleDeGastos.application.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceCustom {

    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
    User save(User user);
    User findByUserEmail(String email);
    User findByName(String name);
    User changeNameByName(String name, String newName);
    User changePasswordByName(String name, String password);
    User changeEmailByName(String name, String email);

}
