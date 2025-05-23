package java_web.ss11.validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPhoneNumber {
    String message() default "Số điện thoại không hợp lệ. Phải bắt đầu bằng 0 và có đúng 10 chữ số.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}