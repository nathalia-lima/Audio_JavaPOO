package com.alura.modelos;

public class Preferidas {
    public void inclui (Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " Musica sucesso");
        } else {
            System.out.println(audio.getTitulo() + " Não é tão ouvida");
        }
    }
}
