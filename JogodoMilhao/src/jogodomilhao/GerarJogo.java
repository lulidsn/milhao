package jogodomilhao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GerarJogo {

    private static ArrayList<Pergunta> ppe = new ArrayList<>();
    private static int perguntaAtual = 0;
    private static int valorAtual = 0;
    private static int valores[] = {1000, 2500, 5000, 10000, 25000, 50000, 100000, 250000, 500000, 1000000};
    private static double over = 0;
    private static int ind = 1;

    public static void gerarPerguntas() {

        ppe.add(new Pergunta("Onde está localizado o museu do louvre? \n a. Paris b. Roma c. Madri d. Londres", "a", 0));

        ppe.add(new Pergunta("Quando ocorreu a abertura dos portos brasileiros por D. João VI? \n \n a. 1808  \n b. 1822  \n c. 1792 \n d. 1530", "a", 0));

        ppe.add(new Pergunta("Um carro gasta 40 litros de gasolina para rodar 400.000 metros. Quantos quilômetros ele roda por litro? \n a. 10 \n b. 12  \n c. 40 \n d. 20", "c", 0));

        ppe.add(new Pergunta("Em qual andar está o apartamento que está três andares acima do do décimo?\n a. vigésimo \n b. décimo terceiro \n c. décimo oitavo \n d. sétimo", "b", 0));

        ppe.add(new Pergunta("Qual dia ficou conhecido no brasil como “dia do fico”?\n a. 15 de agosto \n b. 19 de janeiro \n c. 9 de agosto \n d. 9 de janeiro", "d", 0));

        ppe.add(new Pergunta("Capixaba é a palavra que define os nascidos em:\n a. Rio grande do sul \n b. Espírito Santo \n c. Paraíba  \n d. Ceará ", "b", 0));

        ppe.add(new Pergunta("Qual a capital da Califórnia nos Estados Unidos?\n a. Washington  \n b. Nova York \n c. Orlando  \n d. Sacramento", "d", 0));

        ppe.add(new Pergunta("Quanto é 6x8?\n a. 63 \n b. 52 \n c. 68 \n d. 48", "d", 0));

        ppe.add(new Pergunta("Dez dúzias correspondem a quantas unidades?\n a. 120 unidades \n b. 100 unidades \n c. 60 unidades  \n d. 96 unidades", "a", 0));

        ppe.add(new Pergunta("Joana D’arc foi uma heroína:\n a. Inglesa \n b. Francesa \n c. Italiana \n d. Portuguesa", "b", 0));

        ppe.add(new Pergunta("O que significa “Colosso”?\n a. Osso colorido \n b. Objetos de grandes dimensões \n c. Coletivo de ossos \n d. Líquido Grosso", "b", 0));

        ppe.add(new Pergunta("Procrastinar significa…\n a. Ter muitos filhos \n b. Prevenir \n c. Adiar \n d. Procurar com afinco", "c", 0));

        ppe.add(new Pergunta("Onde está o Ubequistão?\n a. Ásia Central \n b. África  \n c. América do Sul \n d. Antártica", "a", 0));

        ppe.add(new Pergunta("Beisebol e Basquete são esportes populares de qual país ?\n a. Estados Unidos \n b. Brasil \n c. França \n d. Singapura", "a", 0));

        ppe.add(new Pergunta("Pávido é o mesmo que…\n a. Assustado \n b. Aliviado \n c. Derrotado \n d. Alegre", "b", 0));

        ppe.add(new Pergunta("Quem foi o primeiro governador-geral do Brasil?\n a. José Bonifácio \n b. Duarte da Costa \n c. Tomé de Sousa \n d. Mem de Sá", "c", 0));

        ppe.add(new Pergunta("Qual o inseto que transmite a febre amarela?\n a. Pulga \n b. Carrapato \n c. Mosquito \n d. Aranha", "c", 0));

        ppe.add(new Pergunta("Qual destes animais não é um mamífero\n a. Cachorro \n b. Coelho \n c. Tartaruga \n d. Urso", "c", 0));

        ppe.add(new Pergunta("Como é chamado a pessoa que estuda as plantas?\n a. Floricultor \n b. Botânico \n c. Horticultor \n d. Jardineiro", "b", 0));

        ppe.add(new Pergunta("Como se chama o movimento do oceano influenciado pela lua?\n a. Eclipse  \n b. Terremoto \n c. Maré \n d. Cometa", "c", 0));

        ppe.add(new Pergunta("Quem perdeu a força quando lhe cortaram o cabelo?\n a. Davi \n b. Golias  \n c. Cezar \n d. Sansão", "d", 0));

        ppe.add(new Pergunta("Qual animal que representa o signo de câncer?\n a. Touro \n b. Galinha \n c. Carangueijo \n d. Macaco", "c", 0));

        ppe.add(new Pergunta("Quem é a mulher de Tarzan?\n a. Diana \n b. Louis Laine \n c. Jane \n d. Chita", "c", 0));

        ppe.add(new Pergunta("O que é Ornitorrinco?\n a. Legume \n b. Vulcão  \n c. Rio \n d. Animal", "d", 0));

        ppe.add(new Pergunta("Com o que era acionado o motor dos antigos automóveis?\n a. Chave de Fenda \n b. Parafuso \n c. Barbante \n d. Manivela", "d", 0));

        ppe.add(new Pergunta("Qual o conjunto habitacional citado por netinho do negritude jr.\n a. Cingapura \n b. Plano Cem \n c. Cohab \n d. Plano Z", "c", 0));

        ppe.add(new Pergunta("De qual país os Estados Unidos compraram o Alasca?\n a. Inglaterra \n b. Canadá \n c. China \n d. Rússia", "d", 0));

        ppe.add(new Pergunta("Quem entrega os serviços postais via terrestre?\n a. Cartomante \n b. Cartunista \n c. Carteiro \n d. Cartola", "c", 0));

        ppe.add(new Pergunta("De que é feito o pé-de-moleque?\n a. Amendoim \n b. Castanha \n c. Alcaparra \n d. Abacate", "a", 0));

        ppe.add(new Pergunta("Qual é o menor dos números naturais?\n a. 0 \n b. 1 \n c. -1 \n d. 10", "a", 0));

        //random
        Collections.shuffle(ppe);
    }

    public static boolean receberResposta(Jogador jogador) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("\nPergunta " + (ind++) + ":");
        System.out.println(ppe.get(perguntaAtual).getEnunciado().toUpperCase());
        String resposta = teclado.nextLine();
        // String resposta = ppe.get(perguntaAtual).getResposta();

        if (ppe.get(perguntaAtual).getResposta().equalsIgnoreCase(resposta)) {
            System.out.println("CERTA RESPOSTA!!\n");

            jogador.setValor(valores[valorAtual]);
            System.out.println(jogador);
            valorAtual++;
            perguntaAtual++;
            
            if (valorAtual == valores.length) {
                encerrarJogo();
                return false;
            }
            
            return true;
        } else {
            System.out.println("RESPOSTA INCORRETA!");
            jogador.setValor(valores[valorAtual]);
            if (valorAtual > 0) {
                over = valores[valorAtual - 1];
                System.out.println("\nAlternativa incorreta! Você receberá R$" + over / 2);
            } else {
                System.out.println("\nAlternativa incorreta! Você receberá R$" + over);
            }
            return false;
        }
    }
    public static void encerrarJogo(){
        System.out.println("Parábens!! Você é o mais novo MILIONÁRIO do país!!");
    }
}
