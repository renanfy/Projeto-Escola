package uniderp.poo.escola.dominio;

public abstract class BaseIdentificador {
    protected int codigo;

    // GETTERS E SETTERS

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // MÉTODO CONSTRUTOR

    public BaseIdentificador(int codigo) { // Este é o construtor da classe BaseIdentificador, que recebe um parâmetro
                                           // codigo e o atribui ao atributo correspondente.
        this.codigo = codigo;
    }
}

// O propósito dessa classe é fornecer uma estrutura comum para outras classes
// que precisam de uma identificação única (como um código) para seus objetos.
// Por ser uma classe abstrata, espera-se que outras classes a estendam para
// utilizar o mecanismo de identificação padrão oferecido por essa classe. Ao
// herdar dessa classe, as subclasses (como Aluno, Professor, etc.) podem
// acessar e manipular o código associado a um objeto. Essa abstração é útil
// para unificar a lógica de gerenciamento de identificadores nas diferentes
// classes do domínio.