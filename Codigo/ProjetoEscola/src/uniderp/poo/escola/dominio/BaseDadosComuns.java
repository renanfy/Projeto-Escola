package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BaseDadosComuns extends BaseIdentificador { // Subclasse da classe abstrata 'BaseIdentificador',
                                                                  // logo, herda os atributos e métodos dela.
    protected LocalDate dataInsercao;

    // GETTERS E SETTERS

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    // Este é o construtor da classe BaseDadosComuns. Recebe o código e a data de
    // inserção como parâmetros e os atribui aos respectivos atributos da classe.

    public BaseDadosComuns(int codigo, LocalDate dataInsercao) {
        super(codigo);
        this.dataInsercao = dataInsercao;
    }
}

// O propósito dessa classe é fornecer uma base comum para as classes do domínio
// que possuem informações de identificação, como código, e uma data de inserção
// na base de dados. Isso permite que outras classes herdem essas
// características sem repetição de código, promovendo a reutilização e a
// manutenção eficiente do código. É um exemplo de prática de programação que
// visa à modularidade e à organização do código.