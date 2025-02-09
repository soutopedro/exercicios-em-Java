package exercicios.numero3;

import java.util.Scanner;

public class ExercicioNumero3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = (a == b ? a + b : a * b);

        System.out.println("O valor é " + c);



        sc.close();
    }



}
