package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.Passager;
import vol.model.dao.PassagerDao;

@Component
@Scope("request")
public class PassagerBean {

	@Autowired
	private PassagerDao PassagerDao;
	private Integer PassagerId = null;
	private Passager Passager = new Passager();
	
	
	public List<Passager> getPassagers() {
		return PassagerDao.findAll();
	}

	public PassagerDao getPassagerDao() {
		return PassagerDao;
	}

	public void setPassagerDao(PassagerDao PassagerDao) {
		this.PassagerDao = PassagerDao;
	}

	public Integer getPassagerId() {
		return PassagerId;
	}

	public void setPassagerId(Integer PassagerId) {
		this.PassagerId = PassagerId;
	}

	public String add() {
		this.Passager = new Passager();
		return "PassagerEdit";
	}

	public String save() {
		if (Passager.getIdPas() != null) {
			PassagerDao.update(Passager);
		} else {
			PassagerDao.create(Passager);
		}
		return "Passager";
	}

	public String edit() {
		this.Passager = PassagerDao.find(PassagerId);
		return "PassagerEdit";
	}

	public String delete() {
		PassagerDao.delete(PassagerDao.find(PassagerId));
		return "Passager";
	}
}
