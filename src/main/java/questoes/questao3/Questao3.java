package questoes.questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {
    private StringBuilder palavra = new StringBuilder();

    public Questao3(StringBuilder palavra) {
        this.palavra = palavra;
    }


    public int verificaSeExisteAnagramas() {
        List<String> anagramas = new ArrayList<>();
        int contadorDosParesDeAnagrama = 0;
        int count = 0;

        while (this.palavra.length() > 0) {
            char p = this.palavra.charAt(0);
            for (int i = 1; i < this.palavra.length(); i++) {
                if (p == this.palavra.charAt(i)) {
                    anagramas.add(this.palavra.substring(0, i + 1));
                    this.palavra.delete(0, i);
                    count++;
                }
            }
            if (count == 0) this.palavra.deleteCharAt(0);
            else
                count = 0;
        }

        for (String substring : anagramas) {
            if (substring.length() > 2)
                contadorDosParesDeAnagrama += 2;
            else
                contadorDosParesDeAnagrama++;
        }
        return contadorDosParesDeAnagrama;


    }
}
