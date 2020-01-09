package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.repository.ProspectionRepository;
import br.com.ControleDeGastos.application.domain.entity.Prospection;
import br.com.ControleDeGastos.application.service.ProspectionServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProspectionServiceImpl implements ProspectionServiceCustom {

    @Autowired
    ProspectionRepository prospectionRepository;

    @Override
    public Optional<Prospection> findById(Long id){
        return prospectionRepository.findById(id);

    }

    @Override
    public List<Prospection> findAll(){
        return prospectionRepository.findAll();

    }

    @Override
    public void delete(Long id){
        prospectionRepository.deleteById(id);

    }

    @Override
    public Prospection save(Prospection prospection){
       return prospectionRepository.save(prospection);

    }


}
