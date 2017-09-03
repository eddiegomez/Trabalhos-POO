package Exercicio1;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Gomes
 */
public class Estatistica {

    static Vector vector;

        /**
     * Metodo que localiza a media de um vector de inteiros
     * @return media
     */
    public static double media() {
        int soma = 0;
        for (int i = 0; i < vector.capacity(); i++) {
            soma = soma + (int) vector.get(i);
        }
        double media = soma / 2;
        return media;
    }

    /**
     * Metodo que localiza a mediana de um vector de inteiros
     * @return mediana
     */
    public static int mediana() {
        int indiceMediana = vector.capacity() / 2;
        int x = Math.abs(indiceMediana);
        int mediana = (int) vector.get(x);

        return mediana;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Capacidade do vector de inteiros
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Capacidade do vector:"));
        
        vector = new Vector(capacidade);
        
        
        for (int i = 0; i < vector.capacity(); i++) {
            int nr = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
            vector.add(nr);
        }

        System.out.println("============MEDIA============");
        System.out.println("Media: " + media());

        System.out.println("===========MEDIANA===========");
        System.out.println("Media: " + mediana());
    }

}
