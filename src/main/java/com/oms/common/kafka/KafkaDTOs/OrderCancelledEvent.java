package com.oms.common.kafka.KafkaDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCancelledEvent {

    //Added
    private UUID orderId;
    private UUID customerId;
    private String reason;
    private LocalDateTime cancelledAt;

}
