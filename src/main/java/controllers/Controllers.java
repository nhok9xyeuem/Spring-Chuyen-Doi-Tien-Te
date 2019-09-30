package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {
    @GetMapping("/views")
    public String view() {
        return "views";
    }

    @PostMapping("/amount")
    public String amount(
            @RequestParam Float amount,
            @RequestParam Float input,
            @RequestParam Float output
            , Model model) {

        Float result = (amount * output) / input;
        model.addAttribute("amount", amount);
        model.addAttribute("output", output);
        model.addAttribute("input", input);
        model.addAttribute("result", result);

        return "amount";


    }
}
