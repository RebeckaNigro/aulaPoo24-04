package ListaAtletas;

public class Atleta {
    private String nome;
    private String fun��o;
    private float altura;

    public Atleta(String nome, String fun��o, float altura) {
        this.nome = nome;
        this.fun��o = fun��o;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFun��o() {
        return fun��o;
    }

    public void setFun��o(String fun��o) {
        this.fun��o = fun��o;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
