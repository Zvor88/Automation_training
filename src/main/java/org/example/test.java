package org.example;

public class test {
    static void main(String[] args) {
        System.out.println(15 * 9);
        // == compartatie
        // = asignare
        // || or/sau
        // &&  si

        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        int j = 1;
        int sum2 = 0;
        while (j <= 5) {
            sum2 = (sum2 + j);
            j++;
            System.out.println(sum2);
        }


    }
}
