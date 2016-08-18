package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.EtatReservation;
import vol.model.Reservation;
import vol.model.dao.ReservationDao;   

@Component
@Scope("request")
public class ReservationBean {   
     
	@Autowired
	private ReservationDao reservationDao;

	private Integer reservationId = null;  

	public Integer getReservationId() {
		return reservationId;
	}  

	public ReservationDao getReservationDao() {
		return reservationDao;
	}
 
	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
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

	private Reservation reservation = new Reservation();

	public List<Reservation> getReservations() {
		return reservationDao.findAll();
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

