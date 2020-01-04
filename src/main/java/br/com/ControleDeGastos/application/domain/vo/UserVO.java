package br.com.ControleDeGastos.application.domain.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVO {

    private String name;
    private String email;


}
