

package br.com.estagioribeirao;




public class EstagioRibeirao {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Ao final do processamento, o valor da variável SOMA será: " + SOMA);
    }
    
}

