package br.com.ControleDeGastos.application.service;

import br.com.ControleDeGastos.application.domain.entity.Prospection;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface ProspectionServiceCustom {

    Optional<Prospection> findById(Long id);
    List<Prospection> findAll();
    void deleteById(Long id);
    Prospection save(Prospection prospection);

}
