
import java.util.Scanner;

public class revisaoJavaEstruturasDeControle {

    public static void verificacaoNumeroEParidade(String[] args) {

//        for (int x = 10; x >= 0; x -= 2) {
//            System.out.println(x);
//        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 100");
        int n1 = sc.nextInt();

        if(n1 < 0 || n1 > 100){
            System.out.println("entre com um numero valido");
        } else {
            String numberPlace = n1 <= 10 ? "Esta entre os 10" : "Nao esta entre os 10";
            String parityMessage = n1 % 2 == 0? " PAR" : " IMPAR";
            System.out.println(numberPlace + parityMessage);
        }
        sc.close();
    }

    public static void anoBissexto(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Em que ano estamos: ");
        int anoAtual = sc.nextInt();

        boolean result = (anoAtual % 4 == 0 && (anoAtual % 100 != 0 || anoAtual % 400 == 0));

        if(result){
            System.out.println("ano bissexto");
        } else {
            System.out.println("nao e bissexto");
        }
        sc.close();
    }

    public static void mediaEscolar(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.println("Segunda nota: ");
        double n2 = sc.nextDouble();

        double mediaFinal = (n1 + n2) / 2;

        if(mediaFinal >= 7.0){
            System.out.println("Aprovado");
        } else if(mediaFinal < 7.0 && mediaFinal >= 4.0){
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }

}