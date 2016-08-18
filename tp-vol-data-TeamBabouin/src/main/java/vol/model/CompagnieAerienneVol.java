package vol.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class CompagnieAerienneVol {

	private CompagnieAerienneVolId id;
	private int version;
	private String numero;
	private Boolean ouvert;

	public CompagnieAerienneVol() {
		super();
	}

	public CompagnieAerienneVol(CompagnieAerienne compagnieAerienne, Vol vol) {
		super();
		this.id = new CompagnieAerienneVolId(compagnieAerienne, vol);
	}

	
	@EmbeddedId
	public CompagnieAerienneVolId getId() {
		return id;
	}

	public void setId(CompagnieAerienneVolId id) {
		this.id = id;
	}

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Size(min=2, max=100, message="{compagnieAerienneVol.numero.error.size}")
	@Column(length = 100)
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@NotNull(message="{compagnieAerienneVol.ouvert.error.notNull}")
	public Boolean getOuvert() {
		return ouvert;
	}

	public void setOuvert(Boolean ouvert) {
		this.ouvert = ouvert;
	}

	
	/*
	 * @Override public String toString() { return
	 * "CompagnieAerienneVol [ compagnieAerienne=" + compagnieAerienne +
	 * ", vol=" + vol + ", numero=" + numero + ", ouvert=" + ouvert + "]"; }
	 */

}
