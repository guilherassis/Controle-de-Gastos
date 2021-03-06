package br.com.ControleDeGastos.application.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "spentLaunches")
public class SpentLaunches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dateSpent",nullable = false)
    private LocalDateTime dateSpent;

    @Column(name = "amountInstallments",nullable = false)
    private int amountInstallments;

    @Column(name = "valueSpent")
    private float valueSpent;

    @ManyToOne
    @JoinColumn(name = "bills_id")
    private Bills bills_id;

    @ManyToOne
    @JoinColumn(name = "paymentType_id")
    private PaymentType paymentType_id;


}
