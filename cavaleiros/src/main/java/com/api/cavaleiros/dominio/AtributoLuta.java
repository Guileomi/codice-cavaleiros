package com.api.cavaleiros.dominio;

import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AtributoLuta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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

    public AtributoLuta() {

    }

    public AtributoLuta(Integer id, int nivelCriticoFisico, int resistenciaCriticoFisico, int perfuracaoFisico,
                        int perfuracaoCosmico, double resistenciaDanoFisico, double resistenciaDanoCosmico,
                        double danoCosmico, double efeitoCriticoFisico, double criticoFisicoBasico, double rouboVida,
                        double acertoStatus, double resistenciaStatus, double cura, double reflexoDano) {
        this.id = id;
        this.nivelCriticoFisico = nivelCriticoFisico;
        this.resistenciaCriticoFisico = resistenciaCriticoFisico;
        this.perfuracaoFisico = perfuracaoFisico;
        this.perfuracaoCosmico = perfuracaoCosmico;
        this.resistenciaDanoFisico = resistenciaDanoFisico;
        this.resistenciaDanoCosmico = resistenciaDanoCosmico;
        this.danoCosmico = danoCosmico;
        this.efeitoCriticoFisico = efeitoCriticoFisico;
        this.criticoFisicoBasico = criticoFisicoBasico;
        this.rouboVida = rouboVida;
        this.acertoStatus = acertoStatus;
        this.resistenciaStatus = resistenciaStatus;
        this.cura = cura;
        this.reflexoDano = reflexoDano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNivelCriticoFisico() {
        return nivelCriticoFisico;
    }

    public void setNivelCriticoFisico(int nivelCriticoFisico) {
        this.nivelCriticoFisico = nivelCriticoFisico;
    }

    public int getResistenciaCriticoFisico() {
        return resistenciaCriticoFisico;
    }

    public void setResistenciaCriticoFisico(int resistenciaCriticoFisico) {
        this.resistenciaCriticoFisico = resistenciaCriticoFisico;
    }

    public int getPerfuracaoFisico() {
        return perfuracaoFisico;
    }

    public void setPerfuracaoFisico(int perfuracaoFisico) {
        this.perfuracaoFisico = perfuracaoFisico;
    }

    public int getPerfuracaoCosmico() {
        return perfuracaoCosmico;
    }

    public void setPerfuracaoCosmico(int perfuracaoCosmico) {
        this.perfuracaoCosmico = perfuracaoCosmico;
    }

    public double getResistenciaDanoFisico() {
        return resistenciaDanoFisico;
    }

    public void setResistenciaDanoFisico(double resistenciaDanoFisico) {
        this.resistenciaDanoFisico = resistenciaDanoFisico;
    }

    public double getResistenciaDanoCosmico() {
        return resistenciaDanoCosmico;
    }

    public void setResistenciaDanoCosmico(double resistenciaDanoCosmico) {
        this.resistenciaDanoCosmico = resistenciaDanoCosmico;
    }

    public double getDanoCosmico() {
        return danoCosmico;
    }

    public void setDanoCosmico(double danoCosmico) {
        this.danoCosmico = danoCosmico;
    }

    public double getEfeitoCriticoFisico() {
        return efeitoCriticoFisico;
    }

    public void setEfeitoCriticoFisico(double efeitoCriticoFisico) {
        this.efeitoCriticoFisico = efeitoCriticoFisico;
    }

    public double getCriticoFisicoBasico() {
        return criticoFisicoBasico;
    }

    public void setCriticoFisicoBasico(double criticoFisicoBasico) {
        this.criticoFisicoBasico = criticoFisicoBasico;
    }

    public double getRouboVida() {
        return rouboVida;
    }

    public void setRouboVida(double rouboVida) {
        this.rouboVida = rouboVida;
    }

    public double getAcertoStatus() {
        return acertoStatus;
    }

    public void setAcertoStatus(double acertoStatus) {
        this.acertoStatus = acertoStatus;
    }

    public double getResistenciaStatus() {
        return resistenciaStatus;
    }

    public void setResistenciaStatus(double resistenciaStatus) {
        this.resistenciaStatus = resistenciaStatus;
    }

    public double getCura() {
        return cura;
    }

    public void setCura(double cura) {
        this.cura = cura;
    }

    public double getReflexoDano() {
        return reflexoDano;
    }

    public void setReflexoDano(double reflexoDano) {
        this.reflexoDano = reflexoDano;
    }
}
