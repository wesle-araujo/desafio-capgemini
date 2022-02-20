import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import questoes.questao3.Questao3;

import java.util.Scanner;

public class Questao3Teste {
    @Test
    public void palavraTemAnagramas_RetornaAQuantidadeDeAnagramasPares(){
        Questao3 questao3 = new Questao3(new StringBuilder("ifailuhkqq"));
        int quantidadeDeAnagramas = questao3.verificaSeExisteAnagramas();
        Assertions.assertEquals(3,quantidadeDeAnagramas);
    }
    @Test
    public void palavraNaoTemAnagramas_RetornaZero(){
        Questao3 questao3 = new Questao3(new StringBuilder("abcdw"));
        int quantidadeDeAnagramas = questao3.verificaSeExisteAnagramas();
        Assertions.assertEquals(0,quantidadeDeAnagramas);
    }
}