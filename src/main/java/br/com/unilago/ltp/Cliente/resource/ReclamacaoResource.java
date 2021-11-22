package br.com.unilago.ltp.Cliente.resource;

import java.util.List;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javax.ws.rs.core.Response.Status;
import br.com.unilago.ltp.Cliente.entity.Reclamacao;


@Path("/reclamacao")
public class ReclamacaoResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reclamacao> getAll(){          
       return Reclamacao.listAll();

    }
    
    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Response create(Reclamacao reclamacao){
        reclamacao.persist();
        return Response.status(Status.CREATED).entity(reclamacao).build();
    }
}
