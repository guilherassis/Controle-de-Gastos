package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.repository.SpentLaunchesRepository;
import br.com.ControleDeGastos.application.domain.entity.SpentLaunches;
import br.com.ControleDeGastos.application.service.SpentLaunchesServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpentLaunchesServiceImpl implements SpentLaunchesServiceCustom {

    @Autowired
    SpentLaunchesRepository spentLaunchesRepository;

    @Override
    public Optional<SpentLaunches> findById(Long id) {
        return spentLaunchesRepository.findById(id);
    }

    @Override
    public List<SpentLaunches> findAll() {
        return spentLaunchesRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        spentLaunchesRepository.deleteById(id);

    }

    @Override
    public SpentLaunches save(SpentLaunches spentLaunches) {
        return spentLaunchesRepository.save(spentLaunches);
    }
}
