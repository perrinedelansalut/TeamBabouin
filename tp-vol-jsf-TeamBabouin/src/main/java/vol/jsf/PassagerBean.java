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
	private PassagerDao passagerDao;
	private Integer PassagerId = null;
	private Passager passager = new Passager();
	
	public List<Passager> getPassagers() {
		return passagerDao.findAll();
	}
	
	public PassagerDao getPassagerDao() {
		return passagerDao;
	}

	public void setPassagerDao(PassagerDao passagerDao) {
		this.passagerDao = passagerDao;
	}

	public Integer getPassagerId() {
		return PassagerId;
	}

	public void setPassagerId(Integer passagerId) {
		PassagerId = passagerId;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public String add() {
		this.passager = new Passager();
		return "passagerEdit";
	}

	public String save() {
		if (passager.getIdPas() != null) {
			passagerDao.update(passager);
		} else {
			passagerDao.create(passager);
		}
		return "passager";
	}

	public String edit() {
		this.passager = passagerDao.find(PassagerId);
		return "passagerEdit";
	}

	public String delete() {
		passagerDao.delete(passagerDao.find(PassagerId));
		return "passager";
	}
}
