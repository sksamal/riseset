package weatherapi;

import java.util.List;

public class ForecastDailyResponse {
	int cod;
	String message;
	City city;
	Coord coord;
	String country;
	int cnt;
	List<ForecastDailyItem> list;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nForecast:\nCity=" + city.getName() + " (" + city.getCoord() + ")");
		for (ForecastDailyItem fi : list) {
			sb.append("\n" + fi);
		}
		return sb.toString();
	}
	
	public ForecastDailyItem getItem(int i) {
		return this.list.get(i);
	}
	
	
}


