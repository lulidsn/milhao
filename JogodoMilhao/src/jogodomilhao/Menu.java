
package jogodomilhao;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
    
    private int opcao;
    
    public Menu(){
     Scanner teclado = new Scanner(System.in);  
     int opcao;
     System.out.println("JOGO DO MILHÃO");
        System.out.println("MENU: 1 - JOGAR  2 - INSTRUÇÕES  3- CRIADORES  4- SAIR");
        
        opcao = teclado.nextInt();
        
        if(opcao == 1){
            Joguinho jg = new Joguinho();
        }
        else if(opcao==2){
           JOptionPane.showMessageDialog(null, "O programa consiste em nove rodadas e uma pergunta final: cada rodada possui uma pergunta, variando de mil reaqis até um milhão. A última pergunta vale R$ 1 milhão.");
        }
        else if(opcao == 3){
            System.out.println("Ana Victória, Bianca Prado, José Luis, Luiza Isabelle, Sarah Estevam");
        }
    }
}


       