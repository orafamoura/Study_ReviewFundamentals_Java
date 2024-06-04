import java.util.Locale;
import java.util.Scanner;

public class revisaoJava {
    public static void main(String[] args) {
        /**
         javaDoc para documentacao
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor fahrenheit: ");

        //Const sempre LETRA MAIUSCULA
        final double FATOR = 32;
        final double FATOR2 = 5.0 / 9.0;

        double f = sc.nextDouble();
        double celsius = (f - FATOR) * FATOR2;

        System.out.println(celsius);
        sc.close();


    }
}
