import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.servico.AlunoServico;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoServico repo = new AlunoServico();
        System.out.println("### Início de Execução. ###");
        for (Aluno aluno : repo.Listar()) {
            System.out.println("-----------------------------------");
            aluno.Imprimir();
        }
        System.out.println("### Final de Execução. ###");

    }
}
