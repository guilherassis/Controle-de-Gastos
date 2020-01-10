package br.com.ControleDeGastos.application.domain.repository;

import br.com.ControleDeGastos.application.domain.entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsRepository extends JpaRepository<Bills, Long> {
}