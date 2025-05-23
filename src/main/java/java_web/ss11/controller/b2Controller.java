package java_web.ss11.controller;

import jakarta.validation.Valid;
import java_web.ss11.dto.B2_3_4Dto;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class b2Controller {

    @GetMapping("/b2")
    public String showForm(@ModelAttribute("user") B2_3_4Dto user) {
        return "register";
    }

    @PostMapping("/b2")
    public String submitForm(@Valid @ModelAttribute("user") B2_3_4Dto user,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "b2-3-4";
        }
        return "result";
    }
}
