package listas;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        
        //declarando e instanciando uma lista de nomes
        ArrayList<String> listaNomes = new ArrayList<>();
        
        listaNomes.add("João");
        listaNomes.add("Maria");
        listaNomes.add(1, "Pedro");
        listaNomes.add("Ana");
        listaNomes.add("João");

        //listaNomes.clear(); //Limpar a Lista               
        
        listaNomes.remove("Maria");
        
        System.out.println(listaNomes.indexOf("João"));
        
        //Percorrendo a Lista
        for(int i=0; i<listaNomes.size(); i++){
            String s = listaNomes.get(i);
            System.out.printf("[%d] - %s\n", i, s);
        }

        System.out.printf("Nº Elementos: %d\n", listaNomes.size());
        
    }
    
}
