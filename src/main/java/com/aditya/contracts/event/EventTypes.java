package com.aditya.contracts.event;



public final class EventTypes {

    private EventTypes() {}

    public static final String RESTAURANT_CREATED = "RestaurantCreated";
    public static final String RESTAURANT_UPDATED = "RestaurantUpdated";
    public static final String RESTAURANT_DELETED = "RestaurantDeleted";
    public static final String MENU_CATEGORY_CREATED = "MenuCategoryCreated";
    public static final String MENU_CATEGORY_UPDATED = "MenuCategoryUpdated";
    public static final String MENU_CATEGORY_DELETED = "MenuCategoryDeleted";

    public static final String MENU_ITEM_CREATED = "MenuItemCreated";
    public static final String MENU_ITEM_UPDATED = "MenuItemUpdated";
    public static final String MENU_ITEM_DELETED = "MenuItemDeleted";

    public static final String VARIANT_CREATED = "VariantCreated";
    public static final String VARIANT_UPDATED = "VariantUpdated";
    public static final String VARIANT_DELETED = "VariantDeleted";
    public static final String ORDER_CREATED = "OrderCreated";


    public static final String ORDER_CONFIRMED = "OrderConfirmed";
    public static final String ORDER_FAILED = "OrderFailed";
    public  static  final String PAYMENT_INITIATED  = "PaymentInitiated";
    public static final String PAYMENT_COMPLETED = "PaymentCompleted";
    public static final String PAYMENT_FAILED = "PaymentFailed";


}