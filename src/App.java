import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Fazer uma conexão HTTP e buscar os top 250 filmes do IMDB
        String url = "https://api.mocki.io/v2/549a5d8b/Top250Movies";

        URI endereco = URI.create(url);

        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(endereco).GET().build();
        // Extrair só os dados que interessam (título, poster, classificação)

        // Exibir e manipular os dados do nosso jeito
    }
}
