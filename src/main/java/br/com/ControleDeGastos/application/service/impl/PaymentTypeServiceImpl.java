package br.com.ControleDeGastos.application.service.impl;

import br.com.ControleDeGastos.application.domain.dao.PaymentTypeRepository;
import br.com.ControleDeGastos.application.domain.entity.PaymentType;
import br.com.ControleDeGastos.application.service.PaymentTypeServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentTypeServiceImpl implements PaymentTypeServiceCustom {

    @Autowired
    PaymentTypeRepository paymentTypeRepository;

    @Transactional
    public Optional<PaymentType> findById(Long id){
        return paymentTypeRepository.findById(id);

    }

    @Transactional
    public List<PaymentType> findAll(){
        return paymentTypeRepository.findAll();

    }

    @Transactional
    public PaymentType save(PaymentType paymentType){
       return paymentTypeRepository.save(paymentType);
    }

    @Transactional
    public void deleteById(Long id){
        paymentTypeRepository.deleteById(id);

    }

}
