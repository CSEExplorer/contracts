package com.aditya.contracts.catalog;

import lombok.*;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class MenuItemPriceChangedEvent {

    private UUID itemId;
    private double oldPrice;
    private double newPrice;
}