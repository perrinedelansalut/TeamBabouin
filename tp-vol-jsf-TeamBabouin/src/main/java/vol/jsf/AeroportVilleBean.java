package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.Aeroport;
import vol.model.AeroportVille;
import vol.model.Ville;
import vol.model.dao.AeroportDao;
import vol.model.dao.AeroportVilleDao;
import vol.model.dao.VilleDao;

@Component    
@Scope("request")
public class AeroportVilleBean {
	@Autowired
	private AeroportVilleDao aeroportVilleDao;
	@Autowired
	private VilleDao villeDao;
	@Autowired
	private AeroportDao aeroportDao;
	
	private Long aeroportVilleId = null;
	private AeroportVille aeroportVille = new AeroportVille();
	
	public List<AeroportVille> getAeroportVilles() {
		return aeroportVilleDao.findAll();
	}
	
	public List<Aeroport> getAeroports(){
		return aeroportDao.findAll();
	}
	
	public List<Ville> getVilles(){
		return villeDao.findAll();
	}
	
	public Long getAeroportVilleId() {
		return aeroportVilleId;
	}

	public void setAeroportVilletId(Long aeroportVilletId) {
		this.aeroportVilleId = aeroportVilletId;
	}

	public AeroportVille getAeroportVille() {
		return aeroportVille;
	}

	public void setAeroportVille(AeroportVille aeroportVille) {
		this.aeroportVille = aeroportVille;
	}

	public String add() {
		if(this.aeroportVille.getAeroport()==null){
			this.aeroportVille.setAeroport(new Aeroport());
		}
		if(this.aeroportVille.getVille()==null){
			this.aeroportVille.setVille(new Ville());
		}
		this.aeroportVille = new AeroportVille();
		return "aeroportVilleEdit";
	}

	public String save() {
		if (aeroportVille.getId() != null) {
			aeroportVilleDao.update(aeroportVille);
		} else {
			aeroportVilleDao.create(aeroportVille);
		}
		return "aeroportVille";
	}

	public String edit() {
		this.aeroportVille = aeroportVilleDao.find(aeroportVilleId);
		return "aeroportVilleEdit";
	}

	public String delete() {
		aeroportVilleDao.delete(aeroportVilleDao.find(aeroportVilleId));
		return "aeroportVille"; 
	}

}
