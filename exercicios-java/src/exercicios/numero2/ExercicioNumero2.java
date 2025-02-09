package exercicios.numero2;

import java.util.Scanner;

public class ExercicioNumero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0 && numero >= 0)
            System.out.println("O número digitado é par e também positivo");
        else if(numero % 2 == 0 && numero < 0 )
            System.out.println("O número digitado é par e negativo");
        else if(numero % 2 != 0 && numero >= 0)
            System.out.println("O número digitado é impar e positivo");
        else
            System.out.println("O número digitado é impar e também negativo");
    }
}
