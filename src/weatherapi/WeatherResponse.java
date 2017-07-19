package weatherapi;

import java.util.Date;
import java.util.List;

public class WeatherResponse {
	Coord coord;
	List<Weather> weather;
	String base;
	Main main;
	Wind wind;
	Clouds clouds;
	Rain rain;
	Snow snow;
	long dt;
	Sys sys;
	int id;
	String name;
	int cod;
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Rain getRain() {
		return rain;
	}
	public void setRain(Rain rain) {
		this.rain = rain;
	}
	public Snow getSnow() {
		return snow;
	}
	public void setSnow(Snow snow) {
		this.snow = snow;
	}
	public long getDt() {
		return dt;
	}
	public void setDt(long dt) {
		this.dt = dt;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	@Override
	public String toString() {
		return "City:"+name+"\n" + coord + "\n" + weather + "\n" + main + "\nDateTime:" + new Date(dt*1000L);
	}
	
	
}


