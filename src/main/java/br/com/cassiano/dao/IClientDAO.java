/**
 * 
 */
package br.com.cassiano.dao;

import br.com.cassiano.domain.Client;

/**
 * 
 */
public interface IClientDAO {

	void save(Client client);
	
	Client searchByCpf(String cpf);

}
