package br.com.ControleDeGastos.application.service;

import br.com.ControleDeGastos.application.domain.entity.MonthlyIncome;

import java.util.List;
import java.util.Optional;

public interface MonthlyIncomeServiceCustom {

    void deleteById(Long id);
    MonthlyIncome save(MonthlyIncome monthlyIncome);
    List<MonthlyIncome> findAll();
    Optional<MonthlyIncome> findbyId(Long id);


}
