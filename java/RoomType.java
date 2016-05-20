package by.itacademy;

enum RoomType {
    SINGLE_ROOM("Single room"),
    DOUBLE_ROOM("Double room"),
    APARTMENT_ROOM("Apartment room"),
    SENIOR_SUITE("Senior Suite"),
    TWO_STORY_ROOM("Two story room"),
    FAMILY_ROOM("Family room"),
    HONEYMOON_ROOM("Honeymoon room"),
    STUDIO("Studio");

    private String value;

    RoomType(String value) {
        this.value = value;
    }
}
