package ListaAtletas;

public class PrincipalTime {
    public static void main(String[] args) {
        
        Time t = new Time("Maringá", "Sr. Jorge", 1938);
        
        t.adicionaAtleta(new Atleta("Dudu", "ATA", 1.52f));
        t.adicionaAtleta(new Atleta("Dunga", "MC", 1.82f));
        t.adicionaAtleta(new Atleta("Romário", "ATA", 1.53f));

//        t.removeAtleta("Dunga");

        t.getAtleta(0).setTime(t);
        t.removeAtleta("Dunga");
        System.out.println(t.getAtleta(0).getTime().getNome());

        
        t.imprimir();
    }
}
