package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.dao.MonthlyIncomeRepository;
import br.com.ControleDeGastos.application.domain.entity.MonthlyIncome;
import br.com.ControleDeGastos.application.service.MonthlyIncomeServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MonthlyIncomeServiceImpl implements MonthlyIncomeServiceCustom {

    @Autowired
    MonthlyIncomeRepository monthlyIncomeRepository;

    @Transactional
    public Optional<MonthlyIncome> findbyId(Long id){
        return monthlyIncomeRepository.findById(id);

    }

    @Transactional
    public List<MonthlyIncome> findByAll(){
        return monthlyIncomeRepository.findAll();

    }

    @Transactional
    public MonthlyIncome save(MonthlyIncome monthlyIncome){
        return monthlyIncomeRepository.save(monthlyIncome);

    }

    @Transactional
    public void delete(Long id){
        monthlyIncomeRepository.deleteById(id);
    }

}
