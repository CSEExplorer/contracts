package com.aditya.contracts.events;


import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class DomainEvent<T> {

    private UUID eventId;
    private String eventType;
    private String eventVersion;
    private Instant occurredAt;

    private String aggregateType;
    private UUID aggregateId;

    private T payload;


    public static <T> DomainEvent<T> of(
            String eventType,
            String eventVersion,
            String aggregateType,
            UUID aggregateId,
            T payload
    ) {
        return DomainEvent.<T>builder()
                .eventId(UUID.randomUUID())
                .eventType(eventType)
                .eventVersion(eventVersion)
                .occurredAt(Instant.now())
                .aggregateType(aggregateType)
                .aggregateId(aggregateId)
                .payload(payload)
                .build();
    }
}
