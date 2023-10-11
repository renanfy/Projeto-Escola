package uniderp.poo.escola.fakedb;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<TDominio> {

    public ArrayList<TDominio> tabela; // Atributo que representa a tabela de dados. É uma lista que armazenará os
                                       // objetos do tipo 'TDominio' (classe genérica).

    public ArrayList<TDominio> getTabela() { // Método que retorna a tabela de dados.
        if (this.tabela == null) { // Se a tabela ainda não foi inicializada, ele a inicializa, e depois retorna
                                   // ela.
            this.tabela = new ArrayList<TDominio>();
        }
        return this.tabela; //
    }

    protected abstract void CarregarDados(); // Método abstrato que deve ser implementado pelas subclasses. É utilizado
                                             // para carregar os dados iniciais na tabela.
                                             // Cada subclasse concreta que herda de 'BaseGenericaFakeDB' implementa
                                             // este método de acordo com suas necessidades.

    public BaseGenericaFakeDB() { // Método construtor. Quando um objeto dessa classe é criado, ele inicializa a
                                  // tabela chamando 'CarregarDados()'.
        this.tabela = new ArrayList<TDominio>(); // Antes de chamar 'CarregarDados()' ele verifica se a tabela já foi
                                                 // inicializada. Se não foi, ele cria uma nova
                                                 // instância de 'ArrayList<TDominio>'
        this.CarregarDados(); // Em seguida, chama 'CarregarDados()' para carregar os dados iniciais, se
                              // necessário.
    }
}
