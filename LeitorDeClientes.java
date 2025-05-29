import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorDeClientes {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader("clientes.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";");
                String nome = partes[0];
                int idade = Integer.parseInt(partes[1]);
                clientes.add(new Cliente(nome, idade));
            }

            System.out.println("Clientes lidos:");
            for (Cliente c : clientes) {
                System.out.println(c.getNome() + " - " + c.getIdade() + " anos");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de clientes.");
            e.printStackTrace();
        }
    }
}