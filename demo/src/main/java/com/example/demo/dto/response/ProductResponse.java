package com.example.demo.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    public boolean success;
    public String message;
}
