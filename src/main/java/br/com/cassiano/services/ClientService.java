/**
 * 
 */
package br.com.cassiano.services;

import br.com.cassiano.dao.IClientDAO;
import br.com.cassiano.domain.Client;

/**
 * 
 */
public class ClientService implements IClientService {
	
	private IClientDAO clientDAO;
	
	public ClientService(IClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	@Override
	public void save(Client client) {
		clientDAO.save(client);

	}

	@Override
	public Client searchByCpf(String cpf) {
		return clientDAO.searchByCpf(cpf);
	}

}
