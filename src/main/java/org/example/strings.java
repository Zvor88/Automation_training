package org.example;

import javax.crypto.spec.PSource;

public class strings {

    public static void main() {

        String text = "mihaela are 2 pere frumoase";

        System.out.println("nr char " + text.length());

        String cuvant = "Miri";
        System.out.println("prima litera: " + cuvant.charAt(0));
        System.out.println("ultima litera: " + cuvant.charAt(cuvant.length() -1));
        String text1 = "Miri";
        String text2 = "Miricioaica";

        Boolean eq = text2.equals(text1);
        System.out.println("texte sunt la fel: " + eq);

        text.contains("pere");

        System.out.println("are Mihaela pere? " + text.contains("pere"));

        String faraSpatii = text.replace("frumoase", "zemoase" );
        System.out.println (faraSpatii);
    }

}
