package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id", nullable = false)
    private Long id;

    @Column(name = "regiao")
    private String regiao;

    @Column(name = "qnt_exames")
    private Long qntExames;

    public Regiao(Long id, String regiao, Long qntExames) {
        this.id = id;
        this.regiao = regiao;
        this.qntExames = qntExames;
    }

    public Regiao() {
    }

    public Long getId() {
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Long getQntExames() {
        return qntExames;
    }

    public void setQntExames(Long qntExames) {
        this.qntExames = qntExames;
    }
}
