package br.com.ControleDeGastos.application.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("br.com.ControleDeGastos.application.controller"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Controle de Gastos Api",
                "Um sistema completo para controlar contas a pagar e receber, e controlar seus gastos pessoais.",
                "1.0.0-RELEASE",
                "Terms of service",
                new Contact("Guilherme Assis",
                        "google.com",
                        "guilher.assis@gmail.com"),
                "License API",
                "API license URL", Collections.emptyList());
    }




}
