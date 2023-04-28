package com.uncledavecode.inventory_service.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemRequest {

    private Long id;
    private String sku;
    private Double price;
    private Long quantity;
}
