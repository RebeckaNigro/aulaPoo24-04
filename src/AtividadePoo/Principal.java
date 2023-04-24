package AtividadePoo;

public class Principal {
    public static void main(String[] args) {

        Cidade  c = new Cidade("São Paulo",15000);
        Aluno  al = new Aluno("Pedro", "Rua Alvarez Cabral 12");
        Escola  e = new Escola("E. E. Paulo Freire","23432423434", "Av Afonso Pena");
        Bairro b = new Bairro("Santa Luzia");

        c.adicionaBairro(b);
        b.adicionaEscola(e);
        e.adicionaAlunos(al);




        c.imprimir();
        b.imprimir();
        e.imprimir();
        al.imprimir();
    }


}
