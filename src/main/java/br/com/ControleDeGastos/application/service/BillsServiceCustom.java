package br.com.ControleDeGastos.application.service;

import br.com.ControleDeGastos.application.domain.entity.Bills;

import java.util.List;
import java.util.Optional;

public interface BillsServiceCustom {

    List<Bills> findAll();
    Optional<Bills> findById(Long id);
    Bills save(Bills bills);
    void delete(Bills bills);
    void deleteById(Long id);

}

