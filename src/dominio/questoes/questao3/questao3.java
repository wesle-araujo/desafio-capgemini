package dominio.questoes.questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder palavra = new StringBuilder(scanner.nextLine());

        List<String> anagramas = new ArrayList<>();
        int contadorDosParesDeAnagrama = 0;
        int count=0;

        while(palavra.length()>0){
            char p = palavra.charAt(0);
            for(int i = 1;i<palavra.length();i++){
                if(p==palavra.charAt(i)){
                    anagramas.add(palavra.substring(0,i+1));
                    palavra.delete(0,i);
                    count++;
                }
            }
            if(count==0) palavra.deleteCharAt(0);
            else
                count = 0;
        }

        for (String substring:anagramas) {
            if(substring.length()>2)
                contadorDosParesDeAnagrama+=2;
            else
                contadorDosParesDeAnagrama++;
        }
        System.out.println(contadorDosParesDeAnagrama);


}
}
