package com.api.cavaleiros.requisicao;

public class CavaleiroNovaForcaRequest {

    private Integer id;
    private Double forcaAtualizada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getForcaAtualizada() {
        return forcaAtualizada;
    }

    public void setForcaAtualizada(Double forcaAtualizada) {
        this.forcaAtualizada = forcaAtualizada;
    }
}
