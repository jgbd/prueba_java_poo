package com.juanbasdel.categorias.especies;

import com.juanbasdel.categorias.Mamifero;

abstract public class Canino extends Mamifero {

    protected String color;
    protected float tamanocolmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanocolmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanocolmillos = tamanocolmillos;
    }

    public String getColor() {
        return color;
    }
    public float getTamanocolmillos() {
        return tamanocolmillos;
    }
}
