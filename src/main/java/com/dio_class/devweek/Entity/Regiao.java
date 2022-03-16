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

    @Column(name = "total")
    private Long total;

    public Regiao(Long id, String regiao, Long total) {
        this.id = id;
        this.regiao = regiao;
        this.total = total;
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
