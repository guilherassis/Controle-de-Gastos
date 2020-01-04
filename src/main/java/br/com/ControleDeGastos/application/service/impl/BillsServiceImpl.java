package br.com.ControleDeGastos.application.service.impl;


import br.com.ControleDeGastos.application.domain.dao.BillsRepository;
import br.com.ControleDeGastos.application.domain.entity.Bills;
import br.com.ControleDeGastos.application.service.BillsServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BillsServiceImpl implements BillsServiceCustom {

    @Autowired
    BillsRepository billsRepository;

    @Transactional
    public List<Bills> listaBills(){
        return billsRepository.findAll();

    }

}
