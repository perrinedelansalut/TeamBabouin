package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.Client;
import vol.model.EtatReservation;
import vol.model.Passager;
import vol.model.Reservation;
import vol.model.dao.ClientDao;
import vol.model.dao.PassagerDao;
import vol.model.dao.ReservationDao;

@Component
@Scope("request")
public class ReservationBean {

	@Autowired
	private ReservationDao reservationDao;
	@Autowired
	private PassagerDao passagerDao;
	@Autowired
	private ClientDao clientDao;

	private Reservation reservation = new Reservation();

	private Integer reservationId = null;
	private Integer clientId = null;

	public Integer getReservationId() {
		return reservationId;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	public List<Reservation> getReservations() {
		return reservationDao.findAll();
	}

	public EtatReservation[] getEtatReservation() {
		return EtatReservation.values();
	}

	public List<Passager> getPassagers() {
		return passagerDao.findAll();
	}

	public List<Client> getClients() {
		return clientDao.findAll();
	}

	public String add() {
		return "reservationEdit";
	}

	public String edit() {
		this.reservation = reservationDao.find(reservationId);
		if (this.reservation.getPassager() == null) {
			this.reservation.setPassager(new Passager());
		}
		if (this.reservation.getClient() != null) {
			this.clientId = this.reservation.getClient().getIdCli();
		}
		return "reservationEdit";
	}

	public String save() {
		if(clientId!=null) {
			Client client = clientDao.find(clientId);
			reservation.setClient(client);
		}
		
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
