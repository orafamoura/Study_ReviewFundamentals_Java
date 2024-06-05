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

    public static void tiposString(String[] args) {
        System.out.println("Ola mundo".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!"); // Mesmo resultado que o concat
        System.out.println(s.startsWith("Boa")); // True
        System.out.println(s.startsWith("boa")); //False
        System.out.println(s.toLowerCase().startsWith("boa")); //True
        System.out.println(s.equals("boa tarde")); //False
        System.out.println(s.equalsIgnoreCase("boa tarde"));//True

        var nome = "rafa";
        var idade = 25;
        System.out.println("Nome: " + nome +  "\nidade: " + idade); //Muito grande
        System.out.printf("Nome: %s %d", nome, idade); //Melhor forma
        // %s para strings
        // %d para inteiros
        // %f para compostos

    }
}
