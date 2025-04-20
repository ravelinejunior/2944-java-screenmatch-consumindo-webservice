package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        if (titulo instanceof Filme filme) {
            System.out.println("Adicionando filme " + filme.getNome());
        } else if (titulo instanceof Serie serie) {
            System.out.println("Adicionando série " + serie.getNome());
        }
        if (titulo.getDuracaoEmMinutos().length() > 4) {
            this.tempoTotal += Integer.parseInt(titulo.getDuracaoEmMinutos().substring(0, 4));
        } else {
            this.tempoTotal += Integer.parseInt(titulo.getDuracaoEmMinutos());
        }
    }
}
