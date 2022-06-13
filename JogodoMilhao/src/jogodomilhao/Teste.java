/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodomilhao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    public static void leitor(String path) throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void main(String[] args) {
        try {
            Teste.leitor("C:\\Users\\SALA 03 - 2º AUTO\\OneDrive\\Documentos\\NetBeansProjects\\JogodoMilhao\\src\\jogodomilhao\\recursos\\perguntas");
        } catch (IOException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
