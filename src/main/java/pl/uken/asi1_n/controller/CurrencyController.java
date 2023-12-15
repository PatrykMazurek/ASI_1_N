package pl.uken.asi1_n.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import pl.uken.asi1_n.model.Currency;
import pl.uken.asi1_n.service.CurrencyService;

import java.util.List;

@Controller
@RequestMapping("/waluty")
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping("/")
    public String showData(Model model){
        model.addAttribute("currency", currencyService.getAllCurrency());
        return "currancy/index";
    }

}
