//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int m = 15000;
        int total = 0;
        int v = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + m;
            v = v + 1;
            System.out.println("Месяц" + " " + v + "=" + total);
        }
        {
            System.out.println("Задача 2");
        }
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        {
            System.out.println();
        }
        for (start = 10; start > 0; start--) {
            System.out.print(start + " ");
        }
        {
            System.out.println("Задача 3");
        }
        int born = 17;
        int death = 8;
        int y = 12000000;
        int dif = born - death;
        int year = 0;
        while (year < 10) {
            y = y + y / 1000 * dif;
            year = year + 1;
            {
                System.out.println("Год" + " " + year + " " + "численость населения составляет" + " " + y);
            }
            {
                System.out.println("Задача 4");
            }
            int s = 15000;
            int t = 0;
            int r = 0;
            while (t < 12_000_000) {
                t = t + t / 100 * 7;
                t = t + s;
                r = r + 1;
                {
                    System.out.println("Месяц" + " " + r + "=" + t);
                }
            }
            {
                System.out.println("Задача 5");
            }
            int u=0;
            for (r = 1; r <= 60; r++) {
                u = u + u / 100 * 7;
                u = u + s;
                if (r % 6 == 0) {
                    System.out.println("Месяц" + " " + r + "=" + u);
                }
            }
        }
    }
}



