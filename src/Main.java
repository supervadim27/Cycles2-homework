// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание №1");
        task1();
        System.out.println();
        System.out.println("Задание №2");
        task2();
        System.out.println();
        System.out.println();
        System.out.println("Задание №3");
        task3();
        System.out.println();
        System.out.println("Задание №4");
        task4();
        System.out.println();
        System.out.println("Задание №5");
        task5();
        System.out.println();
        System.out.println("Задание №6");
        task6();
        System.out.println();
        System.out.println("Задание №7");
        task7();
        System.out.println();
        System.out.println("Задание №8");
        task8();
    }
    public static void task1() {
        double deposit = 0;
        double cashPerMonth = 15_000;
        int months = 0;
        while (deposit < 2_459_000) {
            months++;
            deposit = (deposit*1.01) + (cashPerMonth*1.01);
            System.out.println("Месяц " + months + ", сумма накоплений равна "+deposit+" рублей" );
        }
        System.out.println("Для накопления суммы " + deposit + " рублей понадобилось " + months + " месяцев");
    }
    public static void task2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" "+i);
        }
        System.out.println();
        for (int m = 10; m > 0; m--) {
            System.out.print(" "+m);
        }
    }

    public static void task3() {
        int people = 12_000_000;
        for (int year =1; year < 11; year++) {
            int birthPerYear = people / 1000 * 17;
            int deathPerYear = people / 1000 * 8;
            people = people + birthPerYear - deathPerYear;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }
    }
    public static void task4() {
        double growPerMonth = 0.07;
        int month = 0;
        double deposit = 15000 + (15000 * growPerMonth);
        for (double startDeposit = 15000; deposit < 12000000; deposit = deposit + deposit * growPerMonth) {
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений составила " + deposit + " рублей");
        }
    }
    public static void task5() {
        int month = 0;
        double growPerMonth = 0.07;
        double deposit = 15000 + (15000 * growPerMonth);
        for (double startDeposit = 15000; deposit < 12000000; deposit = deposit + deposit * growPerMonth) {
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц "+month+", сумма накоплений составила "+deposit+" рублей");
            }
        }
    }
    public static void task6() {
        int month = 0;
        int allTime = month + 12 * 9;
        double growPerMonth = 0.07;
        double deposit = 15000 + (15000 * growPerMonth);
        for (double startDeposit = 15000; month < allTime; deposit = deposit + deposit * growPerMonth) {
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц "+month+", сумма накоплений составила "+deposit+" рублей");
            }
        }
    }
    public static void task7() {
        int day = 5;
        do {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        } while (day < 31);
    }
    public static void task8() {
        int thisYear = 2023;
        int year200Late = 200;
        int year100Future = 100;
        int yearOfComet = 79;
        for (int startYear = 0; startYear < thisYear + year100Future; startYear = startYear + yearOfComet) {
            if (startYear >= thisYear - year200Late && startYear <= thisYear + year100Future) {
                System.out.println(startYear);
            }
        }
    }
}