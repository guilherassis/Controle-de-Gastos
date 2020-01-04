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
@Entity(name = "monthlyIncome")
public class MonthlyIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description",nullable = false,length = 255)
    private String description;

    @Column(name = "dateIncome")
    private LocalDateTime dateIncome;

    @Column(name = "valueIncome")
    private Float valueIncome;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

}
