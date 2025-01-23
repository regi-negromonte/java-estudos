import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ClassificacaoIMC classificacao = new ClassificacaoIMC();

        boolean condicao = true;
        while (condicao) {
            System.out.println("*** CALCULADORA DE IMC ***");
            System.out.print("Digite seu peso (Kg): ");
            double peso = sc.nextDouble();
            System.out.print("Digite sua altura (m): ");
            double altura = sc.nextDouble();
            System.out.print("Digite sua idade (anos): ");
            int idade = sc.nextInt();

            double imc;
            if (peso <= 0 || altura <= 0 || idade <= 0) {
                System.out.println("\nValores inválidos! Peso, altura e idade devem ser maiores que zero.\n");
                continue;
            } else {
                imc = peso / (altura * altura);
            }

            System.out.print("Digite seu sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            ClassificacaoIMC pessoa = new ClassificacaoIMC(imc, sexo, idade);

            System.out.printf("Índice de massa corporal = %.2f\n", imc);
            System.out.printf("Classificação: %s\n", pessoa.getClassificacao());

            System.out.print("Repetir (s/n): ");
            char resposta = Character.toLowerCase(sc.next().charAt(0));
            if (resposta == 'n') {
                condicao = false;
            }
        }
        sc.close();
    }
}