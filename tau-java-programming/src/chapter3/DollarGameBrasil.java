package chapter3;
// Reference solution from Angie Jones @ TestAutomationU: https://github.com/angiejones/java-programming/blob/master/exercises/chapter3/ChangeForADollarGame.java
import java.util.Scanner;

public class DollarGameBrasil {

    public static void main(String[] args){

        double umCentavo = .01;
        double cincoCentavos = .05;
        double dezCentavos = .10;
        double vinteECincoCentavos = .25;
        int real = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao 'Troco para um Real'! " +
                "Seu objetivo é inserir troco suficiente para contar exatamente R$1,00");

        System.out.println("Digite o número de moedas de um centavos:");
        int moedasDeUmCentavos = scanner.nextInt();

        System.out.println("Digite o número de moedas de cinco centavos:");
        int moedasDeCincoCentavos = scanner.nextInt();

        System.out.println("Digite o número de moedas de dez centavos:");
        int moedasDeDezCentavos = scanner.nextInt();

        System.out.println("Digite o número de moedas de vinte e cinco centavos:");
        int moedasDeVinteECincoCentavos = scanner.nextInt();

        scanner.close();

        double total = moedasDeUmCentavos * umCentavo +moedasDeCincoCentavos * cincoCentavos + moedasDeDezCentavos * dezCentavos + moedasDeVinteECincoCentavos * vinteECincoCentavos;

        if(total < real){
            double troco = real - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Opa, não deu! Faltou R$ " + String.format("%.2f", troco) + " de troco.");
        }
        else if(total > real){
            double sobra = total - real;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Opa, não deu! Sobrou R$ " + String.format("%.2f", sobra) + ".");
        }
        else{
            System.out.println("Ae! Exatamente R$ 1,00! Você ganhou!");
        }
    }
}