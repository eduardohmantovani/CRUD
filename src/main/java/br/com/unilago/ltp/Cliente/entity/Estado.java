package br.com.unilago.ltp.Cliente.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
public class Estado extends PanacheEntityBase{

    @Id
    public String uf;

    public String descricao;
    
}