package com.api.codicecavaleiros.models;

import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TB_CAVALEIROS")
public class Cavaleiro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(notes ="Nome do cavaleiros")
    private String nome;
    @ApiModelProperty(notes ="DPS, Curandeira, Controle, Tanque e etc...")
    private String perfil;
    @ApiModelProperty(notes ="PV = Pontos de vida")
    private int pv;
    @ApiModelProperty(notes ="Ataque fisico")
    private int ataqueFisico;
    @ApiModelProperty(notes ="Ataque cosmico")
    private int ataqueCosmico;
    @ApiModelProperty(notes ="Defesa fisica")
    private int defesaFisica;
    @ApiModelProperty(notes ="Defesa cosmica")
    private int defesaCosmica;
    @ApiModelProperty(notes ="Velocidade")
    private int velocidade;
    @ApiModelProperty(notes ="Nivel critico fisico")
    private int nivelCriticoFisico;
    @ApiModelProperty(notes ="Resistencia critico fisico")
    private int resistenciaCriticoFisico;
    @ApiModelProperty(notes ="Perfuração fisica")
    private int perfuracaoFisico;
    @ApiModelProperty(notes ="Perfuração cosmica")
    private int perfuracaoCosmico;
    @ApiModelProperty(notes ="Resistencia a dano fisico")
    private double resistenciaDanoFisico;
    @ApiModelProperty(notes ="Resistencia a dano cosmico")
    private double resistenciaDanoCosmico;
    @ApiModelProperty(notes ="Dano cosmico")
    private double danoCosmico;
    @ApiModelProperty(notes ="Efeito critico fisico")
    private double efeitoCriticoFisico;
    @ApiModelProperty(notes ="Critico fisico basico")
    private double criticoFisicoBasico;
    @ApiModelProperty(notes ="Roubo de vida")
    private double rouboVida;
    @ApiModelProperty(notes ="Acerto de Status")
    private double acertoStatus;
    @ApiModelProperty(notes ="Resistencia de Status")
    private double resistenciaStatus;
    @ApiModelProperty(notes ="Cura")
    private double cura;
    @ApiModelProperty(notes ="Reflexo de dano")
    private double reflexoDano;



}
