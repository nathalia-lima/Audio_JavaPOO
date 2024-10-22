package com.alura.main;

import com.alura.modelos.Music;
import com.alura.modelos.Podcast;
import com.alura.modelos.Preferidas;

public class Main {
    public static void main(String[] args) {
        Music musica = new Music();
        musica.setTitulo("Equestria Girls");
        musica.setCantor("Twilight");

        for (int i = 0; i < 100; i++) {
            musica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Não Inviabilize");
        podcast.setHost("Déia Freitas");

        for (int i = 0; i < 100; i++) {
            musica.reproduz();
        }
        for (int i = 0; i < 100; i++) {
            musica.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);



    }
}