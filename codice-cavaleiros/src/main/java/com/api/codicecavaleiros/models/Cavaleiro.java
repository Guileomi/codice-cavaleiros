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

    public Cavaleiro(){

    }

    public Cavaleiro(String nome, String perfil, int pv, int ataqueFisico, int ataqueCosmico, int defesaFisica, int defesaCosmica, int velocidade, int nivelCriticoFisico, int resistenciaCriticoFisico, int perfuracaoFisico, int perfuracaoCosmico, double resistenciaDanoFisico, double resistenciaDanoCosmico, double danoCosmico, double efeitoCriticoFisico, double criticoFisicoBasico, double rouboVida, double acertoStatus, double resistenciaStatus, double cura, double reflexoDano) {
        this.nome = nome;
        this.perfil = perfil;
        this.pv = pv;
        this.ataqueFisico = ataqueFisico;
        this.ataqueCosmico = ataqueCosmico;
        this.defesaFisica = defesaFisica;
        this.defesaCosmica = defesaCosmica;
        this.velocidade = velocidade;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getAtaqueFisico() {
        return ataqueFisico;
    }

    public void setAtaqueFisico(int ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    public int getAtaqueCosmico() {
        return ataqueCosmico;
    }

    public void setAtaqueCosmico(int ataqueCosmico) {
        this.ataqueCosmico = ataqueCosmico;
    }

    public int getDefesaFisica() {
        return defesaFisica;
    }

    public void setDefesaFisica(int defesaFisica) {
        this.defesaFisica = defesaFisica;
    }

    public int getDefesaCosmica() {
        return defesaCosmica;
    }

    public void setDefesaCosmica(int defesaCosmica) {
        this.defesaCosmica = defesaCosmica;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
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
