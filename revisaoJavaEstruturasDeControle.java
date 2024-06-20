
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
}