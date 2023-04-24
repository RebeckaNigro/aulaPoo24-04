package ListaAtletas;

import java.util.ArrayList;

public class Time {
    private String nome;
    private String nomeT�c;
    private int anoCria��o;
    private ArrayList<Atleta> atletas;   
    
    public Time(String nome, String nomeT�c, int anoCria��o) {
        this.nome = nome;
        this.nomeT�c = nomeT�c;
        this.anoCria��o = anoCria��o;
        atletas = new ArrayList<>();
    }
    //m�todo que recebe um atleta e adiciona na lista
    public void adicionaAtleta(Atleta a){
        atletas.add(a);
    }
    
    //m�todo que recebe um nome, procura o atleta com o nome
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
            System.out.printf("Atleta %s n�o encontrado!\n", nome);
    }
    
    public void imprimir(){
        System.out.printf("Time: %s\n", this.nome);
        System.out.printf("T�cnico: %s\n", this.nomeT�c);
        System.out.printf("Cria��o: %d\n", this.anoCria��o);
        System.out.printf("Atletas (%d): \n", atletas.size());
        for(int i=0; i<atletas.size(); i++){
            Atleta a = atletas.get(i);
            System.out.printf("\t%s - %s - %.2f\n", 
                    a.getNome(), a.getFun��o(), a.getAltura());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeT�c() {
        return nomeT�c;
    }

    public void setNomeT�c(String nomeT�c) {
        this.nomeT�c = nomeT�c;
    }

    public int getAnoCria��o() {
        return anoCria��o;
    }

    public void setAnoCria��o(int anoCria��o) {
        this.anoCria��o = anoCria��o;
    }
    
    
}