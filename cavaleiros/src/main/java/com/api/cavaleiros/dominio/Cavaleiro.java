package com.api.cavaleiros.dominio;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
public class Cavaleiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String variante;
    private String raridade;
    private boolean reparado;
    private boolean meta;
    @NotNull
    private String especialidade;
    @NotNull
    private Double ataque;
    @OneToOne(cascade = CascadeType.ALL)
    private AtributoBasico atributoBasico;
    @OneToOne(cascade = CascadeType.ALL)
    private AtributoLuta atributoLuta;

    @ManyToOne
    private DeusProtetor deusProtetor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public boolean isReparado() {
        return reparado;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    public boolean isMeta() {
        return meta;
    }

    public void setMeta(boolean meta) {
        this.meta = meta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public AtributoBasico getAtributoBasico() {
        return atributoBasico;
    }

    public void setAtributoBasico(AtributoBasico atributoBasico) {
        this.atributoBasico = atributoBasico;
    }

    public AtributoLuta getAtributoLuta() {
        return atributoLuta;
    }

    public void setAtributoLuta(AtributoLuta atributoLuta) {
        this.atributoLuta = atributoLuta;
    }

    public DeusProtetor getDeusProtetor() {
        return deusProtetor;
    }

    public void setDeusProtetor(DeusProtetor deusProtetor) {
        this.deusProtetor = deusProtetor;
    }
}
