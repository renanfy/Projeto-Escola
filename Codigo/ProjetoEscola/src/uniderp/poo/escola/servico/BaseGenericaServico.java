package uniderp.poo.escola.servico;

import java.util.ArrayList;

public abstract class BaseGenericaServico<TRepo, TDominio> { // Aqui, a classe é parametrizada com dois tipos genéricos:
                                                             // TRepo (representando o tipo do repositório a ser
                                                             // utilizado) e TDominio (representando o tipo da entidade
                                                             // que está sendo manipulada, por exemplo, Aluno).

    protected TRepo repo; // É um atributo protegido para armazenar uma instância do repositório
                          // específico.

    // Métodos CRUD

    public abstract TDominio Inserir(TDominio tupla); // Método abstrato que será implementado nas subclasses para
                                                      // inserir uma entidade (por exemplo, um aluno) no repositório.

    public abstract TDominio Obter(int codigo); // Método abstrato que será implementado nas subclasses para obter uma
                                                // entidade (por exemplo, um aluno) do repositório com base em um
                                                // código.

    public abstract ArrayList<TDominio> Listar(); // Método abstrato que será implementado nas subclasses para obter uma
                                                  // lista de todas as entidades (por exemplo, alunos) no repositório.

    public abstract TDominio Atualizar(TDominio tupla); // Método abstrato que será implementado nas subclasses para
                                                        // atualizar informações de uma entidade (por exemplo, um aluno)
                                                        // no repositório.

    public abstract TDominio Excluir(int codigo); // Método abstrato que será implementado nas subclasses para excluir
                                                  // uma entidade (por exemplo, um aluno) do repositório com base em um
                                                  // código.

    public BaseGenericaServico() { // Um construtor vazio, que pode ser utilizado nas subclasses ou ser sobreposto
                                   // por construtores específicos nessas subclasses.

    }

}

// Essencialmente, BaseGenericaServico define a estrutura genérica para serviços
// que operam em entidades específicas (como alunos, professores, etc.),
// delegando a implementação das operações CRUD para as subclasses, que devem
// fornecer a lógica específica para cada operação.