package org.example;

public class array {


public static void main(){
     int[] note = {3, 7 ,6, 8, 9, 6};
    {
        for (int i = 0; i < note.length; i++) {
            System.out.print (note[i] + " ");
        }
    int suma = 0;
        for (int i = 0; i <= note.length -1; i++){
            suma = suma + note[i];
    }
        System.out.println(" suma noteor este:" + suma);
    }
    int valmax = note[0];
    for(int i=0; i < note.length; i++){
        if (note[i] > valmax){
            valmax = note[i];
        }
        }
    System.out.println(valmax);

    int count = 0;
    for( int i= 0; i < note.length; i++){
        if (note[i] % 2 == 0){
            count ++;
        }
        System.out.println(count);
    }
}


}
