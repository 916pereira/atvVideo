
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("nome", "Matheus");
        model.addAttribute("curso", "Análise e Desenvolvimento de Sistemas");
        model.addAttribute("profissao", "Desenvolvedor em formação");

        model.addAttribute("sobre",
                "Sou estudante de tecnologia, interessado em desenvolvimento web, " +
                "programação Java e criação de soluções digitais.");

        model.addAttribute("habilidades", new String[]{
                "Java",
                "Spring Boot",
                "HTML e CSS",
                "JavaScript",
                "React",
                "SQL"
        });

        return "index";
    }
}
