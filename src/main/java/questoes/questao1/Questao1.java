package questoes.questao1;

import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Questao1 {
    private final int quantidadeDeDegraus;

    public Questao1(int quantidadeDeDegraus) {
        this.quantidadeDeDegraus = quantidadeDeDegraus;
    }

    public void preencheDegraus(){
            for (int i = 1; i <= this.quantidadeDeDegraus ; i++) {
                String espaco = " ";
                String degrau = "*";
                System.out.println(espaco.repeat(this.quantidadeDeDegraus-i)+ degrau.repeat(i));
            }

    }

    }

