package com.bootcampgft.start4java.abstraindobootcamp.entity;

import lombok.Data;

@Data
public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
