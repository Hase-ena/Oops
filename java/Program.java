import java.util.*;

class Multiplication extends Thread {
    public void run() {
        System.out.println("\n\nMULTIPLICATION TABLE OF 5\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}

class PrimeNum extends Thread {
    public void run() {
        int count = 0, i = 1, j, n, no = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n value for N :");
        n = sc.nextInt();
        System.out.println("Prime Numbers");
        while (no != n) {
            count = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                System.out.print(i + "   ");
                no++;
            }
            i++;
        }
    }
}

class Program {
    public static void main(String args[]) {
        Multiplication m = new Multiplication();
        m.start();
        PrimeNum p = new PrimeNum();
        p.start();
    }
}