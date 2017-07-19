package weatherapi;

public class Main {
	double temp;
	double pressure;
	double humidity;
	double temp_min;
	double temp_max;
	double sea_level;
	double grnd_level;
	
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	public double getSea_level() {
		return sea_level;
	}
	public void setSea_level(double sea_level) {
		this.sea_level = sea_level;
	}
	public double getGrnd_level() {
		return grnd_level;
	}
	public void setGrnd_level(double grnd_level) {
		this.grnd_level = grnd_level;
	}
	
	@Override
	public String toString() {
		return String.format("Temperature:%6s C, Min:%6s C, Max:%6s C, Humidity:%8s, Pressure:%8s hPa,",temp,temp_min, 
				temp_max , humidity + " % ",pressure);
	}
}
