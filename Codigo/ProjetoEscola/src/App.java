import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.repositorio.AlunoRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoRepositorio repo = new AlunoRepositorio();
        System.out.println("### Início de Execução. ###");
        for (Aluno aluno : repo.ReadAll()) {
            System.out.println("-----------------------------------");
            aluno.Imprimir();
        }
        System.out.println("### Final de Execução. ###");

    }
}
