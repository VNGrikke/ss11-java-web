package java_web.ss11.dto;

import jakarta.validation.constraints.*;
import java_web.ss11.validate.ValidPhoneNumber;

public class B1Dto {

    @NotBlank(message = "Name is required")
    private String name;

    @Size(min = 8, max = 50, message = "Password must be between 8 and 50 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&]).{8,}$",
            message = "Password must contain at least one digit, one uppercase letter and one special character")
    private String password;

    @NotBlank(message = "Phone is required")
    @ValidPhoneNumber
    private String phone;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email")
    private String email;

    @NotNull(message = "Status is required")
    private Boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}