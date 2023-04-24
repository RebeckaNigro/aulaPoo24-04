package ListaAtletas;

import java.util.ArrayList;

public class Time {
    private String nome;
    private String nomeTéc;
    private int anoCriação;
    private ArrayList<Atleta> atletas;   
    
    public Time(String nome, String nomeTéc, int anoCriação) {
        this.nome = nome;
        this.nomeTéc = nomeTéc;
        this.anoCriação = anoCriação;
        atletas = new ArrayList<>();
    }
    //método que recebe um atleta e adiciona na lista
    public void adicionaAtleta(Atleta a){
        atletas.add(a);
    }
    
    //método que recebe um nome, procura o atleta com o nome
    //e remove da lista
    public void removeAtleta(String nome){
        boolean removido = false;
        //procurar o atleta com esse nome
        for(int i=0; i<atletas.size(); i++){
            Atleta a = atletas.get(i);
            if(a.getNome().equals(nome)){ //comparando o nome
                atletas.remove(a);
                removido = true;                       
                break;
            }
        }
        if(removido)
            System.out.println("Atleta Removido!");
        else 
            System.out.printf("Atleta %s não encontrado!\n", nome);
    }
    
    public void imprimir(){
        System.out.printf("Time: %s\n", this.nome);
        System.out.printf("Técnico: %s\n", this.nomeTéc);
        System.out.printf("Criação: %d\n", this.anoCriação);
        System.out.printf("Atletas (%d): \n", atletas.size());
        for(int i=0; i<atletas.size(); i++){
            Atleta a = atletas.get(i);
            System.out.printf("\t%s - %s - %.2f\n", 
                    a.getNome(), a.getFunção(), a.getAltura());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeTéc() {
        return nomeTéc;
    }

    public void setNomeTéc(String nomeTéc) {
        this.nomeTéc = nomeTéc;
    }

    public int getAnoCriação() {
        return anoCriação;
    }

    public void setAnoCriação(int anoCriação) {
        this.anoCriação = anoCriação;
    }
    
    
}