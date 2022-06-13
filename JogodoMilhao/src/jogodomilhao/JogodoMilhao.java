package jogodomilhao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JogodoMilhao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("JOGO DO MILHÃO");
            System.out.println("MENU:\n1 - JOGAR  2 - INSTRUÇÕES  3- CRIADORES  4- SAIR");

            opcao = teclado.nextInt();

            if (opcao == 1) {
                Jogador j = new Jogador();

                GerarJogo.gerarPerguntas();
                while (true) {
                    if (!GerarJogo.receberResposta(j)) {
                        System.out.println("FIM DO JOGO");
                        break;
                    }
                }
                break;
            } else if (opcao == 2) {
                JOptionPane.showMessageDialog(null, "O programa consiste em nove rodadas e uma pergunta final: cada rodada possui uma pergunta, variando de mil reais até um milhão. A última pergunta vale R$ 1 milhão.");
            } else if (opcao == 3) {
                System.out.println("Ana Victória, Bianca Prado, José Luis, Luiza Isabelle, Sarah Estevam");
            } else {
                break;
            }
        }
    }
}
