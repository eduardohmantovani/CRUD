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
import br.com.unilago.ltp.Cliente.entity.Empresa;


@Path("/empresa")
public class EmpresaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Empresa> getAll(){
        return Empresa.listAll();
    }
    
    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Response create(Empresa empresa){
        empresa.persist();
        return Response.status(Status.CREATED).entity(empresa).build();
    }


}
