package Exercicio3;

import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Gomes
 */
public class Controle {

    Scanner inp = new Scanner(System.in);

    Estudante estudante = new Estudante();
    Stack estudantes = new Stack();
    String nomesMaior;

    public Estudante CriarEstudante() {

        System.out.println("========CADASTRO DE ESTUDANTE========");
        System.out.println("");

        System.out.print("    Nome: ");
        estudante.setNome(inp.next());
        System.out.print("    Teste 1: ");
        estudante.setNota1(inp.nextDouble());
        System.out.print("    Teste 2: ");
        estudante.setNota2(inp.nextDouble());
        System.out.print("    Teste 3: ");
        estudante.setNota3(inp.nextDouble());
        double media = (estudante.getNota1() + estudante.getNota2() + estudante.getNota3()) / 3;
        estudante.setMedia(media);

        return estudante;

    }

    /**
     * Erro ao tentar definir a capacidade do stack com o valor recebido por
     * parametro
     *
     * @param qtd
     */
    public void AdicionarEstudante(int qtd) {

        for (int i = 0; i < qtd; i++) {
            estudantes.add(CriarEstudante());
            System.out.println("");
            System.out.println(">> Cadastrado com sucesso: "
                    + "\n     Nome: " + estudante.getNome()
                    + "\n     Media: " + estudante.getMedia());

        }
    }

//    public String MaiorMedia(int qtd) {
//        int i = 0;
//
//        Estudante est = (Estudante) estudantes.get(i);
//        double maxima = est.getMedia();
//        System.out.println("======Maior Media======");
//        System.out.println("");
//        for (i = 1; i < qtd; i++) {
//            est = (Estudante) estudantes.get(i);
//            if (maxima < est.getMedia()) {
//                maxima = est.getMedia();
//                nomeMelhor = est.getNome();
//            }
//
//        }
//        est = (Estudante) estudantes.get(i);
//        for (i = 1; i < qtd-1; i++) {
//
//            if (maxima == est.getMedia()) {
//                return "Os estudantes com a melhor media sao " + est.getNome() + " e " + nomeMelhor + ", ambos com a nota media de " + est.getMedia() + " Valores. ";
//            }
//        }
//        return "O estudante com a melhor media e " + est.getNome() + " com a nota media de " + est.getMedia() + " Valores. ";
//    }
    public String MaiorMedia(int qtd) {
        int i = 0;

        Estudante est = (Estudante) estudantes.get(i);
        double maxima = est.getMedia();
        System.out.println("======Maior Media======");
        System.out.println("");
        for (i = 0; i < qtd; i++) {
            est = (Estudante) estudantes.get(i);
            if (maxima < est.getMedia()) {
                maxima = est.getMedia();
            }
        }
        System.out.println("O(s) estudante(s) com a melhor media de " + maxima + "valores e (sao): ");
        for (i = 0; i < qtd; i++) {
            if (maxima == est.getMedia()) {
                nomesMaior = est.getNome();
                System.out.println("Nome: "+nomesMaior);
            }
        }

        return "" ;

    }

}
