package weatherapi;

import java.math.BigDecimal;

public class Coord {
	long lon;
	long lat;
	
	public long getLon() {
		return lon;
	}
	public void setLon(long lon) {
		this.lon = lon;
	}
	public long getLat() {
		return lat;
	}
	public void setLat(long lat) {
		this.lat = lat;
	}
	
	@Override
	public String toString() {
		return "Longitude=" + lon + ", Latitude=" + lat;
	}
	
}
