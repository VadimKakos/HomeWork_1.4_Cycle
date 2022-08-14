public class Main {
    public static void main(String[] args) {

        // первое задание

        int a = 1;

        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }

        a = 10;
        System.out.println();

        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }

        // второе задание

        System.out.println();

        int dayOfTheMonth = 2;
        while (dayOfTheMonth <= 31) {
            System.out.println("Сегодня пятница, " + dayOfTheMonth + "-e число. Необходимо подготовить отчёт");
            dayOfTheMonth += 7;
        }

        // третье задание

        int currentYear = 2022;
        int initalPeriod = currentYear - 200;
        int finitePeriod = initalPeriod + 300;

        for (int i = 0; i <= finitePeriod; i += 79) {
            if (initalPeriod < i && i < currentYear) {
                System.out.println(i);
            }
            if (currentYear < i && i < finitePeriod) {
                System.out.println(i);
            }

        }
    }
}