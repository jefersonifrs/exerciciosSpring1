package br.edu.ifrs.restinga.dev1.jeferson.imc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller
public class DiaDaSemana {

    @RequestMapping("/diaSemana/{ano}/{mes}/{dia}")
    @ResponseBody
    public String diaSemana(@PathVariable int ano, @PathVariable int mes, @PathVariable int dia) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = String.format("%s/%s/%s", dia, mes, ano);
        Date date = fmt.parse(dataFormatada);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                return "DOMINGO";
            case 2:
                return "SEGUNDA";
            case 3:
                return "TERÇA";
            case 4:
                return "QUARTA";
            case 5:
                return "QUINTA";
            case 6:
                return "SEXTA";
            case 7:
                return "SABADO";
        }
        return null;
    }
}
