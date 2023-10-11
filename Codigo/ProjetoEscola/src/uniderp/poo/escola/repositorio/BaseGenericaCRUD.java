package uniderp.poo.escola.repositorio;

import java.util.ArrayList;

public abstract class BaseGenericaCRUD<TFakeDB, TDominio> { // A classe é parametrizada com dois tipos genéricos:
                                                            // TFakeDB representa a fonte de dados (um banco de dados
                                                            // fake, por exemplo), e TDominio representa a entidade ou
                                                            // domínio que será manipulada pelo repositório (por
                                                            // exemplo, Aluno, Professor, etc.).

    // Atributos
    // db: Representa a fonte de dados, como um banco de dados falso.
    // dataset: É uma lista que representa os dados a
    // serem manipulados (por exemplo, uma lista de alunos).

    protected TFakeDB db;

    protected ArrayList<TDominio> dataset;

    public abstract TDominio Create(TDominio instancia); // Método abstrato que representa a operação de criação (ou
                                                         // inserção) de um objeto do tipo TDominio na fonte de dados.

    public abstract TDominio Read(int codigo); // Método abstrato que representa a operação de leitura (ou consulta) de
                                               // um objeto do tipo TDominio com base em um código.

    public ArrayList<TDominio> ReadAll() { // Este método retorna a lista completa de objetos do tipo TDominio presente
                                           // na fonte de dados.
        return this.dataset;
    }

    public abstract TDominio Update(TDominio instancia); // Método abstrato que representa a operação de atualização (ou
                                                         // modificação) de um objeto do tipo TDominio na fonte de
                                                         // dados.

    public abstract TDominio Delete(int codigo); // Método abstrato que representa a operação de exclusão (ou remoção)
                                                 // de um objeto do tipo TDominio da fonte de dados.

}

// Essencialmente, BaseGenericaCRUD define uma estrutura genérica para operações
// de CRUD em uma fonte de dados representada pelo tipo TFakeDB, trabalhando com
// objetos do tipo TDominio. As operações CRUD específicas são deixadas para
// implementação nas classes concretas que herdam dessa classe abstrata.