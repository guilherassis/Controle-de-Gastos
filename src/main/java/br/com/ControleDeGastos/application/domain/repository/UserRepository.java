package br.com.ControleDeGastos.application.domain.repository;

import br.com.ControleDeGastos.application.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(@Param("email") String email);
}
