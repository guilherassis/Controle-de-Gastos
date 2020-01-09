package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.dao.UserRepository;
import br.com.ControleDeGastos.application.domain.entity.User;
import br.com.ControleDeGastos.application.service.UserServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServiceCustom {

    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
