package com;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import business.ContoCorrenteDao;
import business.ContoCorrenteDaoImpl;


@Path("/conto")
public class CcRest {
	private static ContoCorrenteDao contoDao=new ContoCorrenteDaoImpl();
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserisciContoCorrente(ContoCorrente cc) {
		ContoCorrente ccNew=contoDao.inserisci(cc);
		return Response.status(201).entity(ccNew).build();
		}
	
	@DELETE
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteCc(@QueryParam("iban") String iban) {
		String response="contocorrente rimosso";
		contoDao.deleteCc(iban);
		return Response.status(201).entity(response).build();
		}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateCC(ContoCorrente cc) {
		ContoCorrente contoNew=contoDao.updateCc(cc);
		return Response.status(201).entity(contoNew).build();
		}
	
	@POST
	@Path("/versamento")
	@Produces(MediaType.APPLICATION_JSON)
	public Response versamento(@QueryParam("iban") String iban, @QueryParam("versamento") double versamento) {
		ContoCorrente contoNew=contoDao.versamento(iban,versamento);
		String mov= "versamento";
		contoDao.listaMovimenti(contoNew, mov);
		return Response.status(201).entity(contoNew).build();
		}
	
	@POST
	@Path("/preleva")
	@Produces(MediaType.APPLICATION_JSON)
	public Response preleva(@QueryParam("iban") String iban, @QueryParam("versamento") double prelievo) {
		ContoCorrente contoNew=contoDao.versamento(iban,prelievo);
		return Response.status(201).entity(contoNew.getSaldo()).build();
	}
	
	
	
}


