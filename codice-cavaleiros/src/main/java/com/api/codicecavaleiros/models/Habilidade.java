package com.api.codicecavaleiros.models;

import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TB_HABILIDADES")
public class Habilidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(notes ="Nome da habilidade")
    private String nome;
    @ApiModelProperty(notes ="Basico, Especial, Ataque, Controle")
    private String categoria;
    @ApiModelProperty(notes ="1, 2, 3, 4 e 5")
    private String nivel;
    @ApiModelProperty(notes ="Descrição da habilidade")
    private String descricao;

    //Isso pode ir para outro lugar
    @ApiModelProperty(notes = "Recomendação de minima")
    private String minimoRecomendavel;
    @ApiModelProperty(notes = "Recomendação de média")
    private String mediaRecomendavel;
    @ApiModelProperty(notes = "Recomendação de maxima")
    private String maximoRecomendavel;
}
