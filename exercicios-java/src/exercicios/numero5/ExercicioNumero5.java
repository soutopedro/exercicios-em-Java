package exercicios.numero5;

import java.util.Scanner;

public class ExercicioNumero5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1293.20;
        System.out.print("Digite seu salário: ");
        double salarioUsuario = sc.nextDouble();
        double resultado = salarioUsuario / salarioMinimo;
        System.out.printf("O usuario recebe %.2fx o salário mínimo", resultado);

        sc.close();
    }
}
