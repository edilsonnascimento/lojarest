package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Carrinho;
import br.com.alura.loja.modelo.Projeto;

public class ProjetoTest {
	
	HttpServer server;
	
	@Before
	public void startServidor() {
		this.server = Servidor.inicializaServidor();
	}
	
	@After
	public void mataServidor() {
		System.out.println("SERVIDOR PARADO ...");
		server.stop();
	}
	
	@Test
	public void testaQueAConexaoComOServidorNoPathProjetosFuncina() {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		Projeto projeto = target.path("/projetos/1").request().get(Projeto.class);
		Assert.assertEquals("Minha loja", projeto.getNome());
	}

}
