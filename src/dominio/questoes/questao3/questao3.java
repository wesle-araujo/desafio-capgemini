package dominio.questoes.questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder palavra = new StringBuilder(scanner.nextLine());

        String subtring = "";
        List<String> anagramas = new ArrayList<>();
        int contadorDosParesDeAnagrama = 0;
        int count=0;
        int count2=0;
        while(palavra.length()>0){
            System.out.println("Entrou no while: "+(count2++)+" o tamanho da palavra é: "+palavra.length());
            char p = palavra.charAt(0);
            for(int i = 1;i<palavra.length();i++){
                System.out.println("Entrou no for"+"valor do i: "+i);
                if(p==palavra.charAt(i)){
                    //contadorDosParesDeAnagrama++;
                    System.out.println("Entrou no if");
                    anagramas.add(palavra.substring(0,i+1));
                    palavra.delete(0,i);
                    System.out.println("A palavra ficou: "+palavra);
                    //palavra.replace(0,i-1, String.valueOf(palavra.charAt(i)));
                    count++;
                }
            }
            if(count==0) palavra.deleteCharAt(0);
            else
                count = 0;
            System.out.println("p tamanho"+palavra.length());
        }
        System.out.println();

        for (String substring:anagramas) {
            System.out.println("A posição do anagrama: "+anagramas.indexOf(substring) + " A subtring é: "+substring+" tamanho de substring"+substring.length());
            if(substring.length()>2)
                contadorDosParesDeAnagrama+=2;
            else
                contadorDosParesDeAnagrama++;
        }
        System.out.println("A quantidade de pares de anagramas são: "+contadorDosParesDeAnagrama);


}
}
