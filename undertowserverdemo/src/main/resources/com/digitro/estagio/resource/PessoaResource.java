package com.digitro.estagio.resource;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.digitro.estagio.model.Pessoa;

@Path("pessoas")
public class PessoaResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pessoa> hello() throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(44325L);
		pessoa.setNome("Joãozinho");
		return Arrays.asList(pessoa);
	}
	
}
