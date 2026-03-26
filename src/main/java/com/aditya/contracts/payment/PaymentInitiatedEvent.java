package com.aditya.contracts.payment;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentInitiatedEvent {

    private UUID paymentId;          // 🔥 aggregateId reference
    private UUID orderId;
    private UUID userId;

    private BigDecimal amount;
    private String currency;

    // Gateway info
    private String gatewayOrderId;   // razorpay_order_id
}