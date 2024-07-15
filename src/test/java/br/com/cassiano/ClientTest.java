package br.com.cassiano;

import org.junit.Assert;
import org.junit.Test;

import br.com.cassiano.dao.ClientDAOMock;
import br.com.cassiano.dao.IClientDAO;
import br.com.cassiano.domain.Client;
import br.com.cassiano.services.ClientService;
import br.com.cassiano.services.IClientService;

public class ClientTest {
	
	private IClientService clientService;
	
	public ClientTest() {
		IClientDAO clientDAO = new ClientDAOMock();
		clientService = new ClientService(clientDAO);
	}
	
	@Test
	public void searchClient() {
		Client client = new Client();
		
		client.setCpf("1234567890");
		client.setName("Nilmar");
		client.setCity("São Paulo");
		client.setAddress("Rua 9");
		client.setNumber(9);
		client.setState("RS");
		client.setPhoneNumber(11999999999L);
		
		clientService.save(client);
		Client searchedClient = clientService.searchByCpf(client.getCpf());
		
		Assert.assertNotNull(searchedClient);
	}

}
