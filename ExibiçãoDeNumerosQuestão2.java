
package exibiçãodenumeros.questão2;

import javax.swing.JOptionPane;

public class ExibiçãoDeNumerosQuestão2 {

    public static void main(String[] args) {
     
    int numero = 1;
    String texto = "";
    
    while (numero <= 10000) 
    {
        texto += numero + ", ";
        numero += numero * 2;
    }
    
    texto = texto.substring(0, texto.length() - 2);
    JOptionPane.showMessageDialog(null, texto);
    }
 }