package java_web.ss11.dto;

import jakarta.validation.constraints.NotBlank;
import java_web.ss11.validate.ValidEmail;
import java_web.ss11.validate.ValidPassword;

public class B2_3_4Dto {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @ValidEmail
    private String email;

    @NotBlank(message = "Password is required")
    @ValidPassword
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
