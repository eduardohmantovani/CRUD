package br.com.unilago.ltp.Cliente.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.unilago.ltp.Cliente.entity.Estado;

@Path("/estado")
public class EstadoResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Estado> getAll(){
        return Estado.list("order by uf asc");
    }
}
