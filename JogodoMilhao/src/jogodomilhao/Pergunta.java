
package jogodomilhao;

public class Pergunta {
    private String enunciado;
    private String resposta;
    private double valor;

    public Pergunta(String enunciado, String resposta, double valor) {
        this.enunciado = enunciado;
        this.resposta = resposta;
        this.valor = valor;
    }

    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    
}
