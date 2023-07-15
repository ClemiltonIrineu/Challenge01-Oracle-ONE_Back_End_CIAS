import javax.swing.JOptionPane;

public class ConversaoTemperatura {

	public double Valor;
	public double resultado;
	public String Tipo;
	public String Result;


	Object[] possibleValues = { "Celsius em Fahrenheit", "Fahrenheit em Celsius", "Celsius em Kelvin",
			"Kelvin em Celsius", "Fahrenheit em Kelvin", "Kelvin em Fahrenheit", };

	public Object[] getTemps() {
		return this.possibleValues;
	}

	public double ConvertendoTemp(Object selectedValue, double valor) {

		Valor = valor;
		Tipo = (String) selectedValue;

		switch (Tipo) {
		case "Celsius em Fahrenheit":
			resultado = (Valor * 1.8 + 32);
			JOptionPane.showMessageDialog(null, " A temperatura inserida é " + valor + " ºC a sua conversao é de " + resultado + " ºF", "Temperatura Convertida", 1 );
			break;

		case "Fahrenheit em Celsius":
			resultado = ((Valor - 32) / 1.8);
			JOptionPane.showMessageDialog(null, " A temperatura inserida é " + valor + " ºF a sua conversao é de " + resultado + " ºC", "Temperatura Convertida", 1  );
			break;

		case "Celsius em Kelvin":
			resultado = (Valor + 273);
			JOptionPane.showMessageDialog(null, " A temperatura inserida é " + valor + " ºC a sua conversao é de " + resultado + " ºK" , "Temperatura Convertida", 1  );
			break;

		case "Kelvin em Celsius":
			resultado = (Valor - 273);
			JOptionPane.showMessageDialog(null, " A temperatura inserida é " + valor + " ºK a sua conversao é de " + resultado + " ºC", "Temperatura Convertida", 1  );
			break;
			
		case "Fahrenheit em Kelvin":
			resultado = ((Valor - 32) / 1.8111 + 273);
			JOptionPane.showMessageDialog(null, " A temperatura inserida é " + valor + " ºF a sua conversao é de " + resultado + " ºK", "Temperatura Convertida", 1  );
			break;

		case "Kelvin em Fahrenheit":
			resultado = ((Valor - 273) * 1.8111 + 32);
			JOptionPane.showMessageDialog(null, " A temperatura inserida é " + valor + " ºK a sua conversao é de " + resultado + " ºF", "Temperatura Convertida", 1  );
			break;

		}
		return 0;

	}

}
