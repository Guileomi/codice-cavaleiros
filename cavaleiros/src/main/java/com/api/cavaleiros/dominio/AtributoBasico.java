package com.api.cavaleiros.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AtributoBasico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer pontosVida;

    private Integer ataqueCosmico;

    private Integer ataqueFisico;

    private Integer defesaCosmica;

    private Integer defesaFisica;

    private Integer velociade;

    public AtributoBasico() {

    }

    public AtributoBasico(Integer id, Integer pontosVida, Integer ataqueCosmico, Integer ataqueFisico, Integer defesaCosmica, Integer defesaFisica, Integer velociade) {
        this.id = id;
        this.pontosVida = pontosVida;
        this.ataqueCosmico = ataqueCosmico;
        this.ataqueFisico = ataqueFisico;
        this.defesaCosmica = defesaCosmica;
        this.defesaFisica = defesaFisica;
        this.velociade = velociade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(Integer pontosVida) {
        this.pontosVida = pontosVida;
    }

    public Integer getAtaqueCosmico() {
        return ataqueCosmico;
    }

    public void setAtaqueCosmico(Integer ataqueCosmico) {
        this.ataqueCosmico = ataqueCosmico;
    }

    public Integer getAtaqueFisico() {
        return ataqueFisico;
    }

    public void setAtaqueFisico(Integer ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    public Integer getDefesaCosmica() {
        return defesaCosmica;
    }

    public void setDefesaCosmica(Integer defesaCosmica) {
        this.defesaCosmica = defesaCosmica;
    }

    public Integer getDefesaFisica() {
        return defesaFisica;
    }

    public void setDefesaFisica(Integer defesaFisica) {
        this.defesaFisica = defesaFisica;
    }

    public Integer getVelociade() {
        return velociade;
    }

    public void setVelociade(Integer velociade) {
        this.velociade = velociade;
    }
}
