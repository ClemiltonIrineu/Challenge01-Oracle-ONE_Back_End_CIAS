
public class MoedaCalculos {

	public double calculos(double valorDigitado, String opcao1, String opcao2) {

		ConectExtratorAPI BuscaCotacao = new ConectExtratorAPI();

		String dados[] = BuscaCotacao.consumoAPI(opcao1, opcao2);
		return Double.valueOf(valorDigitado) * Double.valueOf(dados[0]);
	}
}
