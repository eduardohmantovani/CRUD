package br.com.unilago.ltp.Cliente.entity;

import java.util.List;
import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Empresa extends PanacheEntity{

    public String nome;

    public String cnpj;

    public String email;

    public String senha;

    public int cidade_id;

    public static List<Empresa> findByName(String nome){
        return find("nome", nome).list();
    }

}