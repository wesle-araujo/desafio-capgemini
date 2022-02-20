package dominio.questoes.questao2;

public class validators {
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
        return scoreSenha;
    }else{
        int subs = 6 -senha.length();
        return Math.max(scoreSenha, subs);
    }
}
}
