package Atividade_6.Ex3;

public class Torneio {
    protected String nome;
    protected int idade;

    Torneio(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    String getNome(){
        return this.nome;
    }

    int getIdade(){
        return this.idade;
    }

    void setNome(String n){
        this.nome = n;
    }

    void setIdade(int i){
        this.idade = i;
    }

    String verificaCategoria(){
        if (this.idade < 5){
            return "Infantil";
        }
        else if (this.idade >= 5 && this.idade <= 7){
            return "Infantil";
        } 
        else if (this.idade >= 8 && this.idade <= 10){
            return "Juvenil";
        }
        else if (this.idade >= 11 && this.idade <= 15){
            return "Adolescente";
        }
        else if (this.idade >= 16 && this.idade <= 30){
            return "Adulto";
        } else {
            return "Sênior";
        }
    }

    void imprimeDados(){
        System.out.print("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCategoria: " + verificaCategoria() + "\n\n");
    }
}
