package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserServiceImpl service;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user =  service.findByUserEmail(email);

        if(user == null){
            throw new UsernameNotFoundException("Usuário não encontrado com nome de usuario"+email);


        }

        return new UserRepositoryDetails(user);


    }


    private final static class UserRepositoryDetails extends User implements UserDetails{


        private static final long serialVersionUID = 1;
        private UserRepositoryDetails(User user){
            super(user);
        }


        @Override
        public String getPassword() {
            return super.getPassword();
        }

        @Override
        public String getUsername() {
            return this.getEmail();
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return null;
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }

}
