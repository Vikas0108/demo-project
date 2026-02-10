package com.example.demo.dto.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    @NotNull(message = "product_id is required")
    @JsonProperty("product_id")
    private Integer productId;

    @NotBlank(message = "product_name is required")
    @JsonProperty("product_name")
    private String name;

    @NotBlank(message = "product_description is required")
    @JsonProperty("product_description")
    private String description;

}
