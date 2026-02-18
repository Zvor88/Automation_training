package org.example;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        String nume = "Gabriel";
        int varsta = 37;
        String numeFamilie = "Bancila";
        int nrMembriFam = 1;
        boolean areAnimale = true;
        int nrAnimale = 1;
        boolean esteSingurLaParinti = false;

        System.out.println(nume + " " + numeFamilie);

        if (areAnimale == true) {
            nrMembriFam = 2;
            System.out.println(nrMembriFam + " " + numeFamilie + " " + nume);
        } else {System.out.println("Nu are animale de companie");}

        if (varsta > 5) {
            System.out.println(nume + " " + numeFamilie + " " + varsta);
        }

        System.out.println(varsta + 5);

        int a = 10;
        int b = 11;

        if (b % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        if (a > b ) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        if (b >= 11 && b < 16) {
            System.out.println(b);
        }

        int nota = 4;
        if (nota >= 5) {
            System.out.println("Admis");
        } else{
            System.out.println("Respins");
        }

        double produs1 = 120;
        if (produs1 > 100) {
            double disc10 = produs1 * 0.10;
            double discuountedP = produs1 - disc10;
            System.out.println( discuountedP );
        }







    }
}

