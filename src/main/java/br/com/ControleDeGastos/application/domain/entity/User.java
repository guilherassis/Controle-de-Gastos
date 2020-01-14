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


    public User(User user) {
        super();
        this.id=user.getId();
        this.name = user.getName();
        this.password = user.getPassword();
        this.email = user.getEmail();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
