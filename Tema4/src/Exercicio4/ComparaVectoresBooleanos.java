package Exercicio4;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Edson Gomes
 */
public class ComparaVectoresBooleanos {

    private static Vector vectorBooleano1;
    private static Vector vectorBooleano2;
    private static int controle;

    public static void CriaVectores(int k, int j) {
        vectorBooleano1 = new Vector(k);
        vectorBooleano2 = new Vector(j);
        for (int i = 0; i < k; i++) {
            vectorBooleano1.add(Boolean.parseBoolean(JOptionPane.showInputDialog("Valor booleano (true/false) do primeiro vector na posicao " + i)));
        }
        for (int i = 0; i < j; i++) {
            vectorBooleano2.add(Boolean.parseBoolean(JOptionPane.showInputDialog("Valor booleano (true/false) do Segundo vector na posicao " + i)));
        }
    }

    public static void ComparaVectores() {
        if(vectorBooleano1.capacity()!= vectorBooleano2.capacity()){
            JOptionPane.showMessageDialog(null, "Os vectores nao sao identicos, pois nao tem a mesma capacidade.");
        }else{
            for(int i=0;i<vectorBooleano1.capacity();i++){
                if(vectorBooleano1.get(i).equals(vectorBooleano2.get(i))){
                    controle++;
                }
            }
            if(vectorBooleano1.capacity()==controle){
                JOptionPane.showMessageDialog(null, "Os vectores sao identicos, tem a mesma capacidade e elementos iguais nas suas posicoes correspondentes");
            }else{
                JOptionPane.showMessageDialog(null, "Os vectores nao sao identicos, tem a mesma capacidade mas os elementos nas  posicoes correspondentes nao sao iguais");
            }
        }

    }

    public static void main(String[] args) {
        int capacidade1 = Integer.parseInt(JOptionPane.showInputDialog("Capacidade para o primeiro vector"));
        int capacidade2 = Integer.parseInt(JOptionPane.showInputDialog("Capacidade para o segundo vector"));
        CriaVectores(capacidade1, capacidade2);
        ComparaVectores();
    }

}
