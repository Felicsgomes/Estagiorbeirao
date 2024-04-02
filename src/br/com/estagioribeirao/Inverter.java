package br.com.estagioribeirao;

public class Inverter {
	public static void main(String[] args) {
        String original = "Estagio";
        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String s) {
        String resultado = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            resultado += s.charAt(i);
        }
        return resultado;
    }
}
