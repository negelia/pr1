package com.example.pr1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Test(Model model){
        return "home";
    }

    @PostMapping("/calculator")
    public String PostResult(
            @RequestParam(
                    value = "numberOne",
                    required = true,
                    defaultValue = "0") double a,
            @RequestParam(
                    value = "numberTwo",
                    required = true,
                    defaultValue = "0") double b,
            @RequestParam(
                    value = "operator",
                    required = true,
                    defaultValue = "0") String select,
            @RequestParam(
                    value = "exception",
                    required = true,
                    defaultValue = "ошибок нет") String exception,
            Model model){
        double c = 0;

        if (select.equals("+")){
            c = a+b;
        }
        else if (select.equals("-")){
            c = a-b;
        }
        else if (select.equals("*")){
            c = a*b;
        }
        else if (select.equals("/")){
            exception = "делить на ноль нельзя";
            if (b == 0){
                model.addAttribute("exception",exception);
            }
            else {
                c = a/b;
            }
        }
        model.addAttribute("res",c);
        return "calculator";
    }
    @GetMapping("/calculator")
    public String GetResult(
            @RequestParam(
                    value = "numberOne",
                    required = true,
                    defaultValue = "0") double a,
            @RequestParam(
                    value = "numberTwo",
                    required = true,
                    defaultValue = "0") double b,
            @RequestParam(
                    value = "operator",
                    required = true,
                    defaultValue = "0") String select,
            @RequestParam(
                    value = "exception",
                    required = true,
                    defaultValue = "ошибок нет") String exception,
            Model model){
        double c = 0;

        if (select.equals("+")){
            c = a+b;
        }
        else if (select.equals("-")){
            c = a-b;
        }
        else if (select.equals("*")){
            c = a*b;
        }
        else if (select.equals("/")){
            exception = "делить на ноль нельзя";
            if (b == 0){
                model.addAttribute("exception",exception);
            }
            else {
                c = a/b;
            }
        }
        model.addAttribute("res",c);
        return "calculator";
    }
}
