import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuConversation {

	public String op;

	public static void main(String[] args) {

		Conversores optar = new Conversores();

		Object[] possibleValues = { "Moedas", "Temperatura", "Teste" };

		ImageIcon icon = new ImageIcon(
				"C:\\Users\\MSI-Penha\\OneDrive\\Área de Trabalho\\ONE - Alura\\Challenge01-Oracle-ONE_Back_End_CIAS\\src\\configuracoes-de-conversao.png");

		Object selectedValue = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de conversão",
				"Menu de Conversões", 0, icon, possibleValues, possibleValues[0]);

		String op = (String) selectedValue;

		if (selectedValue != null) {
			optar.OpcaoConversor(op);
		} else
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
	}

}
