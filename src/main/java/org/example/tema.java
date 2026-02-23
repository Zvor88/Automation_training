package org.example;

public class tema {


    public static void invat() {
        System.out.println("Invat Java");
    }

    public static int prod (int x, int y){
        return ( x * y);
    }

    public static int totpar (){
        int sumpar =0;
        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0){
                sumpar = sumpar + i;


            }
        }return (sumpar);
    }
    public static int med (int x, int y, int z){
        return ((x + y + z) / 3  );
    }
    public static void numartoare (int start, int end) {
        while (start <= end) {

            System.out.print(start + " ");
            start ++;}}


    static void main(String[] args) {

        invat();
        System.out.println("suma numerelor pare intr 1 si 50 este de: "+ totpar() );
        System.out.println("media aritmetica a tre cifre este: " + med(5, 5, 5));
        System.out.println("prdusul a doua numere este: " + prod(5,10));
        numartoare(1, 10 );


        String nume = "Gabriel ";
        String numeFamilie = " Bancila ";
        boolean este_prezent = true;
        double intaltime = 1.75;


        if (este_prezent == true) {
            System.out.println("Studentul" + numeFamilie + nume + "care are intaltimea de: " + intaltime + " este preezent la curs");
        } else {
            System.out.println("Absent! ");}

        double x = 5.2;
        double y = 2.5;
        double sum = x + y;
        double median = (x + y + sum) / 3;
            System.out.println("suma este: " + sum);
            System.out.println("media aritmetica este: " + median);

        int varsta = 37;

        if (varsta >= 18) {
        System.out.println("accesul este permis :) ");}
        else System.out.println("Esti minor !!!!" );

        int sum20 = 0;
        for (int i = 20; i <= 50; i++) {
            sum20 = sum20 + i;}
            System.out.println(sum20);

        int j = 10;
        while (j >= 0) {

            System.out.print(j + " ");
            j--;
        }

    }

}