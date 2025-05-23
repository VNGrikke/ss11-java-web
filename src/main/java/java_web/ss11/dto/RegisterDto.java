package java_web.ss11.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java_web.ss11.validate.AdminGroup;
import java_web.ss11.validate.UserGroup;

public class RegisterDto {

    @NotBlank(message = "Tên không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String name;

    @NotBlank(message = "Email không được để trống", groups = {AdminGroup.class, UserGroup.class})
    @Email(message = "Email không hợp lệ", groups = {AdminGroup.class, UserGroup.class})
    private String email;

    @NotBlank(message = "Vai trò không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String role;

    @NotBlank(message = "Mã xác thực admin là bắt buộc", groups = AdminGroup.class)
    private String adminCode;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }
}
