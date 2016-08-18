package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.Aeroport;
import vol.model.dao.AeroportDao;

@Component    
@Scope("request")
public class AeroportBean {
	@Autowired
	private AeroportDao aeroportDao;
	private Integer aeroportId = null;
	private Aeroport aeroport = new Aeroport();
	
	public List<Aeroport> getAeroports() {
		return aeroportDao.findAll();
	}
	
	

	public String add() {
		this.aeroport = new Aeroport();
		return "aeroportEdit";
	}

	public String save() {
		if (aeroport.getIdAer() != null) {
			aeroportDao.update(aeroport);
		} else {
			aeroportDao.create(aeroport);
		}
		return "aeroport";
	}

	public AeroportDao getAeroportDao() {
		return aeroportDao;
	}
  


	public void setAeroportDao(AeroportDao aeroportDao) {
		this.aeroportDao = aeroportDao;
	}



	public Integer getAeroportId() {
		return aeroportId;
	}



	public void setAeroportId(Integer aeroportId) {
		this.aeroportId = aeroportId;
	}



	public Aeroport getAeroport() {
		return aeroport;
	}



	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}


 
	public String edit() {
		this.aeroport = aeroportDao.find(aeroportId);
		return "aeroportEdit";
	}

	public String delete() {
		aeroportDao.delete(aeroportDao.find(aeroportId));
		return "aeroport"; 
	}

}
