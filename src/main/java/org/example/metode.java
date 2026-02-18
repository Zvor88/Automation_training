package org.example;

public class metode {
   public static void Buna () {
       System.out.println("Buna!");
   }

  public static void sqr (double numar) {
       System.out.println(numar * numar);
   }

  public static void sum (int x, int y){
       System.out.println( x + y);
   }
  public static int  sum2 (int a, int b){
       return  a + b;
   }
   static int dublu (int x){
       return  x * 2;
   }

   static boolean numarPar(int y){
       if (y % 2 == 0) {
           return true;
       } else { return  false;}

   }
   static int sumaT(int n){
       int suma = 0;
       for (int i= 1; i <= n; i++){
           suma = suma + i;
       }
       return suma;
   }



   public static void  main() {
       Buna();

       sqr( 12.5 );

       sum(14, 15 );

       int suma = sum2(10, 15);
       System.out.println(suma);

     // int rezultat =   dublu( 12);
     boolean rezultat = numarPar( 12);
       System.out.println( rezultat);

       sumaT(5);
       System.out.println(sumaT(5));

   }
}
