package br.com.ControleDeGastos.application.domain.repository;

import br.com.ControleDeGastos.application.domain.entity.Prospection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectionRepository extends JpaRepository<Prospection, Long> {
}
