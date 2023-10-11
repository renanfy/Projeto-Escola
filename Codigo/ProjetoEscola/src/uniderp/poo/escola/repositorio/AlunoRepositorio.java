package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.fakedb.AlunoFakeDB;

public class AlunoRepositorio extends BaseGenericaCRUD<AlunoFakeDB, Aluno> { // A classe AlunoRepositorio estende a
                                                                             // classe genérica BaseGenericaCRUD e é
                                                                             // parametrizada com as classes AlunoFakeDB
                                                                             // (representando o banco de dados fake) e
                                                                             // Aluno (representando a entidade que será
                                                                             // manipulada).

    // Método Construtor
    // O construtor inicializa uma instância de AlunoFakeDB e define o dataset
    // (tabela de dados) como a tabela presente no banco de dados fake. Isso é
    // importante para garantir que o repositório trabalhe com os dados presentes no
    // banco fake.

    public AlunoRepositorio() {
        this.db = new AlunoFakeDB();
        this.dataset = this.db.getTabela();
    }

    // Métodos CRUD

    @Override
    public Aluno Create(Aluno instancia) { // Este método cria um novo aluno, gera um código para ele e o adiciona à
                                           // tabela (dataset).
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Aluno Read(int codigo) { // Este método busca um aluno na tabela (dataset) com base no código fornecido.
        for (Aluno aluno : this.dataset) {
            if (aluno.getCodigo() == codigo) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public Aluno Update(Aluno instancia) { // Este método atualiza as informações de um aluno na tabela (dataset).
        Aluno alvo = this.Read(instancia.getCodigo());
        alvo.setCpf(instancia.getCpf());
        alvo.setDataInsercao(instancia.getDataInsercao());
        alvo.setDataMatricula(instancia.getDataMatricula());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setEndereco(instancia.getEndereco());
        alvo.setMatricula(instancia.getMatricula());
        alvo.setNome(instancia.getNome());
        alvo.setRg(instancia.getRg());
        alvo.setTelefone(instancia.getTelefone());
        return alvo;
    }

    @Override
    public Aluno Delete(int codigo) { // Este método remove um aluno da tabela (dataset).
        Aluno alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }

}

// Essencialmente, a classe AlunoRepositorio encapsula a lógica para manipulação
// dos dados de alunos, interagindo com o banco de dados fake (AlunoFakeDB).
// Cada operação CRUD é implementada de acordo com as necessidades da aplicação.