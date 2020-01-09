package br.com.ControleDeGastos.application.domain.repository;

import br.com.ControleDeGastos.application.domain.entity.MonthlyIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyIncomeRepository extends JpaRepository<MonthlyIncome, Long> {
}
