package java_web.ss11.dto;

import jakarta.validation.constraints.*;

public class ProductReviewDTO {
    @NotNull(message = "Tên không được để trống")
    private String name;

    @NotNull(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @NotNull(message = "Đánh giá không được để trống")
    @Min(value = 1, message = "Đánh giá phải từ 1 đến 5 sao")
    @Max(value = 5, message = "Đánh giá phải từ 1 đến 5 sao")
    private Integer rating;

    @Size(max = 200, message = "Bình luận không được vượt quá 200 ký tự")
    private String comment;

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

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}