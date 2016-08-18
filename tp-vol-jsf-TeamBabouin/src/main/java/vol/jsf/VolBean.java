package vol.jsf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import vol.model.Vol;
import vol.model.dao.VolDao;

@Component
@Scope("request")
public class VolBean {
	@Autowired
	private VolDao volDao;

	private Integer volId = null;  

	public Integer getVolId() {
		return volId;
	}  

	public VolDao getVolDao() {
		return volDao;
	}
 
	public void setVolDao(VolDao volDao) {
		this.volDao = volDao;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public void setVolId(Integer volId) {
		this.volId = volId;
	}

	private Vol vol = new Vol();

	public List<Vol> getVols() {
		return volDao.findAll();
	}

	public String add() {
		return "volEdit";
	}

	public String edit() {
		this.vol = volDao.find(volId);

		return "volEdit";
	}
    
	public String save() { 
		if (vol.getIdVol() != null) {
			volDao.update(vol);
		} else {
			volDao.create(vol);
		}                
       
		return "vol";  
	}     
     
	public String delete() {
		volDao.delete(volDao.find(volId));

		return "vol"; 
	} 

}
