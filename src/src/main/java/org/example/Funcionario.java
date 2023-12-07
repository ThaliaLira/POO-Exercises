package org.example;

public class Funcionario {

    public static String nome;
    public static double salarioBruto;
    public static double imposto;

    public static char opcao = 'S';
    public static char repeticao = 'S';

    public static double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public static Object aumentarSalario(double porcentagem) {
        return salarioBruto += salarioBruto * porcentagem / 100.0;

    }

    public String toString() {
        return nome + " , R$ " + String.format("%.2f", aumentarSalario(0));
    }

}