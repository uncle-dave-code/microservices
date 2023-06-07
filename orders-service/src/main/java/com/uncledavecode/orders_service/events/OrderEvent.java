package com.uncledavecode.orders_service.events;

import com.uncledavecode.orders_service.model.enums.OrderStatus;

public record OrderEvent(String orderNumber, int itemsCount, OrderStatus orderStatus) {
}
