package com.aditya.contracts.catalog.event;


import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryCreatedEvent {

    private UUID id;
    private UUID restaurantId;
    private String name;
    private Integer displayOrder;
}