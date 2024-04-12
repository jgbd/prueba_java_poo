package com.juanbasdel.categorias.especies.tipos;

import com.juanbasdel.categorias.especies.Felino;

public class Leon extends Felino {

    private int numManada;
    private float potenciaRugidoDecebel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, float velocidad, int numManada, float potenciaRugidoDecebel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecebel = potenciaRugidoDecebel;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
