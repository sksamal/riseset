package weatherapi;

import java.util.List;

public class ForecastDailyItem {
	long dt;
	Temp temp;
	double pressure;
	double humidity;
	List<Weather> weather;
	double speed;
	String deg;
	double clouds;
	
	@Override
	public String toString() {
		return String.format("%20s : %80s %30s", dt,temp,weather);
	}
	public long getDt() {
		return dt;
	}
	public void setDt(long dt) {
		this.dt = dt;
	}
	public Temp getTemp() {
		return temp;
	}
	public void setTemp(Temp temp) {
		this.temp = temp;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getClouds() {
		return clouds;
	}
	public void setClouds(double clouds) {
		this.clouds = clouds;
	}
	public String getDeg() {
		return deg;
	}
	public void setClouds(String deg) {
		this.deg = deg;
	}
	
	public Main getMain() {
		Main main = new Main();
		main.setTemp(this.temp.day);
		main.setTemp_max(this.temp.max);
		main.setHumidity(this.humidity);
		main.setPressure(this.pressure);
		return main;
	}
}
