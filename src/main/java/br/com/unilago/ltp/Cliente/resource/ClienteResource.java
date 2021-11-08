package br.com.unilago.ltp.Cliente.resource;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import br.com.unilago.ltp.Cliente.entity.Cliente;

@Path("/cliente")
public class ClienteResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> getAll(){
        return Cliente.listAll();
    }


    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Cliente cliente){
        cliente.persist();
        return Response.status(Status.CREATED).entity(cliente).build();
    }
    
}

