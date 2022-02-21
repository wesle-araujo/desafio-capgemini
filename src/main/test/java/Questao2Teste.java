import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import questoes.questao2.Questao2;

import java.util.Scanner;

public class Questao2Teste {

    @Test
    public void SenhaAtendeTodosOsRequisitos_RetornaZero(){
        Questao2 questao2 = new Questao2("1Ab$gf");
        int validaSenha = questao2.validaSenha();
        Assertions.assertEquals(0,validaSenha);

    }

    @Test
    public void senhaComTamanhoMenorQue6Digitos_RetornaCaracteresFaltantes(){
        Questao2 questao2 = new Questao2("Ya3");
        int validaSenha = questao2.validaSenha();
        Assertions.assertNotEquals(0,validaSenha);

    }

    @Test
    public void senhaSemCaractereEspecial_RetornaUm(){
        Questao2 questao2 = new Questao2("1aaBla");
        int validaSenha = questao2.validaSenha();
        Assertions.assertEquals(1,validaSenha);

    }
    @Test
    public void senhaSemDigitoEspecial_RetornaUm(){
        Questao2 questao2 = new Questao2("aaBB&&");
        int validaSenha = questao2.validaSenha();
        Assertions.assertEquals(1,validaSenha);

    }
    @Test
    public void senhaLetraMinusculaEspecial_RetornaUm(){
        Questao2 questao2 = new Questao2("AABB&&");
        int validaSenha = questao2.validaSenha();
        Assertions.assertEquals(1,validaSenha);

    }
    @Test
    public void senhaSemLetraMaiusculaEspecial_RetornaUm(){
        Questao2 questao2 = new Questao2("aabb&&");
        int validaSenha = questao2.validaSenha();
        Assertions.assertEquals(1,validaSenha);

    }
}
