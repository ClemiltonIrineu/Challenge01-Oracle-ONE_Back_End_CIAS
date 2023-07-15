
import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import javax.swing.JOptionPane;

public class ClientHTTP {

	public String findData(String url) {

		URI address = URI.create(url);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(address).GET().build();

		HttpResponse<String> response;

		try {
			response = client.send(request, BodyHandlers.ofString());
			return response.body();

		} catch (ConnectException | InterruptedException e) {
			JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor!");
			// e.printStackTrace();
			//throw new IllegalStateException("Erro ao buscar URL ou sem acesso a internet.");
		   throw new RuntimeException("Erro ao buscar URL ou sem acesso a internet.");

		} catch (IOException e) {
			throw new RuntimeException("Erro ao receber dado.");
		} 
	}
}
