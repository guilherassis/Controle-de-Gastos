package br.com.ControleDeGastos.application.domain.repository;

import br.com.ControleDeGastos.application.domain.entity.User;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(@Param("email") String email);
    
    User findUserByName(@Param("name") String name);
    
    @Transactional
    @Modifying
    @Query (value = "UPDATE user SET name = :newName WHERE name = :name",nativeQuery = true)
    void changeNameByName (@Param("name") String name,@Param("newName") String newName);
    
    @Transactional
    @Modifying
    @Query (value = "UPDATE user SET password = :password WHERE name = :name",nativeQuery = true)
    void changePasswordByName (@Param("name") String name, @Param("password") String email);
    
    @Transactional
    @Modifying
    @Query (value = "UPDATE user SET email = :email WHERE name = :name",nativeQuery = true)
    void changeEmailByName (@Param("name") String name, @Param("email") String email);
   
    
    
}
