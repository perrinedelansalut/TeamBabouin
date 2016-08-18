package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.CompagnieAerienne;
import vol.model.dao.CompagnieAerienneDao;

@Component    
@Scope("request")
public class CompagnieAerienneBean {
	
	@Autowired
	private CompagnieAerienneDao compagnieAerienneDao;
	private Integer compagnieAerienneId = null;
	private CompagnieAerienne compagnieAerienne = new CompagnieAerienne();
	
	public List<CompagnieAerienne> getCompagnieAeriennes() {
		return compagnieAerienneDao.findAll();
	}
	
	

	public String add() {
		this.compagnieAerienne = new CompagnieAerienne();
		return "compagnieAerienneEdit";
	}

	public String save() {
		if (compagnieAerienne.getId() != null) {
			compagnieAerienneDao.update(compagnieAerienne);
		} else {
			compagnieAerienneDao.create(compagnieAerienne);
		}
		return "compagnieAerienne";
	}

	public CompagnieAerienneDao getCompagnieAerienneDao() {
		return compagnieAerienneDao;
	}
  


	public void setCompagnieAerienneDao(CompagnieAerienneDao compagnieAerienneDao) {
		this.compagnieAerienneDao = compagnieAerienneDao;
	}



	public Integer getCompagnieAerienneId() {
		return compagnieAerienneId;
	}



	public void setCompagnieAerienneId(Integer compagnieAerienneId) {
		this.compagnieAerienneId = compagnieAerienneId;
	}



	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}



	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}


 
	public String edit() {
		this.compagnieAerienne = compagnieAerienneDao.find(compagnieAerienneId);
		return "compagnieAerienneEdit";
	}

	public String delete() {
		compagnieAerienneDao.delete(compagnieAerienneDao.find(compagnieAerienneId));
		return "compagnieAerienne"; 
	}

}
