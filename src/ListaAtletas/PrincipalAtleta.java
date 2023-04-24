package ListaAtletas;

import java.util.ArrayList;

public class PrincipalAtleta {
    public static void main(String[] args) {
        
        ArrayList<Atleta> listaAtletas = new ArrayList<>();
        
        Atleta a1 = new Atleta("Dudu", "Atacante", 1.52f);
        Atleta a2 = new Atleta("Usain Bolt", "Corredor", 1.95f);
                
        listaAtletas.add(a1);
        listaAtletas.add(a2);
        listaAtletas.add(new Atleta("Rony", "Atacante", 1.68f));
        
        //Procurar o Rody na lista e retornar a referencia para o Rony
        Atleta rony = null;
        for(int i=0; i<listaAtletas.size(); i++){
            Atleta a = listaAtletas.get(i);
            if(a.getNome().equals("Rony"))
                rony = a;
            break;
        }
        
        listaAtletas.remove(rony);
        
        for(int i=0; i<listaAtletas.size(); i++){
            Atleta a = listaAtletas.get(i);
            System.out.println(a.getNome());            
        }
        
        
        //imprimir os nomes dos atletas da lista
    }
}
