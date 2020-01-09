package br.com.ControleDeGastos.application.domain.repository;

import br.com.ControleDeGastos.application.domain.entity.SpentLaunches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpentLaunchesRepository extends JpaRepository<SpentLaunches, Long> {
}
