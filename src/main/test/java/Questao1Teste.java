import questoes.questao1.Questao1;

import java.util.Scanner;

public class Questao1Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeDegraus = scanner.nextInt();

        Questao1 questao1 = new Questao1(quantidadeDeDegraus);
        questao1.preencheDegraus();



    }
}
