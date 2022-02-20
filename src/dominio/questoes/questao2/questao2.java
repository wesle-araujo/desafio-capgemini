package dominio.questoes.questao2;


import java.util.Scanner;


public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();
        validators validar = new validators();

        System.out.println(validar.validaSenha(senha));

    }

}
