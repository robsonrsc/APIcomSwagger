package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping()
    public String welcome(){

        return "Bem vindo ao meu estudo de API com Spring Boot";
    }

}
