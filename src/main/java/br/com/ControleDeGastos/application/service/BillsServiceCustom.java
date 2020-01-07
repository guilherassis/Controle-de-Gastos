package br.com.ControleDeGastos.application.service;

import br.com.ControleDeGastos.application.domain.entity.Bills;

import java.util.List;
import java.util.Optional;

public interface BillsServiceCustom {

    List<Bills> listAllBills();
    Optional<Bills> findByIdBills(Long id);
    Bills save(Bills bills);
    void delete(Bills bills);
    void deleteById(Long id);

}

