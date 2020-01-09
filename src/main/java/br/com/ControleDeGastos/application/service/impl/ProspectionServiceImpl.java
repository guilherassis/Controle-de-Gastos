package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.dao.ProspectionRepository;
import br.com.ControleDeGastos.application.domain.entity.Prospection;
import br.com.ControleDeGastos.application.service.ProspectionServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProspectionServiceImpl implements ProspectionServiceCustom {

    @Autowired
    ProspectionRepository prospectionRepository;

    @Transactional
    public Optional<Prospection> findById(Long id){
        return prospectionRepository.findById(id);

    }

    @Transactional
    public List<Prospection> findAll(){
        return prospectionRepository.findAll();

    }

    @Transactional
    public void delete(Long id){
        prospectionRepository.deleteById(id);

    }

    @Transactional
    public Prospection save(Prospection prospection){
       return prospectionRepository.save(prospection);

    }


}
