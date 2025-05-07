package org.example;

// Exemplo de um teste de como pode fazer busca de um objeto na lista
// e busca de um objeto com uma estrutura de indetização na pratica, usando ARRAY LIST e MAPAS HASH


import java.util.ArrayList;
import java.util.HashMap;

public class Analisador {

    public static final int TAMANHO = 10000;
    //TAM            TEMP
    //1000           1ms
    //10000          1ms
    //100000         1ms

    // O(n) = n --> crescimento linear da complexidade
    // O(n) = 1 --> independente do tamanho da sua coleção, seu tempo de busca é sempre constante

    // usando Mapas HASH
    public static void main(String[] args) {
        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        // vamos preencher o mapa
        for(int i = 1; i < TAMANHO; i ++){
            mapa.put(i, new Produto(i, "Produto "+i, i * 10.0));
        }

        int codigoAserEncontrado = TAMANHO;

        long ini, fim;

        ini = System.currentTimeMillis();
        for (int qtd = 0; qtd < 10000; qtd++){
            Produto p = mapa.get(codigoAserEncontrado);
        }

        fim = System.currentTimeMillis();
        System.out.println("Este algoritmo levou: "+(fim-ini)+ "ms");
    }

    // public static final int TAMANHO = 10000;
    // TAM             TEMPO
    //1000              62ms
    //10000            743ms
    //100000          17514ms

    /* usando ARRAY LIST

    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<Produto>();

        // vamos preencher a lista
        for (int i = 1; i <= TAMANHO; i ++){
            lista.add(new Produto(i, "Produto" +i, i * 10.0));
        }

        int codigoAserEncontrado = TAMANHO;

        long ini, fim;
        ini = System.currentTimeMillis();
        for (int qtd = 0; qtd < 10000; qtd++){
            for(Produto p: lista){
                if (p.getId() == codigoAserEncontrado){
                    break;
                }
            }
        }

        fim = System.currentTimeMillis();

        System.out.println("Este algoritmo levou: "+(fim-ini)+" ms");

    }
    */
}