package questoes.questao2;

public class Questao2 {
    private final String senha;

    public Questao2(String senha) {
        this.senha = senha;
    }


    private int validaLetraMaiuscula(){
        if(this.senha.matches("(.*[A-Z].*)")) return 0;
        else return 1;
    }
    private int validaLetraMinuscula(){
        if(this.senha.matches("(.*[a-z].*)")) return 0;
        else return 1;
    }
    private int validaCaractereEspecial(){
        if(this.senha.matches("(.*[!@#$%^&*()-+].*)")) return 0;
        else return 1;

    }
    private int validaDigito(){
        if(this.senha.matches("(.*[1-9].*)")) return 0;
        else return 1;


    }

public int validaSenha(){
    int scoreSenha = validaDigito() + validaLetraMaiuscula()+ validaLetraMinuscula() + validaCaractereEspecial();
    int scoreValidacao = this.senha.length() + scoreSenha;
    if(scoreValidacao>=6){
        return scoreSenha;
    }else{
        int subs = 6 -this.senha.length();
        return Math.max(scoreSenha, subs);
    }
}
}
