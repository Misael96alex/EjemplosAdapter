package com.example.alex.ejemplosadapter.modelo;

public class ReproductorModelo {
    private String cancion;
    private String artista;

    public ReproductorModelo(String cancion, String artista) {
        this.cancion = cancion;
        this.artista = artista;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
