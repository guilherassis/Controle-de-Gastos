package br.com.ControleDeGastos.application.service;

import br.com.ControleDeGastos.application.domain.entity.SpentLaunches;

import java.util.List;
import java.util.Optional;

public interface SpentLaunchesServiceCustom {

    Optional<SpentLaunches> findById(Long id);
    List<SpentLaunches> findAll();
    void deleteById(Long id);
    SpentLaunches save(SpentLaunches spentLaunches);

}
