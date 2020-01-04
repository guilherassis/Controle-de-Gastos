package br.com.ControleDeGastos.application.domain.entity;


import br.com.ControleDeGastos.application.utils.DateTimeUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",nullable = false,length = 255)
    private String name;

    @Column(name = "email",nullable = false,length = 255)
    private String email;

    @Column(name = "password",nullable = false,length = 255)
    private String password;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @CreatedDate
    @Column(name = "created_date")
    @Convert(converter = DateTimeUtils.class)
    private LocalDateTime createDate;


}
