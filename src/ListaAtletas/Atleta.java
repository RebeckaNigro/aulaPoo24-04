package ListaAtletas;

public class Atleta {
    private String nome;
    private String função;
    private float altura;

    public Atleta(String nome, String função, float altura) {
        this.nome = nome;
        this.função = função;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
