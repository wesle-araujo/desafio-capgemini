package dominio.questoes.questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeDegraus = scanner.nextInt();

        String degrau = "*";
        String espaco = " ";

        for (int i = 1; i <= quantidadeDeDegraus ; i++) {
            System.out.println(espaco.repeat(quantidadeDeDegraus-i)+degrau.repeat(i));
        }
    }
}
