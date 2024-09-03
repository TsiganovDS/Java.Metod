public class z2 {
    public static void checkYear() {
        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
public static void DeviceYear() {
    int a = 0; // 0 - Android
    int clientDeviceYear = 2012;
    if (a == 1 && clientDeviceYear <= 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
    }
    else if (a == 0 && clientDeviceYear <= 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке.");
    }
    else if (a == 1) {
        System.out.println("Установите версию приложения для iOS по ссылке.");
    }
    else {
        System.out.println("Установите версию приложения для Android по ссылке.");

    }
}
public static void distance() {
    int deliveryDistance = 66;
    if (deliveryDistance >0 && deliveryDistance < 20) {
        System.out.println("Потребуется дней: 1." + "Срок доставки: 1 сутки.");
    }
    else if (deliveryDistance >20 && deliveryDistance < 60) {
        System.out.println("Потребуется дней: 2." + "Срок доставки: 2 суток.");
    }
    else if (deliveryDistance >60 && deliveryDistance < 100) {
        System.out.println("Потребуется дней: 3." + "Срок доставки: 3 суток.");
    } else {
        System.out.println("Доставки нет.");
    }
}


public static void main(String[] args) {
        checkYear();
        DeviceYear();
        distance();
    }
}



