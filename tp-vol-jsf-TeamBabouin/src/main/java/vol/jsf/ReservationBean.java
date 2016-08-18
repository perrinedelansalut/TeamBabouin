

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import banque.dao.ClientDao;
import banque.model.Civilite;
import banque.model.Client;
import vol.model.Reservation;
import vol.model.dao.ReservationDao;

@Component
@Scope("request")
public class ReservationBean {

	@Autowired
	private ReservationDao reservationDao;

	private Long reservationId = null;

	private Reservation reservation = new Reservation();

	public List<Reservation> getClients() {
		return clientDao.findAll();
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Client getSelectedClient() {
		return selectedClient;
	}

	public void setSelectedClient(Client selectedClient) {
		this.selectedClient = selectedClient;
	}

	public EtatReservation[] getEtatReservation() {
		return EtatReservation.values();
	}

	public String add() {
		return "reservationEdit";
	}

	public String edit() {
		this.reservation = reservationDao.find(reservationId);

		return "reservationEdit";
	}

	public String save() {
		if (reservation.getIdRes() != null) {
			reservationDao.update(reservation);
		} else {
			reservationDao.create(reservation);
		}

		return "reservation";
	}

	public String delete() {
		reservationDao.delete(reservationDao.find(reservationId));

		return "reservation";
	}
}
