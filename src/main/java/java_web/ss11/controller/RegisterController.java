package java_web.ss11.controller;

import java_web.ss11.dto.RegisterDto;
import java_web.ss11.validate.AdminGroup;
import java_web.ss11.validate.UserGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.SmartValidator;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    private SmartValidator validator;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new RegisterDto());
        return "b5";
    }

    @PostMapping("/register")
    public String processForm(@ModelAttribute("user") RegisterDto user,
                              BindingResult result, Model model) {
        Class<?> group = "admin".equalsIgnoreCase(user.getRole()) ? AdminGroup.class : UserGroup.class;

        validator.validate(user, result, group);

        if (result.hasErrors()) {
            return "b5";
        }

        model.addAttribute("message", "Đăng ký thành công!");
        return "result";
    }
}
