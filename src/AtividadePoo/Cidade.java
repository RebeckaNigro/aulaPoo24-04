package AtividadePoo;

import ListaAtletas.Atleta;

import java.util.ArrayList;

public class Cidade {
    private String nome;
    private  int populacao;
    private ArrayList<Bairro> bairros;

    public Cidade(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
        this.bairros = new ArrayList<>();
    }
    public Bairro getBairro (int i){
        return bairros.get(i);

    }

    public void adicionaBairro(Bairro b){
        bairros.add(b);
        b.setCidade(this);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public ArrayList<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(ArrayList<Bairro> bairros) {
        this.bairros = bairros;
    }
    public void imprimir(){
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("População: %s\n", this.populacao);
        System.out.printf("Bairros (%d): \n", bairros.size());
        for(int i=0; i<bairros.size(); i++){
            Bairro b = bairros.get(i);
            System.out.printf("\t%s\n", b.getNome());
        }
    }

}
