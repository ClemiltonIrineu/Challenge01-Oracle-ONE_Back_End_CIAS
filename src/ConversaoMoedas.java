import javax.swing.JOptionPane;

public class ConversaoMoedas {

	Object[] possibleValues = { "Reais a Dólar", "Reais a Euro", "Reais a Libras Esterlinas", "Reais a Peso argentino",
			"Reais a Peso Chileno", "Dólar a Reais", "Euro a Reais", "Libras Esterlinas a Reais",
			"Peso argentino a  Reais", "Peso Chileno a Reais" };

	public Object[] getCoins() {
		return this.possibleValues;
	}

	double valorDigitado;
	String Tipo;

	public void ConvertendoCoin(Object selectedValue, double valor) {

		valorDigitado = valor;
		Tipo = (String) selectedValue;

		MoedaCalculos conversaoMoeda = new MoedaCalculos();

		switch (Tipo) {
		case "Reais a Dólar":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " BRL para: "
					+ conversaoMoeda.calculos(valorDigitado, "BRL", "USD") + " USD", "Cambio", 1);
			break;
		case "Reais a Euro":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " BRL para: "
					+ conversaoMoeda.calculos(valorDigitado, "BRL", "EUR") + " EUR", "Cambio", 1);
			break;
		case "Reais a Libras Esterlinas":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " BRL para: "
					+ conversaoMoeda.calculos(valorDigitado, "BRL", "GBP") + " GBP", "Cambio", 1);
			break;
		case "Reais a Peso argentino":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " BRL para: "
					+ conversaoMoeda.calculos(valorDigitado, "BRL", "ARS") + " ARS", "Cambio", 1);
			break;
		case "Reais a Peso Chileno":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " BRL para: "
					+ conversaoMoeda.calculos(valorDigitado, "BRL", "CLP") + " CLP", "Cambio", 1);
			break;

		case "Dólar a Reais":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " USD para: "
					+ conversaoMoeda.calculos(valorDigitado, "USD", "BRL") + " BRL", "Cambio", 1);
			break;

		case "Euro a Reais":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " EUR para: "
					+ conversaoMoeda.calculos(valorDigitado, "EUR", "BRL") + " BRL", "Cambio", 1);
			break;

		case "Libras Esterlinas a Reais":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " GBP para: "
					+ conversaoMoeda.calculos(valorDigitado, "GBP", "BRL") + " BRL", "Cambio", 1);
			break;

		case "Peso argentino a  Reais":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " ARS para: "
					+ conversaoMoeda.calculos(valorDigitado, "ARS", "BRL") + " BRL", "Cambio", 1);
			break;

		case "Peso Chileno a Reais":
			JOptionPane.showMessageDialog(null, " Cambio de " + valorDigitado + " CLP para: "
					+ conversaoMoeda.calculos(valorDigitado, "CLP", "BRL") + " BRL", "Cambio", 1);
			break;

		}
	}
}
