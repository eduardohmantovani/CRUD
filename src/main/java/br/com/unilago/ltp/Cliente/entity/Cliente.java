package br.com.unilago.ltp.Cliente.entity;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Cliente extends PanacheEntity{

    public String nome;

    public String cpf;

    public String email;

    public String senha;

    public int cidade;

 
}
