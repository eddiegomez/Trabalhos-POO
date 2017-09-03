package Exercicio5;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Cleu1
 */
public class OrdenaVector {

    private static Vector vector1;
    private static Vector vector2;
    private static int maximo = 0;

    public static void CriaVectores(int k) {
        vector1 = new Vector(k);
        vector2 = new Vector(1000);
        for (int i = 0; i < k; i++) {
            vector1.add(Integer.parseInt(JOptionPane.showInputDialog("Valor ")));
        }
    }

    public static void OrdenaVector() {
        
        for (int i = 0; i < vector1.capacity(); i++) {
            if (maximo < (int) vector1.get(i)) {
                maximo = (int) vector1.get(i);
                vector1.add(0);
            }
            for (int j = 0; j < vector2.capacity(); j++) {
                if (vector2.equals(null)) {
                    vector2.add(maximo);
                    break;
                }
            }
        }
              for (int j = 0; j < vector2.capacity(); j++) {
            System.out.println((int) vector2.get(j));
        }
  
    }

    public static void main(String[] args) {

        int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Capacidade do vector "));
        CriaVectores(capacidade);
        OrdenaVector();
    }

}
