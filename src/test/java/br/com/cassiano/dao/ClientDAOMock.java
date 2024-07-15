package br.com.cassiano.dao;

import br.com.cassiano.domain.Client;

public class ClientDAOMock implements IClientDAO {

	@Override
	public void save(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public Client searchByCpf(String cpf) {
		Client client = new Client();
		client.setCpf(cpf);
		return client;
		
	}

}
