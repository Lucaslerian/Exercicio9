import java.util.Scanner;

public class App {
    public static void main (String [] args) {
        // Faça um programa que peça a temperatura em graus fahrenheit
        // Transforme e mostre a temperatura em graus celsius. C = 5 * ((F-32)/9)
        double temperaturaF;
        double temperaturaC;

        System.out.println("Programa de temperatura, bem-vindo!");
        //Digitar a temperatura em fahrenheit
        System.out.print("Digite a temperatura ");
        Scanner sc = new Scanner(System.in);
       
        temperaturaF = sc.nextDouble();
       
        sc.close();
        //Transformar F em Celsius
        temperaturaC = 5 * ((temperaturaF - 32)/9);
        // mostrar a temperatura em graus Celsius
        System.out.print("A temperatura em Celsius é: ");
        System.out.print(temperaturaC);
    }
}
