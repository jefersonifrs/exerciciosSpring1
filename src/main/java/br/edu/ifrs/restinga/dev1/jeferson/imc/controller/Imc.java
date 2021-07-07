package br.edu.ifrs.restinga.dev1.jeferson.imc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Imc {

    @RequestMapping("/imc/{peso}/{altura}")
    @ResponseBody
    public String imc(@PathVariable float peso, @PathVariable float altura) {
        float resultado = peso / (altura * altura);
        if (resultado < 18.5) {
            return "Magreza";
        } else if (resultado < 24.9) {
            return "Saudável";
        } else if (resultado < 29.9) {
            return "Sobrepeso";
        } else if (resultado < 34.9) {
            return "Obesidade Grau I";
        } else if (resultado < 39.9) {
            return "Obesidade Grau II (sereva)";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}
