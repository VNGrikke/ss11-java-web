package java_web.ss11.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String> {
    @Override
    public void initialize(ValidPhoneNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        if (phoneNumber == null) {
            return false;
        }
        // Kiểm tra định dạng: bắt đầu bằng 0 và có đúng 10 chữ số
        return phoneNumber.matches("^0\\d{9}$");
    }
}