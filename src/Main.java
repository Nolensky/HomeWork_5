import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        {

            byte clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Вы ввели неверные данные");
            }

        }
        // Задача 2
        {
            byte clientOS = 0;
            short clientDeviceYear = 2012;
            String os;

            if (clientOS == 0) {
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            }else if (clientOS == 1) {
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }else {
                System.out.println("Вы ввели неверные двнные");
            }
        }

        // Задача 3
        {
            int year = 2024;
            if (year % 4 == 0 && year  > 1584 ){
                System.out.println(year + " год является високосным");
            }else if (year % 100 > 0 && year > 1584){
                System.out.println(year + " год не является високосным");
            }else {
            System.out.println("Вы ввели не корректный год");
            }
        }

        // Задача 4
        {
            int timeOfDelivery = 1;
            int deliveryDistance = 95;
            if (deliveryDistance <= 20){
                System.out.println("Потребуется дней: "+ timeOfDelivery);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: "+ timeOfDelivery*2);
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + timeOfDelivery * 3);
            }else {
                System.out.println("Доставни нет");
            }
        }

        // Задача 5
        {
            int monthNumber = 15;
            switch (monthNumber){
                case 12:
                case 1:
                case 2:
                    System.out.println(monthNumber + ": Этот месяц принадлежит зиме");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + ": Этот месяц принедлежит весне");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + ": Этот месяц принадлежит лету");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + ": Этот месяц принадлежит осени");
                default:
                    System.out.println("Такого месяца нет!!!");
            }

        }

    }
}