package java_web.ss11.validate;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {
    String message() default "Email không hợp lệ!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}