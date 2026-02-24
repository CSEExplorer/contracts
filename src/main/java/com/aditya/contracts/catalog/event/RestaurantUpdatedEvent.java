package com.aditya.contracts.catalog.event;



import lombok.*;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class RestaurantUpdatedEvent {

    private UUID restaurantId;
    private String name;
    private String description;
    private String status;
    private String cuisineTypes;
    private Long version;
}