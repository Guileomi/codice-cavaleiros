package com.api.codicecavaleiros.models;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "TB_COSMOS")
public class Cosmo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(notes ="Nome do cosmo")
    private String nome;
    @ApiModelProperty(notes ="Solar, Estelar, Lunar ou Principal")
    private String categoria;
    @ApiModelProperty(notes ="SS ou S")
    private String classe;
    @ApiModelProperty(notes ="Descrição do cosmo")
    private String descricao;
    @ApiModelProperty(notes = "Bonus de encaixe dos 3 cosmos iguais")
    private Double bonusTrio;
}
