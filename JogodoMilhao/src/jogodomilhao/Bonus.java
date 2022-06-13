
package jogodomilhao;

import java.util.Scanner;

public class Bonus {
    
    private int op;
    private String alternativa;

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
    
    public Bonus(){
        Scanner teclado = new Scanner(System.in);
        op = teclado.nextInt();
        if(op == 1){
            System.out.println("Ligação!\nVocê ligou para o seu contato de confiaça e ele disse a seguinte alternativa:");
            alternativa = "a";
        }
    }
}
