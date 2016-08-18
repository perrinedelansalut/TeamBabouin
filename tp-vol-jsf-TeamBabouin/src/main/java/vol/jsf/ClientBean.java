package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.Client;
import vol.model.ClientEI;
import vol.model.ClientMoral;
import vol.model.ClientPhysique;
import vol.model.Titre;
import vol.model.dao.ClientDao;

@Component
@Scope("request")
public class ClientBean {

	@Autowired
	private ClientDao clientDao;

	private Integer clientId = null;

	private Client selectedClient;
	private Client selectedClientEI = new ClientEI();
	private Client selectedClientMoral = new ClientMoral();
	private Client selectedClientPhysique = new ClientPhysique();

	
	public Client getSelectedClient() {
		return selectedClient;
	}

	public void setSelectedClient(Client selectedClient) {
		this.selectedClient = selectedClient;
	}

	public Client getSelectedClientEI() {
		return selectedClientEI;
	}

	public void setSelectedClientEI(Client selectedClientEI) {
		this.selectedClientEI = selectedClientEI;
	}

	public Client getSelectedClientMoral() {
		return selectedClientMoral;
	}

	public void setSelectedClientMoral(Client selectedClientMoral) {
		this.selectedClientMoral = selectedClientMoral;
	}

	public Client getSelectedClientPhysique() {
		return selectedClientPhysique;
	}

	public void setSelectedClientPhysique(Client selectedClientPhysique) {
		this.selectedClientPhysique = selectedClientPhysique;
	}

	public List<Client> getClients() {
		return clientDao.findAll();
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Titre[] getTitres() {
		return Titre.values();
	}

	public String addEI() {
		
		return "clientEditEI";
	}
	
	public String addPhysique() {
		return "clientEditPhysique";
	}
	
	public String addMoral() {
		return "clientEditMoral";
	}

	public String edit() {
		
		this.selectedClient = clientDao.find(clientId);
		
		if (selectedClient.getTypeClient().equals("EI")) {
			selectedClientEI=selectedClient; return "clientEditEI";
		}
		
		else if (selectedClient.getTypeClient().equals("Physique")){
			selectedClientPhysique=selectedClient; return "clientEditPhysique";
		}
		
		else {
			selectedClientMoral=selectedClient; return "clientEditMoral";
		}

	}

	public String saveEI() {
		if (selectedClientEI.getIdCli() != null) {
			clientDao.update(selectedClientEI);
		} else {
			clientDao.create(selectedClientEI);
		}

		return "client";
	}
	
	public String savePhysique() {
		if (selectedClientPhysique.getIdCli() != null) {
			clientDao.update(selectedClientPhysique);
		} else {
			clientDao.create(selectedClientPhysique);
		}

		return "client";
	}
	
	public String saveMoral() {
		if (selectedClientMoral.getIdCli() != null) {
			clientDao.update(selectedClientMoral);
		} else {
			clientDao.create(selectedClientMoral);
		}

		return "client";
	}

	public String delete() {
		clientDao.delete(clientDao.find(clientId));

		return "client";
	}
}
