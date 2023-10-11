package uniderp.poo.escola.servico;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Aluno;
import uniderp.poo.escola.repositorio.AlunoRepositorio;

public class AlunoServico extends BaseGenericaServico<AlunoRepositorio, Aluno> { // A classe herda de
                                                                                 // BaseGenericaServico e é
                                                                                 // parametrizada com AlunoRepositorio
                                                                                 // (específico para operações com
                                                                                 // alunos) e Aluno (a entidade que está
                                                                                 // sendo manipulada).
    public AlunoServico() { // O construtor inicializa o repositório específico para alunos
                            // (AlunoRepositorio).
        this.repo = new AlunoRepositorio();
    }

    // Métodos CRUD

    @Override
    public Aluno Inserir(Aluno tupla) { // Chama a operação de criação (inserção) no repositório para adicionar um novo
                                        // aluno.
        return this.repo.Create(tupla);
    }

    @Override
    public Aluno Obter(int codigo) { // Chama a operação de leitura (obtenção) no repositório para obter um aluno com
                                     // base no código.
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Aluno> Listar() { // Chama a operação de leitura de todos os alunos no repositório para obter uma
                                       // lista de todos os alunos.
        return this.repo.ReadAll();
    }

    @Override
    public Aluno Atualizar(Aluno tupla) { // Chama a operação de atualização no repositório para atualizar as
                                          // informações de um aluno.
        return this.repo.Update(tupla);
    }

    @Override
    public Aluno Excluir(int codigo) { // Chama a operação de exclusão no repositório para remover um aluno com base no
                                       // código.
        return this.repo.Delete(codigo);
    }
}

// Essencialmente, AlunoServico fornece uma interface para realizar operações
// CRUD em alunos, delegando a implementação específica das operações para o
// repositório de alunos (AlunoRepositorio).
