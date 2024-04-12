package com.juanbasdel.categorias.especies.tipos;

import com.juanbasdel.categorias.especies.Felino;

public class Guepardo extends Felino {
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, float velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
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
