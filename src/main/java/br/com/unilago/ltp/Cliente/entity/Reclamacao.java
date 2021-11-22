package br.com.unilago.ltp.Cliente.entity;


import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity

public class Reclamacao extends PanacheEntity{

    public String Titulo;
    
    public String Status_Reclamacao;

    public Date data_Reclamacao;

    public int cliente_id;

    public int nota;

    public int empresa_id;
    
    public String descricao;

    
    public static List<Reclamacao> listByUf(String Titulo){
        return find("titulo", Titulo).list();
    }

}
