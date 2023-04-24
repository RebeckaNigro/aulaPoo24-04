package AtividadePoo;

public class Aluno {
    private String nome;
    private String endereco;

    private Escola escola;

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Aluno(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void imprimir() {
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Endereço: %s\n", this.endereco);

        }
}
