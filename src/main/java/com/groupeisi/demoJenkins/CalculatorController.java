package com.groupeisi.demoJenkins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/calculate")
    public String calculateSum(@RequestParam("number1") int number1,
                               @RequestParam("number2") int number2,
                               Model model) {
        int sum = number1 + number2;
        model.addAttribute("sum", sum);
        return "result";
    }
}
