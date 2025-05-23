package java_web.ss11.controller;

import jakarta.validation.Valid;
import java_web.ss11.dto.ProductReviewDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductReviewController {

    @GetMapping("/review")
    public String showReviewForm(@ModelAttribute("reviewDTO") ProductReviewDTO reviewDTO) {
        return "review-form";
    }

    @PostMapping("/review")
    public String submitReview(@Valid @ModelAttribute("reviewDTO") ProductReviewDTO reviewDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "review-form";
        }
        model.addAttribute("successMessage", "Cảm ơn bạn đã gửi đánh giá!");
        return "review-form";
    }
}