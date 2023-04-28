package com.uncledavecode.orders_service.model.dtos;

import java.util.List;


public record OrderResponse(Long id, String orderNumber, List<OrderItemsResponse> orderItems) {
}
