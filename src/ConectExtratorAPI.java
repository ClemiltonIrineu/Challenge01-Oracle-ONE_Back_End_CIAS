import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConectExtratorAPI {

	private static final Pattern REGEX = Pattern.compile("\"bid\":\"([^\"]+)\"", Pattern.MULTILINE);

	public String[] consumoAPI(String opcao1, String opcao2) {

		// Conectar e extrair dados da API
		String url = "https://economia.awesomeapi.com.br/json/last/" + opcao1 + "-" + opcao2;
		ClientHTTP apiLink = new ClientHTTP();
		String json = apiLink.findData(url);

		
		// Tratamento dos dados do Json
		Matcher matcher = REGEX.matcher(json);
		// Verifica se o padrão foi encontrado e obtém o valor
		String ValorCompra[] = new String[1];
		for (int i = 0; i < ValorCompra.length; i++) {
			if (matcher.find()) {
				ValorCompra[i] = matcher.group(i + 1);
			} else {
				break;
			}
		}

		return ValorCompra;

	}
}
