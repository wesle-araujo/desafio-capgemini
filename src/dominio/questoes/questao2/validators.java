package dominio.questoes.questao2;

public class validators {
   /* public int validarTamanho(String senha) {
        if (senha.length() <= 6) {
            return senha.length() - 6;

    }else{
        return senha.length();
    }

}*/


    /*public int faltaLetra(String senha){
        int vf = adiciona(validarLetraMaiuscula(senha));
        vf+= adiciona(validarDigito(senha)) +adiciona(validarLetraMinuscula(senha)) + adiciona(validarCaractereEspecial(senha));
        int falta = (senha.length() + vf)

    }*/
    /*private int adiciona(boolean valido){
         if(valido){
           return  0;
        }
        else
            return 1;
    }*/
    private int validaLetraMaiuscula(String senha){
        if(senha.matches("(.*[A-Z].*)")) return 0;
        else return 1;
    }
    private int validaLetraMinuscula(String senha){
        if(senha.matches("(.*[a-z].*)")) return 0;
        else return 1;
    }
    private int validaCaractereEspecial(String senha){
        if(senha.matches("(.*[!@#$%^&*()-+].*)")) return 0;
        else return 1;

    }
    private int validaDigito(String senha){
        if(senha.matches("(.*[1-9].*)")) return 0;
        else return 1;


    }

public int validaSenha(String senha){
    int scoreSenha = validaDigito(senha) + validaLetraMaiuscula(senha)+ validaLetraMinuscula(senha) + validaCaractereEspecial(senha);
    int scoreValidacao = senha.length() + scoreSenha;
    if(scoreValidacao>=6){
        System.out.println("Score senha"+scoreSenha);
        return scoreSenha;
    }else{
        int subs = 6 -senha.length();
        return Math.max(scoreSenha, subs);
    }
}
}
