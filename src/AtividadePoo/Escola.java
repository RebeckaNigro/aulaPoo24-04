package AtividadePoo;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String contato;
    private String endereco;

    private Bairro bairro;


    private ArrayList<Aluno> alunos;

    public Escola(String nome, String contato, String endereco) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.alunos = new ArrayList<>();
    }

    public void adicionaAlunos(Aluno a){
        alunos.add(a);
        a.setEscola(this);
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void imprimir() {
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Contato: %s\n", this.contato);
        System.out.printf("Endereço: %s\n", this.endereco);
        System.out.printf("Alunos: \n", alunos.size());
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            System.out.printf("\t%s\n", a.getNome(), a.getEndereco());
        }
    }
}
