package java_web.ss11.dto;

import jakarta.validation.constraints.NotBlank;
import java_web.ss11.validate.ValidPhoneNumber;

public class UserDTO {
    @NotBlank(message = "Tên không được để trống")
    private String name;

    @ValidPhoneNumber
    private String phoneNumber;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}