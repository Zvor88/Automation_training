package org.example;

public class metode2 {
    public static void inmultire (int n ) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 7);
        }
    }
    public static void multiplu (int nr){
            for (int i = 100; i<= 1000; i++){
                if (i % nr == 0){
                    System.out.println(i);
                    break;
                }
            }
    }
    public static String numeVarsta (String nume, int varsta){
        return  nume + " are " + varsta + " de ani";
    }

    public static void factorial(int f) {
        int fact = 1;
        for (int i = 1; i <= f; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    static void triunghi (int n) {
        for (int i = 1; i<= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main() {
    inmultire(7);
    multiplu (7);

    triunghi(7);
    String nume = "Simona";
    int varsta = 26;
        System.out.println(numeVarsta(nume, varsta));

        factorial(9);
        System.out.println();

    }
}
