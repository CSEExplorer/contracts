package com.aditya.contracts.catalog;



import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class RestaurantCreatedEvent {

    private UUID restaurantId;
    private String name;
    private String description;
    private String status;

    // ✅ Updated
    private Set<String> cuisines;

    // ✅ UI Essentials
    private Double rating;
    private Integer deliveryTimeMinutes;
    private Integer costForTwo;
    private String priceRange;

    private Boolean pureVeg;

    private String city;
    private String locality;
}