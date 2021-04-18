package Atividade_6.Ex3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Torneio t1 = new Torneio("João Paulo", 12);

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do atleta: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        Torneio t2 = new Torneio(nome, idade);

        System.out.print("\nInformações dos atletas:\n");
        t1.imprimeDados();
        t2.imprimeDados();
    }
}
