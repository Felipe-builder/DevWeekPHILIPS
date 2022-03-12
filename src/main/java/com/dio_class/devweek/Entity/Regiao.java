package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String regiao;

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

    public void setId(Long id) {
        this.id = id;
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
