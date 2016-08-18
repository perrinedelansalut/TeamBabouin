package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.Client;
import vol.model.Titre;
import vol.model.dao.ClientDao;

@Component
@Scope("request")
public class ClientBean {

	@Autowired
	private ClientDao clientDao;

	private Integer clientId = null;

//	private Client selectedClient = new Client();

	public List<Client> getClients() {
		return clientDao.findAll();
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

//	public Client getSelectedClient() {
//		return selectedClient;
//	}
//
//	public void setSelectedClient(Client selectedClient) {
//		this.selectedClient = selectedClient;
//	}

	public Titre[] getTitres() {
		return Titre.values();
	}

	public String add() {
		return "clientEdit";
	}

//	public String edit() {
//		this.selectedClient = clientDao.find(clientId);
//
//		return "clientEdit";
//	}
//
//	public String save() {
//		if (selectedClient.getId() != null) {
//			clientDao.update(selectedClient);
//		} else {
//			clientDao.create(selectedClient);
//		}
//
//		return "client";
//	}

	public String delete() {
		clientDao.delete(clientDao.find(clientId));

		return "client";
	}
}
