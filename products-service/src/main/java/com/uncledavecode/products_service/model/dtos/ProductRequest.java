package com.uncledavecode.products_service.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequest {

    private String sku;
    private String name;
    private String description;
    private Double price;
    private Boolean status;
}
