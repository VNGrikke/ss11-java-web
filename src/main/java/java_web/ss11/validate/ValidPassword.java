// ValidPassword.java
package java_web.ss11.validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {
    String message() default "Password must be at least 8 characters, contain upper-case, lower-case letters and digits.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
