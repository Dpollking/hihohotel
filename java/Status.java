package by.itacademy;

enum Status {
    PENDING("Ожидает подтверждения"),
    CONFIRMED("Подтвержден"),
    CANCELLED("Отменён"),
    REFUNDED("Оплачен"),
    COMPLETED("Выполнен");

    private String value;


    Status(String value) {
        this.value = value;
    }

}
