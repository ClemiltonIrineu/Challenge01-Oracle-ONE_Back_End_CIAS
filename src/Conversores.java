import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

// icones baixados da https://www.flaticon.com/ de forma gratuita

public class Conversores extends MenuConversation {

	public double ValorInserido;
	public String TipoConversao;
	public String Valor;
	ImageIcon icon;
	public Object selectedValue;

	Pattern ValidaString = Pattern.compile("[.A-Z,a-z,&%$#@!()^~]|.*[-]$|.*[+]$|.*[*]$");

	ConversaoMoedas opcaoCoin = new ConversaoMoedas();
	ConversaoTemperatura opcaoTemp = new ConversaoTemperatura();

	public void OpcaoConversor(String opp) {

		TipoConversao = opp;

		if (TipoConversao == "Moedas") {
			icon = new ImageIcon(
					"C:\\Users\\MSI-Penha\\OneDrive\\Área de Trabalho\\ONE - Alura\\Challenge01-Oracle-ONE_Back_End_CIAS\\src\\conversao.png");
			Opcoes(opcaoCoin.getCoins(), icon);

		} else if (TipoConversao == "Temperatura") {
			icon = new ImageIcon(
					"C:\\Users\\MSI-Penha\\OneDrive\\Área de Trabalho\\ONE - Alura\\Challenge01-Oracle-ONE_Back_End_CIAS\\src\\temperatura.png");
			Opcoes(opcaoTemp.getTemps(), icon);

		} else {
			JOptionPane.showMessageDialog(null, "Nao implementado ainda");
		}
	}

	public void Opcoes(Object[] Oppp, ImageIcon icon) {

		Object[] possibleValues = Oppp;

		selectedValue = JOptionPane.showInputDialog(null, "Escolha o tipo de conversão", TipoConversao, 1, icon,
				possibleValues, possibleValues[0]);

		if (selectedValue != null) {
			switch (TipoConversao) {
			case "Moedas":
				Valida(Valor);
				opcaoCoin.ConvertendoCoin(selectedValue, ValorInserido);
				//JOptionPane.showMessageDialog(null, "Nao implementado");
				exit();
			case "Temperatura":
				Valida(Valor);
				opcaoTemp.ConvertendoTemp(selectedValue, ValorInserido);
				exit();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nao implementado ainda default");
				exit();
			}
		} else
			exit();
	}

	public void exit() {

		int option = JOptionPane.showConfirmDialog(null, "Deseja Continar?", "Menu", JOptionPane.YES_NO_OPTION);
		if (option == 0) {
			main(null);
		} else if (option == 1) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			System.exit(0);
		}
	}

	public void Valida(String v) {

		Valor = JOptionPane.showInputDialog(null, "Convertendo " + selectedValue, TipoConversao,
				JOptionPane.PLAIN_MESSAGE);

		if (Valor == null) {
			exit();
		}

		Matcher m = ValidaString.matcher(Valor);

		if (m.find()) {

			JOptionPane.showMessageDialog(null, "Digite um caracter valido");
			Valida(Valor);
		}

		Valor = Valor.replaceAll(",", ".");

		try {
			ValorInserido = Double.parseDouble(Valor);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Digite um caracter valido");
			Valida(Valor);
		}

	}

}
