package Exercicio3;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Gomes
 */
public class TesteEstudante {

    public static void main(String[] args) {

        Controle run = new Controle();
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Nr de estudantes a cadastrar: "));
        
            run.AdicionarEstudante(capacidade);
            System.out.println(run.MaiorMedia(capacidade));
        


    }

}
