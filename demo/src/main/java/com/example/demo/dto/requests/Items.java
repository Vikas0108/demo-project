package com.example.demo.dto.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Items {
    private Integer id;
    private String name;
    private String description;
}
