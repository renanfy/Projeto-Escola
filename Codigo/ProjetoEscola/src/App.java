import java.util.ArrayList;

import uniderp.poo.escola.dominio.*;
import uniderp.poo.escola.fakedb.*;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoFakeDB db = new AlunoFakeDB();
        ArrayList<Aluno> lista = db.getTabela();
        System.out.println("### Início de Execução ALUNO. ###");
        for (Aluno aluno : lista) {
            System.out.println("-----------------------------------");
            aluno.Imprimir();
        }
        System.out.println("### Final de Execução ALUNO. ###");

        FornecedorFakeDB Forndb = new FornecedorFakeDB();
        ArrayList<Fornecedor> Fornlista = Forndb.getTabela();
        System.out.println("### Início de Execução FORNECEDOR. ###");
        for (Fornecedor fornecedor : Fornlista) {
            System.out.println("--------------------------------------");
            fornecedor.Imprimir();
        }
        System.out.println("### Final de Execução FORNECEDOR. ###");

        ProfessorFakeDB Profdb = new ProfessorFakeDB();
        ArrayList<Professor> Proflista = Profdb.getTabela();
        System.out.println("### Início de Execução PROFESSOR. ###");
        for (Professor professor : Proflista) {
            System.out.println("----------------------------");
            professor.Imprimir();
        }
        System.out.println("### Final de Execução PROFESSOR. ###");

        TecnicoFakeDB Tecdb = new TecnicoFakeDB();
        ArrayList<Tecnico> Teclista = Tecdb.getTabela();
        System.out.println("### Início de Execução TÉCNICO. ###");
        for (Tecnico tecnico : Teclista) {
            System.out.println("-------------------------");
            tecnico.Imprimir();
        }
        System.out.println("### Final de Execução TÉCNICO. ###");
    }
}
