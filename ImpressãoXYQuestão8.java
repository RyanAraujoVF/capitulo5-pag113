package impressãoxy.questão8;

import javax.swing.JOptionPane;

public class ImpressãoXYQuestão8 {

    public static void main(String[] args) {
    // Declarar as variáveis
    int X, Y;
    // Inicializar as variáveis X e Y com 0 e 30, respectivamente
    X = 0;
    Y = 30;
    // Criar uma variável para armazenar o texto a ser exibido
    String texto = "";
    // Enquanto X for menor que 10, repetir o bloco de instruções
    while (X < 10) {
        // Incrementar X em 1
        X = X + 1;
        // Decrementar Y em 1
        Y = Y - 1;
        // Adicionar o valor de X e Y ao texto, seguido de uma quebra de linha
        texto += X + " " + Y + "\n";
    }
    // Mostrar o texto em uma caixa de diálogo
    JOptionPane.showMessageDialog(null, texto);
   }
}
