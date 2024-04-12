package com.juanbasdel.categorias.especies;

import com.juanbasdel.categorias.Mamifero;

abstract public class Felino extends Mamifero {

    protected float tamanoGarras;
    protected float velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, float velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public float getVelocidad() {
        return velocidad;
    }
}
