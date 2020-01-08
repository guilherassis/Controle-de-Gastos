package br.com.ControleDeGastos.application.service;


import br.com.ControleDeGastos.application.domain.entity.PaymentType;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface PaymentTypeServiceCustom {

    Optional<PaymentType> findById(Long id);
    List<PaymentType> findAll();
    PaymentType save(PaymentType paymentType);
    void deleteById(Long id);

}
