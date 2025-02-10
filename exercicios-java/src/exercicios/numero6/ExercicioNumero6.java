package exercicios.numero6;

import java.util.Scanner;

public class ExercicioNumero6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double value = sc.nextDouble();
        double percentage = value * 0.05;
        double finalResult = value + percentage;
        System.out.printf("O valor com acréscimo de 5%% é %.2f%n", finalResult);
        
        sc.close();
    }

}
