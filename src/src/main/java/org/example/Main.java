package org.example;
import java.util.Scanner;
import org.example.Funcionario;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            Funcionario colab = new Funcionario();

            System.out.println("Digite o nome do funcionário: ");
            Funcionario.nome = sc.nextLine();

            System.out.println("Digite o valor do salário bruto: ");
            Funcionario.salarioBruto = sc.nextDouble();

            System.out.println("Digite o valor do imposto: ");
            Funcionario.imposto = sc.nextDouble();

            System.out.println("Funcionário: " + Funcionario.nome + " , R$ " + Funcionario.salarioLiquido());

            System.out.println("Deseja aumentar o salário do funcionário? Digite 's' para sim e 'n' para não");
            Funcionario.opcao = sc.next().charAt(0);
            if (Funcionario.opcao == 'S' || Funcionario.opcao == 's') {
                System.out.println("Em quantos % deseja aumentar o salário?");
                double porcentagem = sc.nextDouble();
                Funcionario.aumentarSalario(porcentagem);
                Funcionario.aumentarSalario(porcentagem);
                System.out.println("Dados atualizados: " + colab);

            } else {
                System.out.println("Fim da jornada");
            }

            System.out.println("Deseja realizar uma nova verificação? Digite 's' para sim ou 'n' para não");
            Funcionario.repeticao = sc.next().charAt(0);

        } while (Funcionario.repeticao == 'S' || Funcionario.repeticao == 's');

        System.out.println("Fim da jornada");
        sc.close();
    }
}
