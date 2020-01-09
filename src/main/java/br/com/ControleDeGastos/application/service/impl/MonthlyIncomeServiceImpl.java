package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.repository.MonthlyIncomeRepository;
import br.com.ControleDeGastos.application.domain.entity.MonthlyIncome;
import br.com.ControleDeGastos.application.service.MonthlyIncomeServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonthlyIncomeServiceImpl implements MonthlyIncomeServiceCustom {

    @Autowired
    MonthlyIncomeRepository monthlyIncomeRepository;

    @Override
    public Optional<MonthlyIncome> findbyId(Long id){
        return monthlyIncomeRepository.findById(id);

    }

    @Override
    public List<MonthlyIncome> findByAll(){
        return monthlyIncomeRepository.findAll();

    }

    @Override
    public MonthlyIncome save(MonthlyIncome monthlyIncome){
        return monthlyIncomeRepository.save(monthlyIncome);

    }

    @Override
    public void delete(Long id){
        monthlyIncomeRepository.deleteById(id);
    }

}
