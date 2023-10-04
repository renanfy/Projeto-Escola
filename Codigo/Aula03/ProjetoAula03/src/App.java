import java.time.LocalDate;

import uniderp.poo.escola.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente();
        c1.setCodigo(1);
        c1.setNome("Luiz");
        c1.setEndereco("rua tal, 10");
        c1.setTelefone("97873211");
        c1.setDataNascimento(LocalDate.of(2018, 07, 22));
        c1.setRg("123456789");
        c1.setCpf("98765432132");
        c1.setDataInsercao(LocalDate.now());

        Cliente c2 = new Cliente(2, "Jesus", "Rua Galileia, 15", "321", LocalDate.of(0, 0, 0), "123", "321", LocalDate.now());

        
    }
}
