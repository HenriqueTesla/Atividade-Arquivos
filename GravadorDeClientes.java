import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravadorDeClientes {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Alice", 30));
        clientes.add(new Cliente("Bob", 25));
        clientes.add(new Cliente("Carlos", 40));

        try (FileWriter escritor = new FileWriter("clientes.txt")) {
            for (Cliente c : clientes) {
                escritor.write(c.toString() + "\n");
            }
            System.out.println("Clientes gravados com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao gravar clientes.");
            e.printStackTrace();
        }
    }
}