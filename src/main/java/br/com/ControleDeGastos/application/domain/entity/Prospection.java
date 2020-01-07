package br.com.ControleDeGastos.application.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "prospection")
public class Prospection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description",nullable = false,length = 255)
    private String description;

    @Column(name = "installments",nullable = false)
    private int installments;

    @Column(name = "value",nullable = false)
    private float value;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

}
