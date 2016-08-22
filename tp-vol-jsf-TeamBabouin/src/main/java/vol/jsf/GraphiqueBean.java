package vol.jsf;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import vol.model.dao.AeroportDao;
import vol.model.dao.ClientDao;
import vol.model.dao.EscaleDao;
import vol.model.dao.PassagerDao;
import vol.model.dao.ReservationDao;
import vol.model.dao.VilleDao;
import vol.model.dao.VolDao;

@Component
@Scope("request")
public class GraphiqueBean {

	@Autowired
	private ClientDao clientDao;

	@Autowired
	private PassagerDao passagerDao;

	@Autowired
	private ReservationDao reservationDao;

	@Autowired
	private VolDao volDao;

	@Autowired
	private EscaleDao escaleDao;

	@Autowired
	private VilleDao villeDao;

	@Autowired
	private AeroportDao aeroportDao;

	private PieChartModel pieModel1;
	private BarChartModel barModel;

	private Integer maxBar = 0;

	@PostConstruct
	public void init() {

		createPieModels();

	}

	public PieChartModel getPieModel1() {
		return pieModel1;
	}

	private void createPieModels() {
		createPieModel1();
		createBarModels();
	}

	private void createPieModel1() {
		pieModel1 = new PieChartModel();

		List<Integer> listClient = clientDao.statsTypeClient();

		pieModel1.set("EI", listClient.get(0));
		pieModel1.set("Physique", listClient.get(1));
		pieModel1.set("Moral", listClient.get(2));

		pieModel1.setTitle("Type Client");
		pieModel1.setLegendPosition("w");
	}

	public void itemSelect(ItemSelectEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
				"Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	private void createBarModels() {
		createBarModel();
	}

	private void createBarModel() {
		barModel = initBarModel();

		barModel.setTitle("Bar Chart");
		barModel.setLegendPosition("ne");

		Axis xAxis = barModel.getAxis(AxisType.X);
		xAxis.setLabel("");

		Axis yAxis = barModel.getAxis(AxisType.Y);
		yAxis.setLabel("Nombre");
		yAxis.setMin(0);
		yAxis.setMax(maxBar + 20);
	}

	private BarChartModel initBarModel() {
		BarChartModel model = new BarChartModel();

		ChartSeries clients = new ChartSeries();
		clients.setLabel("Clients");
		clients.set("2016", varmax(clientDao.findAll().size()));

		ChartSeries passagers = new ChartSeries();
		passagers.setLabel("Passagers");
		passagers.set("2016", varmax(passagerDao.findAll().size()));

		ChartSeries reservations = new ChartSeries();
		reservations.setLabel("Reservations");
		reservations.set("2016", varmax(reservationDao.findAll().size()));

		ChartSeries vols = new ChartSeries();
		vols.setLabel("Vols");
		vols.set("2016", varmax(volDao.findAll().size()));

		ChartSeries escales = new ChartSeries();
		escales.setLabel("Escales");
		escales.set("2016", varmax(escaleDao.findAll().size()));

		ChartSeries villes = new ChartSeries();
		villes.setLabel("Villes");
		villes.set("2016", varmax(villeDao.findAll().size()));

		ChartSeries aeroports = new ChartSeries();
		aeroports.setLabel("Aéroports");
		aeroports.set("2016", varmax(aeroportDao.findAll().size()));

		model.addSeries(clients);
		model.addSeries(passagers);
		model.addSeries(reservations);
		model.addSeries(vols);
		model.addSeries(escales);
		model.addSeries(villes);
		model.addSeries(aeroports);

		return model;
	}

	private Integer varmax(Integer var) {

		if (var > maxBar) {
			maxBar = var;
		}

		return var;
	}

}
