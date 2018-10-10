package com.example.alex.ejemplosadapter.modelo;

// com.example.alex.ejemplosadapter.Alarma;

public class AlarmaModelo  {
    private String hora;
    private boolean activo;

    public AlarmaModelo(String hora, boolean activo) {
        this.hora = hora;
        this.activo = activo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
