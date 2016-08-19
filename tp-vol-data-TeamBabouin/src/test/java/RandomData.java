
import java.util.Date;

public class RandomData {

	// Valeurs generees
	private String nom;
	private String prenom;
	private String civilite;
	private boolean sexe; // false = H - true = F
	private Date dateNaissance;
	private Date datePassee;
	private Date dateFuture;
	private boolean booleen;

	private String numeroTel;

	private String email;
	private String username;
	private String password;

	private String rue;
	private String ville;
	private String codePostal;
	private String pays;

	// Liste données parametres

	private String listNom[] = new String[] { "ANDRE", "BERNARD", "BERTRAND", "BLANC", "BLANCHARD", "BONNET", "BOYER",
			"BRUN", "BRUNET", "CHEVALIER", "CLEMENT", "DAVID", "DENIS", "DUBOIS", "DUFOUR", "DUMONT", "DUPONT",
			"DURAND", "DUVAL", "FAURE", "FONTAINE", "FOURNIER", "FRANCOIS", "GARCIA", "GARNIER", "GAUTHIER", "GAUTIER",
			"GIRARD", "GIRAUD", "GUERIN", "HENRY", "JOLY", "LAMBERT", "LAURENT", "LEFEBVRE", "LEFEVRE", "LEGRAND",
			"LEMAIRE", "LEROY", "LUCAS", "MARCHAND", "MARIE", "MARTIN", "MASSON", "MATHIEU", "MERCIER", "MEUNIER",
			"MEYER", "MICHEL", "MOREAU", "MOREL", "MORIN", "MULLER", "NICOLAS", "NOEL", "PERRIN", "PETIT", "RICHARD",
			"RIVIERE", "ROBERT", "ROBIN", "ROUSSEAU", "ROUSSEL", "ROUX", "SIMON", "THOMAS", "VINCENT" };

	private String listPrenomH[] = new String[] { "Adam", "Alex", "Alexandre", "Alexis", "Anthony", "Antoine",
			"Benjamin", "Cédric", "Charles", "Christopher", "David", "Dylan", "Édouard", "Elliot", "Émile", "Étienne",
			"Félix", "Gabriel", "Guillaume", "Hugo", "Isaac", "Jacob", "Jérémy", "Jonathan", "Julien", "Justin", "Léo",
			"Logan", "Loïc", "Louis", "Lucas", "Ludovic", "Malik", "Mathieu", "Mathis", "Maxime", "Michaël", "Nathan",
			"Nicolas", "Noah", "Olivier", "Philippe", "Raphaël", "Samuel", "Simon", "Thomas", "Tommy", "Tristan",
			"Victor", "Vincent" };

	private String listPrenomF[] = new String[] { "Alexia", "Alice", "Alicia", "Amélie", "Anaïs", "Annabelle",
			"Arianne", "Audrey", "Aurélie", "Camille", "Catherine", "Charlotte", "Chloé", "Clara", "Coralie", "Daphnée",
			"Delphine", "Elizabeth", "Élodie", "Émilie", "Emma", "Emy", "Ève", "Florence", "Gabrielle", "Jade",
			"Juliette", "Justine", "Laurence", "Laurie", "Léa", "Léanne", "Maélie", "Maéva", "Maika", "Marianne",
			"Marilou", "Maude", "Maya", "Mégan", "Mélodie", "Mia", "Noémie", "Océane", "Olivia", "Rosalie", "Rose",
			"Sarah", "Sofia", "Victoria" };

	String listCodePostal[] = new String[] { "13000", "80000", "49000", "95000", "25000", "33000", "92000", "29000",
			"14000", "63000", "21000", "972000", "38000", "76000", "72000", "59000", "87000", "69000", "13000", "57000",
			"34000", "68000", "54000", "44000", "06000", "30000", "45000", "75000", "66000", "51000", "35000", "59000",
			"76000", "974000", "42000", "67000", "83000", "31000", "37000", "69000" };

	String listVille[] = new String[] { "Aix-en-Provence", "Amiens", "Angers", "Argenteuil", "Besançon", "Bordeaux",
			"Boulogne-Billancourt", "Brest", "Caen", "Clermont-Ferrand", "Dijon", "Fort-de-France", "Grenoble",
			"Le Havre", "Le Mans", "Lille", "Limoges", "Lyon", "Marseille", "Metz", "Montpellier", "Mulhouse", "Nancy",
			"Nantes", "Nice", "Nîmes", "Orléans", "Paris", "Perpignan", "Reims", "Rennes", "Roubaix", "Rouen",
			"Saint-Denis", "Saint-Étienne", "Strasbourg", "Toulon", "Toulouse", "Tours", "Villeurbanne" };

	String listRue[] = { "AVENUE DU QUAI DES MAREES ", "AVENUE ERNEST RENAN ", "AVENUE FERDINAND DE LESSEPS ",
			"AVENUE GEO ANDRE ", "AVENUE PIERRE DE COUBERTIN ", "AVENUE SUZANNE LENGLEN ", "BOULEVARD ALBERT 1ER ",
			"BOULEVARD BOUGAINVILLE ", "BOULEVARD DE L EUROPE ", "BOULEVARD DE L HOPITAL (RN771) ",
			"BOULEVARD DE L UNIVERSITE ", "BOULEVARD MOULIN DE LA BUTTE ", "BOULEVARD PAUL LEFERME ",
			"BOULEVARD PAUL PERRIN ", "BOULEVARD PIERRE DE MAUPERTUIS ", "BOULEVARD PRESIDENT WILSON ",
			"BOULEVARD SUNDERLAND ", "BOULEVARD VICTOR HUGO ", "BOULEVARD WILLY BRANDT ", "CHEMIN DE L ILE DES MERS ",
			"CHEMIN DE L ILE DU MOULIN ", "CHEMIN DE L ISLE DES RIVAUX ", "CHEMIN DE L ISLE DES RIVAUX ",
			"CHEMIN DE LA VILLES OURS ", "CHEMIN DE LA VILLES ROBERT ", "CHEMIN DE LA VIREE GUIOCHET ",
			"CHEMIN DE PORCE ", "CHEMIN DE PORT CHARLOTTE ", "CHEMIN DE PREVOIR ", "CHEMIN DE SIRIFF ",
			"CHEMIN DE TREBEZY ", "CHEMIN DE TREGOUET ", "CHEMIN DE TURENNE ", "CHEMIN DE VILLENEUVE ",
			"CHEMIN DES INFIRMIERES ", "CHEMIN DES LANDES AUX MURES ", "CHEMIN DES LAURIERS ",
			"CHEMIN DES MARES THOMAS ", "CHEMIN DES MILLAUDS ", "CHEMIN DES MULES ", "CHEMIN DES NOES ",
			"IMPASSE DE L OCEAN ", "IMPASSE DE L  ILE DES FRECHAILLES ", "IMPASSE DE LA CHAPELLE ",
			"IMPASSE DE LA COURANCE ", "IMPASSE DE LA LANDE DE CLEUX ", "IMPASSE DE LA NOE D ARMANGEO ",
			"IMPASSE DE LA PIERRE DENION ", "IMPASSE DE LA VILLES MOLLE ", "IMPASSE DE TOUTES AIDES ",
			"IMPASSE DU PRAZILLON ", "IMPASSE DU SAUT DU LOUP ", "IMPASSE EDOUARD VAILLANT ",
			"IMPASSE EMILE MICHEL LOUMEAU ", "IMPASSE ERNEST RENAN ", "IMPASSE FRANCOIS BROUSSAIS ",
			"IMPASSE GUSTAVE FLAUBERT ", "IMPASSE JEAN DE NEYMAN ", "PASSAGE PAUL PERRIN ", "PASSAGE RENE GUILLOUZO ",
			"PASSAGE RENE GUILLOUZO ", "PLACE LOUIS BRICHAUX ", "PLACE MADELEINE BIREMBAUT-GALLEN ",
			"PLACE MARCEL PAGNOL ", "PLACE MARCEL PAUL ", "PLACE MARGUERITE DURAS ", "PLACE MARIA DERAISMES ",
			"PLACE MARTYRS RESISTANCE ", "PLACE NADIA BOULANGER ", "PLACE NEPTUNE ", "ROUTE DE LA VIREE DE DEVANT ",
			"ROUTE DE LEAUFOUIS ", "ROUTE DE LESNAIS ", "ROUTE DE MARSAC ", "ROUTE DE PASSOUER ",
			"ROUTE DE PONT BRIEN ", "ROUTE DE QUELMER ", "ROUTE DU LANDREAU ", "ROUTE DU MARAIS D UST ",
			"ROUTE DU PETIT LERIOUX ", "ROUTE DU POINT DU JOUR ", "ROUTE DU PONT DE LESNAIS ", "ROUTE DU PRE HEMBERT ",
			"ROUTE DU QUEMENEAU ", "ROUTE DU SABOT D OR ", "ROUTE DU VIVIER ", "RUE A SANTOS DUMONT ",
			"RUE ADRIEN PICHON ", "RUE ALAIN GERBAULT ", "RUE ALBERT CAMUS ", "RUE ALBERT EINSTEIN ",
			"RUE ALBERT SCHWEITZER ", "RUE ANATOLE FRANCE ", "RUE ANCIEN HOPITAL ", "RUE ANDERS CELSIUS ",
			"RUE ANDRE AMPERE ", "RUE ANDRE CHENIER ", "RUE ANDRE LE NOTRE ", "RUE ANGELA DUVAL ", "RUE ANITA CONTI ",
			"RUE ANNIE GIRARDOT ", "RUE ANTOINE DE BAIF ", "RUE ANTOINE DE CONDORCET ", "RUE ANTOINE DE JUSSIEU ",
			"RUE ANTOINE DE SAINT EXUPERY ", "RUE ANTOINE LAVOISIER ", "RUE ANTOINE PARMENTIER ",
			"RUE ARISTIDE BRIAND ", "RUE ARMAND BARBES ", "RUE ARSENE D ARSONVAL ", "RUE DE L ETOILE DU MATIN ",
			"RUE DE L HIPPODROME ", "RUE DE L ILE DE FRANCE ", "RUE DE L ILE DE RETON ", "RUE DE L ILE DES ROCHELLES ",
			"RUE DE LA FLORIDE ", "RUE DE LA FORME JOUBERT ", "RUE DE LA GUYANE ", "RUE DE LA JAMAIQUE ",
			"RUE DE LA LOIRE ", "RUE DE LA MATTE ", "RUE DE LA PAIX ", "RUE DE LA PETITE CALIFORNIE ",
			"RUE DE LA PETITE PATURE ", "RUE DE LA ROUILLARDERIE ", "RUE DE LA TRINITE ", "RUE DE LA VECQUERIE ",
			"RUE DE LA VIEILLE EGLISE ", "RUE DE LA VIGNE ROSEE ", "RUE DE LA VILLE AUX FEVES ",
			"RUE DE LA VILLE ETABLE ", "RUE DE LA VILLE HALLUARD ", "RUE DE LA VIREE DE LA CROIX ", "RUE DE MAUDES ",
			"RUE DE MEXICO ", "RUE DE NORMANDIE ", "RUE DE NORMANDIE NIEMEN ", "RUE DE PORNICHET ", "RUE DE PREZEGAT ",
			"RUE DE SAILLE ", "RUE DE SAINTONGE ", "RUE DE STALINGRAD ", "RUE DE TOULOUSE LAUTREC ", "RUE DE TOURAINE ",
			"RUE DE TOUTES AIDES ", "RUE DE TRIGNAC ", "RUE DE VINCENNES ", "RUE DENIS DIDEROT ", "RUE DENIS PAPIN ",
			"RUE DES ABATTOIRS ", "RUE DES AJONCS ", "RUE DES AMANDIERS ", "RUE DES ARDOISES ", "RUE DES ARMATEURS ",
			"RUE DES BOULEAUX ", "RUE DES CABOTEURS ", "RUE DES CEDRES ", "RUE DES PINSONS ", "RUE DES SAPINS ",
			"RUE DU CORPS DE GARDE ", "RUE DU CROISIC ", "RUE DU DOC PIERRE ROUX ", "RUE DU DOCTEUR ALBERT CALMETTE ",
			"RUE DU DOLMEN ", "RUE DU DR FRANCOISE DOLTO ", "RUE DU FORT ", "RUE DU FOUR ",
			"RUE DU GEN MAURICE DE SARRAIL ", "RUE DU GRAND ORMEAU ", "RUE DU GUATEMALA ", "RUE DU HONDURAS ",
			"RUE DU LAVOIR ", "RUE DU LERIOUX ", "RUE DU MAINE ", "RUE DU MARCHE ", "RUE DU MENAUDOUX ",
			"RUE EMILE OLLIVAUD ", "RUE ERNEST LAVISSE ", "RUE ETIENNE CHAILLON ", "RUE ETIENNE DE CONDILLAC ",
			"RUE ETIENNE DOLET ", "RUE ETIENNE JODELLE ", "RUE EUGENE CORNET ", "RUE EUGENE DAVIERS ",
			"RUE EUGENE DELACROIX ", "RUE FERDINAND BUISSON ", "RUE FERNAND DE MAGELLAN ", "RUE FERNAND GASNIER ",
			"RUE FERNAND NOUVION ", "RUE FERNAND PELLOUTIER ", "RUE FIDELE SIMON ", "RUE FLORENCE NIGHTINGALE ",
			"RUE FRANCIS DE PRESSENSE ", "RUE FRANCOIS ADRIEN BOIELDIEU ", "RUE FRANCOIS ARAGO ",
			"RUE FRANCOIS COPPEE ", "RUE FRANCOIS DE CHATEAUBRIAND ", "RUE FRANCOIS MADIOT ", "RUE FRANCOIS MARCEAU ",
			"RUE FRANCOIS RABELAIS ", "RUE FRANCOIS RUDE ", "RUE FRANCOIS VILLON ", "RUE FRANCOIS VOLTAIRE ",
			"RUE FRANCOISE SAGAN ", "RUE FRANZ SCHUBERT ", "RUE FREDERIC ENGELS ", "RUE FREDERIC MISTRAL ",
			"RUE FRERES DE GONCOURT ", "RUE FRERES MONVOISIN ", "RUE GABRIEL FAURE ", "RUE GABRIEL PERI ",
			"RUE GABRIEL POULAIN ", "RUE GRAHAM BELL ", "RUE GUILLAUME APOLLINAIRE ", "RUE GUSTAVE EIFFEL ",
			"RUE GUSTAVE FLAUBERT ", "RUE GUY DE MAUPASSANT ", "RUE HELENE BOUCHER ", "RUE HENRI BARBUSSE ",
			"RUE HENRI BRISSON ", "RUE HENRI DE MONFREID ", "RUE HENRI GAUTIER ", "RUE HENRI LE DEAN ",
			"RUE HENRI MATISSE ", "RUE HENRI SELLIER ", "RUE HIPPOLYTE DURAND ", "RUE HONORE DAUMIER ",
			"RUE HONORE DE BALZAC ", "RUE HONORE DE MIRABEAU ", "RUE ISAAC NEWTON ", "RUE JACQUES CARTIER ",
			"RUE JEAN HAAS ", "RUE JEAN HENRI DUNANT ", "RUE JEAN JACOTOT ", "RUE JEAN JAURES ",
			"RUE JEAN JOSEPH MOUNIER ", "RUE JEAN MACE ", "RUE JEAN MARAT ", "RUE JEAN MARIE PERRET ",
			"RUE JEAN PHILIPPE RAMEAU ", "RUE JEAN PIERRE DUFREXOU ", "RUE JEAN RACINE ", "RUE JEAN RICHEPIN ",
			"RUE JEAN SYLVAIN BAILLY ", "RUE JEANNE BARRET ", "RUE JEANNE CHAUVIN ", "RUE JEANNE D ARC ",
			"RUE JOACHIM DU BELLAY ", "RUE JOHN SCOTT ", "RUE JOSEPH BARNAVE ", "RUE JOSEPH BLANCHARD ",
			"RUE JOSEPH ET E. MONTGOLFIER ", "RUE JOSEPH JACQUART ", "RUE JOSEPH LAKANAL ", "RUE JOSEPH LE BRIX ",
			"RUE JOSEPH LE DELEZIR ", "RUE JULES BUSSON ", "RUE JULES FAVRE ", "RUE JULES FENELON ",
			"RUE JULES GUESDE ", "RUE JULES MANSART ", "RUE JULES MASSENET ", "RUE JULES MICHELET ",
			"RUE JULES RENARD ", "RUE JULES ROMAINS ", "RUE JULES SANDEAU ", "RUE MARCEL SEMBAT ",
			"RUE MARCELIN BERTHELOT ", "RUE MARGUERITE YOURCENAR " };

	private String listDomaine[] = new String[] { "@hotmail.fr", "@gmail.com", "@wanadoo.fr", "@orange.fr", "@gmail.fr",
			"@hotmail.com" };

	public RandomData() {
		super();

		int rand;

		// Generation du nom

		rand = (int) (Math.random() * (listNom.length));
		this.nom = listNom[rand];

		if (Math.random() * (100) > 50) {
			sexe = false;
			rand = (int) (Math.random() * (listPrenomH.length));
			this.prenom = listPrenomH[rand];
		} else {
			sexe = true;
			rand = (int) (Math.random() * (listPrenomF.length));
			this.prenom = listPrenomF[rand];
		}

		if (Math.random() * (100) > 50) {
			booleen = false;
		} else {
			booleen = true;
		}

		long timestampNow = System.currentTimeMillis();
		long timestampMin = timestampNow - 2000000000000L;
		long timestampMax = timestampNow - 200000000000L;
		long timeRandom = (long) (timestampMin + (Math.random() * (timestampMax - timestampMin)));
		this.dateNaissance = new Date(timeRandom);

		timeRandom = timestampNow + (long) (Math.random() * 10000000000L);
		this.dateFuture = new Date(timeRandom);

		timeRandom = timestampNow - (long) (Math.random() * 10000000000L);
		this.datePassee = new Date(timeRandom);

		rand = (int) (Math.random() * (listCodePostal.length));
		this.codePostal = listCodePostal[rand];
		this.ville = listVille[rand];

		rand = (int) (Math.random() * (listRue.length));
		this.rue = ((int) (Math.random() * 30)) + " " + listRue[rand];

		this.pays = "France";

		rand = (int) (Math.random() * (listDomaine.length));
		this.email = prenom + "." + nom + listDomaine[rand];

		this.username = prenom + generateString(4, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
		this.password = generateString(10, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
		this.numeroTel = "0" + generateString(1, "123456789") + generateString(8, "1234567890");
	}

	public boolean isSexe() {
		return sexe;
	}

	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getListNom() {
		return listNom;
	}

	public void setListNom(String[] listNom) {
		this.listNom = listNom;
	}

	public String[] getListPrenomH() {
		return listPrenomH;
	}

	public void setListPrenomH(String[] listPrenomH) {
		this.listPrenomH = listPrenomH;
	}

	public String[] getListPrenomF() {
		return listPrenomF;
	}

	public void setListPrenomF(String[] listPrenomF) {
		this.listPrenomF = listPrenomF;
	}

	public String[] getListCodePostal() {
		return listCodePostal;
	}

	public void setListCodePostal(String[] listCodePostal) {
		this.listCodePostal = listCodePostal;
	}

	public String[] getListVille() {
		return listVille;
	}

	public void setListVille(String[] listVille) {
		this.listVille = listVille;
	}

	public String[] getListRue() {
		return listRue;
	}

	public void setListRue(String[] listRue) {
		this.listRue = listRue;
	}

	public String[] getListDomaine() {
		return listDomaine;
	}

	public void setListDomaine(String[] listDomaine) {
		this.listDomaine = listDomaine;
	}

	public static String generateString(int length, String chars) {

		StringBuilder pass = new StringBuilder(chars.length());
		for (int x = 0; x < length; x++) {
			int i = (int) (Math.random() * chars.length());
			pass.append(chars.charAt(i));
		}
		return pass.toString();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDatePassee() {
		return datePassee;
	}

	public void setDatePassee(Date datePassee) {
		this.datePassee = datePassee;
	}

	public Date getDateFuture() {
		return dateFuture;
	}

	public void setDateFuture(Date dateFuture) {
		this.dateFuture = dateFuture;
	}

	public boolean isBooleen() {
		return booleen;
	}

	public void setBooleen(boolean booleen) {
		this.booleen = booleen;
	}

	public String getRue() {
		return rue;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Data [nom=" + nom + ", prenom=" + prenom + ", civilite=" + civilite + ", sexe=" + sexe
				+ ", dateNaissance=" + dateNaissance + ", datePassee=" + datePassee + ", dateFuture=" + dateFuture
				+ ", booleen=" + booleen + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + ", pays=" + pays + ", isSexe()="
				+ isSexe() + ", getEmail()=" + getEmail() + ", getUsername()=" + getUsername() + ", getPassword()="
				+ getPassword() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getCivilite()="
				+ getCivilite() + ", getDateNaissance()=" + getDateNaissance() + ", getDatePassee()=" + getDatePassee()
				+ ", getDateFuture()=" + getDateFuture() + ", isBooleen()=" + isBooleen() + ", getRue()=" + getRue()
				+ ", getVille()=" + getVille() + ", getCodePostal()=" + getCodePostal() + ", getPays()=" + getPays()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
