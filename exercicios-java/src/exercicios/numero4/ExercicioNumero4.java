package exercicios.numero4;

import java.util.Scanner;

public class ExercicioNumero4 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("O número antes de " + numero + " é "
        + (numero - 1));
        System.out.println("O número depois de " + numero + " é " + (numero + 1));

        sc.close();
    }
}
