package com.dio_class.devweek.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FaixaEtaria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id", nullable = false)
    private Long id;

    @Column(name = "Faixa_i")
    private Long faixaI;

    @Column(name = "Faixa_n")
    private Long faixaN;

    @Column(name = "Descricao")
    private String descricao;

    public FaixaEtaria(Long id, Long faixaI, Long faixaN, String descricao) {
        this.id = id;
        this.faixaI = faixaI;
        this.faixaN = faixaN;
        this.descricao = descricao;
    }

    public FaixaEtaria() {
    }

    public Long getId() {
        return id;
    }

    public Long getFaixaI() {
        return faixaI;
    }

    public void setFaixaI(Long faixaI) {
        this.faixaI = faixaI;
    }

    public Long getFaixaN() {
        return faixaN;
    }

    public void setFaixaN(Long faixaN) {
        this.faixaN = faixaN;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
