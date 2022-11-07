public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.1");

        double result = 2459000;
        double summ = 0;
        int monthCount = 0;

        while (summ <= result) {

            summ += 15000 + (summ * 0.01);
            monthCount++;

            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + String.format("%.2f", summ) + " рублей");

        }

        System.out.println();
        System.out.println("Задание 1.2");

        int i = 0;

        while (i < 10) {

            i++;
            System.out.print(i);
            System.out.print(" ");

        }

        System.out.println();

        for (; i > 0; i--) {

            System.out.print(i);
            System.out.print(" ");

        }

        System.out.println();
        System.out.println("Задание 1.3");

        int populationOfY = 12000000;

        for (int j = 1; j <= 10; j++) {

            populationOfY += (populationOfY / 1000) * (17 - 8);

            System.out.println("Год " +  j + ", численность населения составляет "  + populationOfY);

        }

        System.out.println();
        System.out.println("Задание 2.1");

        double summTotal = 15000;
        monthCount = 0;

        while (summTotal <= 12000000) {

            monthCount++;
            summTotal += summTotal * 0.07;
            System.out.println("Месяцев " + monthCount + " сумма " + String.format("%.2f", summTotal));

        }

        System.out.println();
        System.out.println("Задание 2.2");

        monthCount = 0;
        summTotal = 15000;

        while (summTotal <= 12000000) {

            monthCount++;
            summTotal += summTotal * 0.07;

            if (monthCount % 6 == 0) {
                System.out.println("Месяцев " + monthCount + " сумма " + String.format("%.2f", summTotal));
            }
        }

        System.out.println();
        System.out.println("Задание 2.3");

        int months = 0;
        int years = 9;

        while (months != (12 * years)) {

            months++;
            summTotal += summTotal * 0.07;

            if (months % 6 == 0) {
                System.out.println("Месяцев " + months + " сумма " + String.format("%.2f", summTotal));
            }
        }

        System.out.println();
        System.out.println("Задание 2.4");

        int dayFriday = 4;

        for (i = 1; i <= 31; i++) {
            if (i ==  dayFriday) {
                System.out.println("Сегодня пятница, "  + dayFriday + "-е число. Необходимо подготовить отчет.");
                dayFriday += 7;
            }
        }

        System.out.println();
        System.out.println("Задание 3.1");

        int thisYear = 2022;
        int yearMinus200  = thisYear - 200;
        int yearPlus100 = thisYear + 100;

        for (i = 0; i <= yearPlus100; i++) {
            if (i % 79 == 0 && i >= yearMinus200) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Задание 3.2");

        for (i = 1; i <= 10; i++) {

            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}