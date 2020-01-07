package br.com.ControleDeGastos.application.service.impl;


import br.com.ControleDeGastos.application.domain.dao.BillsRepository;
import br.com.ControleDeGastos.application.domain.entity.Bills;
import br.com.ControleDeGastos.application.service.BillsServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BillsServiceImpl implements BillsServiceCustom {

    @Autowired
    BillsRepository billsRepository;

    @Transactional
    public List<Bills> listAllBills(){
        return billsRepository.findAll();

    }

    @Transactional
    public Optional<Bills> findByIdBills(Long id){
        return billsRepository.findById(id);

    }

    @Transactional
    public Bills save(Bills bills){
        return billsRepository.save(bills);

    }

    @Transactional
    public void delete(Bills bills){
        billsRepository.delete(bills);

    }

    @Transactional
    public void deleteById(Long id){
        billsRepository.deleteById(id);

    }

}
