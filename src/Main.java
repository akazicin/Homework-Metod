import java.time.LocalDate;

import static java.time.LocalDate.*;

public class Main {
    public static void main(String[] args) {
        /// task1
        int year = 2014;
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        /// task2

        printVersion( 1, 2024);

        ///task3

        int distance = 105;
        int delevryDays =  calculateDeliveryDate(distance);
        if (delevryDays >= 0) {
            System.out.println(" Доставка займет " + delevryDays);

        } else {
            System.out.println( " Доставки нет ");
        }

    }

    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    static void printVersion(int os, int releaseYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (releaseYear < currentYear) {
                System.out.println(" Скачайте облегченную версию для IOS");
            } else {
                System.out.println(" Скачайте версию для IOS");
            }
        } else if (os == 1) {
            if (releaseYear < currentYear) {
                System.out.println("Скачайте облегченную версию для Android");
            } else { System.out.println("Скачайте версию для Android");
        }
        } else {
            System.out.println(" Устройство не поддерживается");
        }
    }

    static int calculateDeliveryDate (int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60){
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }

    }

}