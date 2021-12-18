package br.com.exercicio;

import java.util.Scanner;

//CRIANDO UM PROGRAMA QUE PEDE N NÚMEROS INTEIROS.
//CALCULA E MOSTRA A QUANTIDADE DE NÚMEROS PARES E ÍMPARES.


public class ParesImpares {
    public static void main(String[] args) {
        Scanner scan_num = new Scanner(System.in);

        int qtd_num, num;
        int i = 1, count = 0;
        int qtd_par = 0, qtd_impar = 0;

        System.out.println("Digite quantos números você deseja: ");
        qtd_num = scan_num.nextInt();

        do {
            System.out.println("Digite o " + i + "° número: ");
            num = scan_num.nextInt();
            count++;
            i++;
            if(num % 2 == 0) qtd_par++;
            else qtd_impar++;
        }while(count < qtd_num);
        System.out.println("\nNúmeros pares: " + qtd_par);
        System.out.println("Números ímpares: " + qtd_impar);
    }
}
