import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операционную систему (0 - iOS, 1 - Android) ");
        int clientOS = scanner.nextInt();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Для такой ОС у нас нет приложения (((");
        }

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default: System.out.println("Для такой ОС у нас нет приложения (((");
        }

        System.out.println();
        //Задача №2
        System.out.println("Задача 2");
        System.out.print("Введите операционную систему (0 - iOS, 1 - Android) ");
        clientOS = scanner.nextInt();
        System.out.print("Введите год создания смартфона ");
        int clientDeviceYear = scanner.nextInt();
        if (clientDeviceYear >= 2015  && clientDeviceYear <= 2025) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Для такой ОС у нас нет приложения (((");
            }
        } else if (clientDeviceYear >= 2000 && clientDeviceYear < 2015) {
            if (clientOS == 0)  {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Для такой ОС у нас нет приложения (((");
            }
        } else {
            System.out.println("Неверная дата выпуска");
        }
        //Можно извратиться и с переключателем, но без if-else тут не обойтись)):
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015  && clientDeviceYear <= 2025) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (clientDeviceYear >= 2000  && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Неверная дата выпуска");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015  && clientDeviceYear <= 2025) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (clientDeviceYear >= 2000 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Неверная дата выпуска");
                }
                break;
            default: System.out.println("Для такой ОС у нас нет приложения (((");
        }

        System.out.println();
        //Задача №3
        System.out.println("Задача 3");
        System.out.print("Введите интересующий Вас год, чтобы узнать, является ли он високосным ");
        int year = scanner.nextInt();
        if (year < 1584) {
            System.out.println("Начиная с 1584 года, в григорианском календаре были введены високосные года");
        } else if ((year % 100 == 0) &&  (year % 400 != 0)) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
        //Здесь в будущее можно смотреть)
        //Переключатель тут не подходит, потому не делаю, всё таки узко специализированная вещь...

        System.out.println();
        //Задача №4
        System.out.println("Задача 4");
        System.out.print("Введите расстояние до адреса доставки клиенту карты банка в км ");
        int deliveryDistance = scanner.nextInt();
        int requireDays = deliveryDistance / 20; //Требуемые дни для доставки без учета доп суток
        if (deliveryDistance <= 20 && deliveryDistance >= 0) {
            System.out.println("Потребуется дней: " + (requireDays + 1));
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (requireDays + 2));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (requireDays + 3));
        } else if (deliveryDistance < 0) {
            System.out.println("У нас не мультивселенная");
        } else System.out.println("Доставка карты производится в пределах 100км");

        System.out.println();
        //Задача №5
        System.out.println("Задача 5");
        System.out.print("Введите номер месяца в году ");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default: System.out.println("Месяцев в году 12, соответственно вводить число необходимо в диапазоне 1- 12");
        }
    }
}