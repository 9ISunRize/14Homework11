import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        temaStroki();
        task1A();
        task1B();
        task2();
        task3();
    }

    public static void printSeparator() {
        System.out.println("====================");
    }

    public static void printIssues(int issueCount) {
// Создаем отдельный метод для печати дефектов
        System.out.println(issueCount);
        // Печатаем значение переменной
    }

    // Объявляем метод
    public static int sum(int[] numbers) {
// Создаем метод и объявляем массив
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        // Считаем сумму элементов массива с помощью цикла
        return sum;
        // Возвращаем значение суммы в метод ma
    }

    public static void temaStroki() {
        System.out.println("Пример");
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6};
        printSeparator();
        // Вызываем объявленный ранее метод
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            // Передаем параметр в метод printIssues
            if ((i + 1) % 3 == 0) {
                printSeparator();
                // Вызываем объявленный ранее метод
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        // Передаем значение внутри метода sum()
        printIssues(total);
        // Печатаем значение переменной total
        // Вызываем объявленный ранее метод
    }

    public static int countsLeapEear(int comeYear) {
        for (int year = 1823; year <= 2123; year++) {
            if (year % comeYear == 0) {
                System.out.println(year);
            }
        }
        return comeYear;
    }

    public static void checkLeapYear(int yearNum) {

        if (yearNum % 4 == 0 && (yearNum % 100 != 0 || yearNum % 400 == 0)) {
            System.out.println(yearNum + " год является високосным");
        } else {
            System.out.println(yearNum + " год не является високосным");
        }
    }

    public static void checkSoftwareVersion(int yearOSChecking, int clientOSSChecking) {
        if (clientOSSChecking == 0) {
            if (yearOSChecking > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (yearOSChecking <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOSSChecking == 1) {
            if (yearOSChecking >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (yearOSChecking <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }


    public static int calculationDeliveryTime(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);

        } else if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
        return deliveryDay;
    }


    public static void task1A() {
        System.out.println("Задача 1A");
        int comeTrajectory = 79;
        int totalDecision = countsLeapEear(comeTrajectory);

    }

    public static void task1B() {
        System.out.println("Задача 1B");
        int year = 1700;
        checkLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOSS = 1;
        int currentYear = LocalDate.now().getYear();
        checkSoftwareVersion(currentYear, clientOSS);
    }

    public static void task3() {
        System.out.println("Задача 2");
        int deliveryDistance = 101;
        int totalTime = calculationDeliveryTime(deliveryDistance);
    }
}