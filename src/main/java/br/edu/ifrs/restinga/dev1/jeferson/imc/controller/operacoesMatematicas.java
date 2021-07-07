package br.edu.ifrs.restinga.dev1.jeferson.imc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class operacoesMatematicas {

    @RequestMapping("/calculadora/adicao")
    @ResponseBody
    public int adicao (@RequestParam("n1") int numero1, @RequestParam("n2") int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    @RequestMapping("/calculadora/subtracao")
    @ResponseBody
    public int subtracao (@RequestParam("n1") int numero1, @RequestParam("n2") int numero2) {
        int resultado = numero1 - numero2;
        return resultado;
    }

    @RequestMapping("/calculadora/multiplicacao")
    @ResponseBody
    public int multiplicacao (@RequestParam("n1") int numero1, @RequestParam("n2") int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }

    @RequestMapping("/calculadora/divisao")
    @ResponseBody
    public double divisao (@RequestParam("n1") int numero1, @RequestParam("n2") int numero2) {
        try {
            double resultado = numero1 / numero2;
            return resultado;
        } catch (Exception e) {
            System.out.println("Não possivel divisao por zero");
            return 0;
        }
    }
}
