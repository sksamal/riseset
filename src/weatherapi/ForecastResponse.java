package weatherapi;

import java.util.List;

public class ForecastResponse {
	City city;
	int cod;
	String message;
	int cnt;
	List<ForecastItem> list;

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
		for (ForecastItem fi : list) {
			sb.append("\n" + fi);
		}
		return sb.toString();
	}
	
	public ForecastItem getItem(int i) {
		return this.list.get(i);
	}
	
	
}


