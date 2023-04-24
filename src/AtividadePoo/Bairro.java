package AtividadePoo;

import ListaAtletas.Atleta;

import java.util.ArrayList;

public class Bairro {
    private String nome;
    private ArrayList<Escola> escolas;
    private Cidade cidade;

    public Bairro(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }


    public void adicionaEscola(Escola e) {
        escolas.add(e);
        e.setBairro(this);
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Escolas (%d): \n", escolas.size());
        for (int i = 0; i < escolas.size(); i++) {
            Escola e = escolas.get(i);
            System.out.printf("\t%s\n", e.getNome(),e.getContato(), e.getEndereco());
        }
    }
}

