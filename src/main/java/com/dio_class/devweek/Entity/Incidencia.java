package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class Incidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "Regiao_id")
    private Integer regiaoId;

    @Column(name = "Mes")
    private Integer mes;

    @Column(name = "Faixa_id")
    private Long faixaId;

    @Column(name = "Qnt_exames")
    private Long qntExames;

    public Incidencia(Long id, Integer regiaoId, Integer mes, Long faixaId, Long qntExames) {
        this.id = id;
        this.regiaoId = regiaoId;
        this.mes = mes;
        this.faixaId = faixaId;
        this.qntExames = qntExames;
    }

    public Incidencia() {
    }

    public Long getId() {
        return id;
    }

    public Integer getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(Integer regiaoId) {
        this.regiaoId = regiaoId;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Long getFaixaId() {
        return faixaId;
    }

    public void setFaixaId(Long faixaId) {
        this.faixaId = faixaId;
    }

    public Long getQntExames() {
        return qntExames;
    }

    public void setQntExames(Long qntExames) {
        this.qntExames = qntExames;
    }
}
