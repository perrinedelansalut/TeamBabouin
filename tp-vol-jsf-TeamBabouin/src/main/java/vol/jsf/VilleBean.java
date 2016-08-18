package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.Ville;
import vol.model.dao.VilleDao;



@Component
@Scope("request")
public class VilleBean {
	
	@Autowired
	private VilleDao villeDao;
	private Integer villeId = null;
	private Ville ville = new Ville();
	
	public List<Ville> getVilles() {
		return villeDao.findAll();
	}
	
	

	public String add() {
		this.ville = new Ville();
		return "villeEdit";
	}

	public String save() {
		if (ville.getIdVil() != null) {
			villeDao.update(ville);
		} else {
			villeDao.create(ville);
		}
		return "ville";
	}

	public String edit() {
		this.ville = villeDao.find(villeId);
		return "villeEdit";
	}

	public String delete() {
		villeDao.delete(villeDao.find(villeId));
		return "ville";
	}

}
