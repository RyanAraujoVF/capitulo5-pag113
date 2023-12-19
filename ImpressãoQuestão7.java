package impressão.questão7;

import javax.swing.JOptionPane;

public class ImpressãoQuestão7 {

    public static void main(String[] args) {
     // Declarar as variáveis
    int X, I;
    // Inicializar a variável I com 1
    I = 1;
    // Criar uma variável para armazenar o texto a ser exibido
    String texto = "";
    // Enquanto I for menor que 20, repetir o bloco de instruções
    while (I < 20) {
        // Calcular o quadrado de I e atribuir à variável X
        X = I * I;
        // Adicionar o valor de I e X ao texto, seguido de uma quebra de linha
        texto += I + " " + X + "\n";
        // Incrementar I em 2
        I = I + 2;
        // Adicionar uma mensagem ao texto, seguida de uma quebra de linha
        texto += "Passei por aqui!\n";
    }
    // Adicionar uma mensagem final ao texto
    texto += "Ufa, cheguei aqui!";
    // Mostrar o texto em uma caixa de diálogo
    JOptionPane.showMessageDialog(null, texto);
   }
}
