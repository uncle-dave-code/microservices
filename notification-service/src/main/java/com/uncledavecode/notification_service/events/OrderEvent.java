package com.uncledavecode.notification_service.events;


import com.uncledavecode.notification_service.model.enums.OrderStatus;

public record OrderEvent(String orderNumber, int itemsCount, OrderStatus orderStatus) {
}
