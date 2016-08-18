package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.CompagnieAerienne;
import vol.model.CompagnieAerienneVol;
import vol.model.Vol;
import vol.model.dao.CompagnieAerienneDao;
import vol.model.dao.CompagnieAerienneVolDao;
import vol.model.dao.VolDao;

@Component
@Scope("request")
public class CompagnieAerienneVolBean {

	@Autowired
	private CompagnieAerienneVolDao compagnieAerienneVolDao;
	@Autowired
	private CompagnieAerienneDao compagnieAerienneDao;
	@Autowired
	private VolDao volDao;

	private Integer compagnieAerienneVolId;
	
	private CompagnieAerienneVol compagnieAerienneVol;

	private Vol vol = new Vol();
	private CompagnieAerienne compagnieAerienne = new CompagnieAerienne();

	
	
	public CompagnieAerienneVol getCompagnieAerienneVol() {
		return compagnieAerienneVol;
	}

	public void setCompagnieAerienneVol(CompagnieAerienneVol compagnieAerienneVol) {
		this.compagnieAerienneVol = compagnieAerienneVol;
	}

	public Integer getCompagnieAerienneVolId() {
		return compagnieAerienneVolId;
	}

	public void setCompagnieAerienneVolId(Integer compagnieAerienneVolId) {
		this.compagnieAerienneVolId = compagnieAerienneVolId;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}
	
	
	
	public List<CompagnieAerienneVol> getCompagnieAerienneVols() {
		return compagnieAerienneVolDao.findAll();
	}
	
	public List<Vol> getVols() {
		return volDao.findAll();
	}
	
	public List<CompagnieAerienne> getCompagnieAeriennes() {
		return compagnieAerienneDao.findAll();
	}
	
	public String add() {
		this.compagnieAerienneVol = new CompagnieAerienneVol();
		return "compagnieAerienneVolEdit";
	}

	public String save() {
		if (compagnieAerienneVol.getId() != null) {
			compagnieAerienneVolDao.update(compagnieAerienneVol);
		} else {
			compagnieAerienneVolDao.create(compagnieAerienneVol);
		}
		return "compagnieAerienne";
	}
	
	public String edit() {
		this.compagnieAerienneVol = compagnieAerienneVolDao.find(compagnieAerienneVolId);
		if(compagnieAerienneVol.getVol()==null){
			this.compagnieAerienneVol.setVol(new Vol());
		}
		
		if(compagnieAerienneVol.getCompagnieAerienne()==null){
			this.compagnieAerienneVol.setCompagnieAerienne(new CompagnieAerienne());;
		}
		return "compagnieAerienneVolEdit";
	}

	public String delete() {
		compagnieAerienneVolDao.delete(compagnieAerienneVolDao.find(compagnieAerienneVolId));
		return "compagnieAerienneVol"; 
	}

}
