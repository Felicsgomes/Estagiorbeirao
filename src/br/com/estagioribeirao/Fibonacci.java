package br.com.estagioribeirao;

import java.util.Scanner;

//QUESTAO 2
public class Fibonacci {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

	/**
	 * 
	 * @param numero
	 * @return
	 */
    public static boolean pertenceAFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        while (b < numero) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return b == numero;
    }
	
}
