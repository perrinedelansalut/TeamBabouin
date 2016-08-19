
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import vol.model.Adresse;
import vol.model.Aeroport;
import vol.model.Client;
import vol.model.ClientEI;
import vol.model.ClientMoral;
import vol.model.ClientPhysique;
import vol.model.CompagnieAerienne;
import vol.model.Escale;
import vol.model.EtatReservation;
import vol.model.Passager;
import vol.model.Reservation;
import vol.model.Titre;
import vol.model.Ville;
import vol.model.Vol;
import vol.model.dao.AeroportDao;
import vol.model.dao.ClientDao;
import vol.model.dao.CompagnieAerienneDao;
import vol.model.dao.EscaleDao;
import vol.model.dao.PassagerDao;
import vol.model.dao.ReservationDao;
import vol.model.dao.VilleDao;
import vol.model.dao.VolDao;

public class GenerateData {

	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	private static List<Reservation> listReservations;
	private static List<Passager> listPassager;
	private static List<Client> listClient;
	private static List<Ville> listVille;
	private static List<Aeroport> listAeroport;
	private static List<CompagnieAerienne> listCompagnieAerienne;
	private static List<Vol> listVol;
	private static List<Escale> listEscale;

	public static void main(String[] args) {

		ajoutPassager(50);
		ajoutClient(30);
		ajoutVille();
		ajoutAeroport();
		ajoutCompagnieAerienne();
		ajoutVol(50);
		ajoutEscale(20);
		ajoutReservation(35);
	}

	public static void ajoutPassager(int imax) {

		PassagerDao passagerDao = (PassagerDao) context.getBean("passagerDaoJpa");

		for (int i = 1; i <= imax; i++) {

			Passager passager = new Passager();
			RandomData data = new RandomData();

			passager.setNom(data.getNom());
			passager.setPrenom(data.getPrenom());
			passager.setAdresse(new Adresse(data.getRue(), data.getCodePostal(), data.getVille(), data.getPays()));

			passagerDao.create(passager);
		}

		listPassager = passagerDao.findAll();
	}

	public static void ajoutClient(int imax) {

		ClientDao clientDao = (ClientDao) context.getBean("clientDaoJpa");

		for (int i = 1; i <= imax; i++) {

			RandomData data = new RandomData();
			Client client = null;

			int rand = (int) (Math.random() * (100));
			if (rand > 50) {
				client = new ClientPhysique();
				((ClientPhysique) client).setPrenom(data.getPrenom());
			}

			if ((rand <= 50) && (rand > 20)) {
				client = new ClientMoral();
				((ClientMoral) client).setSiret((int) (Math.random() * (10100) + 1000));

			}
			if (rand <= 20) {
				client = new ClientEI();
				((ClientEI) client).setPrenom(data.getPrenom());

			}

			if (data.isSexe()) {
				if ((int) (Math.random() * (100)) <= 20) {
					client.setTitre(Titre.MLLE);
				} else {

					client.setTitre(Titre.MME);
				}
			} else {
				client.setTitre(Titre.M);
			}

			client.setNom(data.getNom());
			client.setAdresse(new Adresse(data.getRue(), data.getCodePostal(), data.getVille(), data.getPays()));
			client.setEmail(data.getEmail());
			client.setLog(data.getUsername(), data.getPassword(), data.isBooleen());
			client.setNumeroTel(data.getNumeroTel());
			client.setNumeroTel(data.getNumeroTel());

			clientDao.create(client);
		}

		listClient = clientDao.findAll();
	}

	public static void ajoutVille() {

		VilleDao villeDao = (VilleDao) context.getBean("villeDaoJpa");
		RandomData data = new RandomData();

		for (String v : data.getListVille()) {
			Ville ville = new Ville();
			ville.setNom(v);
			villeDao.create(ville);
		}

		listVille = villeDao.findAll();
	}

	public static void ajoutAeroport() {

		AeroportDao aeroportDao = (AeroportDao) context.getBean("aeroportDaoJpa");
		RandomData data = new RandomData();

		int i = 0;
		for (String v : data.getListVille()) {
			Aeroport aeroport = new Aeroport();
			aeroport.setNom("Aéroport " + v);
			aeroportDao.create(aeroport);

			if (i == 10) {
				break;
			}
			i++;
		}

		listAeroport = aeroportDao.findAll();
	}

	public static void ajoutCompagnieAerienne() {

		CompagnieAerienneDao compagnieAerienneDao = (CompagnieAerienneDao) context.getBean("compagnieAerienneDaoJpa");
		String listCompagnie[] = new String[] { "Air France", "Singapore Airlines", "Emirates", "Austrian Airlines",
				"Lufthansa", "Scandinavian Airlines", "Swiss International Air Lines" };

		int i = 0;
		for (String c : listCompagnie) {
			CompagnieAerienne compagnieAerienne = new CompagnieAerienne();
			compagnieAerienne.setNom(c);

			compagnieAerienneDao.create(compagnieAerienne);
		}

		listCompagnieAerienne = compagnieAerienneDao.findAll();
	}

	public static void ajoutVol(int imax) {

		VolDao volDao = (VolDao) context.getBean("volDaoJpa");

		for (int i = 1; i <= imax; i++) {

			RandomData data = new RandomData();

			int indexDepart = (int) (Math.random() * listAeroport.size());
			int indexArrive = indexDepart + (int) (Math.random() * (listAeroport.size() - (1 + indexDepart)));

			Vol vol = new Vol();
			vol.setAeroportDepart(listAeroport.get(indexDepart));
			vol.setAeroportArrivee(listAeroport.get(indexArrive));

			vol.setDateDepart(data.getDatePassee());
			vol.setHeureDepart(data.getDatePassee());
			vol.setHeureArrivee(data.getDateFuture());
			vol.setDateArrivee(data.getDateFuture());

			volDao.create(vol);
		}
		listVol = volDao.findAll();
	}

	public static void ajoutEscale(int imax) {

		EscaleDao escaleDao = (EscaleDao) context.getBean("escaleDaoJpa");

		for (int i = 1; i <= imax; i++) {

			RandomData data = new RandomData();

			int indexVol = (int) (Math.random() * listVol.size());
			int indexEscale = (int) (Math.random() * (listAeroport.size()));

			Escale escale = new Escale();

			escale.setId(listVol.get(indexVol), listAeroport.get(indexEscale));
			escale.setDateDepart(listVol.get(indexVol).getDateDepart());
			// escale.setHeureDepart((Time)
			// listVol.get(indexVol).getDateDepart());
			escale.setDateArrivee(listVol.get(indexVol).getDateArrivee());
			// escale.setHeureArrivee((Time)
			// listVol.get(indexVol).getDateArrivee());

			escaleDao.create(escale);
		}
		listEscale = escaleDao.findAll();
	}

	public static void ajoutReservation(int imax) {

		ReservationDao reservationDao = (ReservationDao) context.getBean("reservationDaoJpa");

		for (int i = 1; i <= imax; i++) {

			RandomData data = new RandomData();

			int indexPassager = (int) (Math.random() * listPassager.size());
			int indexClient = (int) (Math.random() * listClient.size());
			int indexVol = (int) (Math.random() * listVol.size());

			Reservation reservation = new Reservation();
			reservation.setClient(listClient.get(indexClient));
			reservation.setPassager(listPassager.get(indexPassager));
			reservation.setVol(listVol.get(indexVol));

			reservation.setDate(data.getDatePassee());
			
			if(data.isBooleen())
				reservation.setEtatReservation(EtatReservation.ouvert);
			else
				reservation.setEtatReservation(EtatReservation.ferme);
			
			reservation.setNumero(data.generateString(6, "1234567890"));
			
			reservationDao.create(reservation);
		}

	}

}
