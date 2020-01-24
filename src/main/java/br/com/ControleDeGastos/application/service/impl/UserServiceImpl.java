package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.repository.UserRepository;
import br.com.ControleDeGastos.application.domain.entity.User;
import br.com.ControleDeGastos.application.service.UserServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServiceCustom {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;


    @Override
    public User changeNameByName(String name) {
    	userRepository.changeNameByName(name);
    	
    	return userRepository.findUserByName(name);
    	
    }
    
    @Override
    public User changePasswordByName(String name, String password) {
    	userRepository.changePasswordByName(name, password);
    	return userRepository.findUserByName(name);
    	
    	
    }
    
    @Override
    public User changeEmailByName(String name, String email) {
    	userRepository.changeEmailByName(name, email);
    	return userRepository.findUserByName(name);
    }
    
    @Override
    public User findByName(String name) {
    	return userRepository.findUserByName(name);
    	
    }
    
    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public User save(User user) {
        user.setPassword(bcryptEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByUserEmail(String email) {
        return userRepository.findUserByEmail(email);

    }
}
