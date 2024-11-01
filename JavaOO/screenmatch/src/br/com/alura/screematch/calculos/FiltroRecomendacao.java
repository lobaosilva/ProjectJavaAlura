package br.com.alura.screematch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel clasificavel) {
        if (clasificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (clasificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
