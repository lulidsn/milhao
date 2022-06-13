package jogodomilhao;

import java.util.Scanner;

public class Jogador {

    private String nome;
    private double valor = 0;

    public Jogador() {
        Scanner teclado = new Scanner(System.in);
        String c;
        System.out.println("DIGITE SEU NOME:");
        c = teclado.nextLine();
        nome = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome + " - R$" + valor;
    }

}
