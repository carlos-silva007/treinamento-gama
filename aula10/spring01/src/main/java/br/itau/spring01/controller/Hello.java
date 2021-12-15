package br.itau.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que a classe é um controler do tipo REST
@CrossOrigin("*")   //aceita requisições de qualquer outro dominio
@RequestMapping("/hello")  //nome do recurso que esta sendo acessado

public class Hello {

@GetMapping   //esse metodo é acesso por um GET

    public String ola(){
        return "Hello World";
    }
    //pra ver no chrome >>http://localhost:8080/hello
}
