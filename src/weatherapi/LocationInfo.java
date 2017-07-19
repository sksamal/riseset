package weatherapi;
import java.util.Calendar;

public class LocationInfo {

	Calendar date;
	String crise;
	String cset;
	String orise;
	String oset;
	String arise;
	String aset;
	Weather weather;
	Main main;
	
	public LocationInfo(Calendar date, String crise, String cset, String orise, String oset, 
			String arise, String aset,Weather weather, Main main) {
		super();
		this.date = date;
		this.crise = crise;
		this.cset = cset;
		this.orise = orise;
		this.oset = oset;
		this.arise = arise;
		this.aset = aset;
		this.weather = weather;
		this.main = main;
	}
}
