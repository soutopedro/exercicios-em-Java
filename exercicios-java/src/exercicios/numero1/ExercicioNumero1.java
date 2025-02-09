package exercicios.numero1;

import java.util.Scanner;

public class ExercicioNumero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int soma = a + b;
        if(soma > c)
            System.out.println("A soma do primeiro e do segundo número é maior que o terceiro");
        else
            System.out.println("A soma do primeiro e do segundo número NÃO é maior que o terceiro");

        sc.close();
    }


}
