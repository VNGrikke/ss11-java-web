package java_web.ss11.controller;

import jakarta.validation.Valid;
import java_web.ss11.dto.B1Dto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class b1Controller {

    @GetMapping("/b1")
    public String b1(@ModelAttribute("b1Dto") B1Dto b1Dto) {
        return "b1";
    }

    @PostMapping("/b1")
    public String b1Submit(@Valid @ModelAttribute("b1Dto") B1Dto b1Dto,
                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "b1";
        }
        return "result";
    }
}
