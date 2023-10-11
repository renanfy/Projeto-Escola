package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseDadosComuns implements IImpressao { // A classe implementa a interface
                                                                                 // IImpressao, o que significa que ela
                                                                                 // deve fornecer uma implementação para
                                                                                 // o método declarado na interface, que
                                                                                 // é o Imprimir.

    protected String endereco;
    protected String telefone;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public BasePessoa(int codigo, LocalDate dataInsercao, String endereco, String telefone) {
        super(codigo, dataInsercao);
        this.endereco = endereco;
        this.telefone = telefone;
    }
}

// O propósito dessa classe é fornecer uma estrutura comum para outras classes
// que representam pessoas no domínio, como alunos, professores, técnicos, etc.
// Ao centralizar características comuns relacionadas a endereço e telefone
// nesta classe, evita-se a repetição de código e facilita a manutenção do
// sistema. Além disso, por implementar a interface IImpressao, a classe possui
// uma responsabilidade comum de imprimir informações, que pode ser utilizada
// por suas subclasses.