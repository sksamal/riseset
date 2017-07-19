package weatherapi;

import com.luckycatlabs.sunrisesunset.dto.Location;

public class SunTime {
	Location location;
	
	public SunTime(Location location, String crise, String cset, String orise, String oset, String arise, String aset) {
		super();
		this.location = location;
		this.crise = crise;
		this.cset = cset;
		this.orise = orise;
		this.oset = oset;
		this.arise = arise;
		this.aset = aset;
	}
	String crise;
	String cset;
	String orise;
	String oset;
	String arise;
	String aset;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getCrise() {
		return crise;
	}
	public void setCrise(String crise) {
		this.crise = crise;
	}
	public String getCset() {
		return cset;
	}
	public void setCset(String cset) {
		this.cset = cset;
	}
	public String getOrise() {
		return orise;
	}
	public void setOrise(String orise) {
		this.orise = orise;
	}
	public String getOset() {
		return oset;
	}
	public void setOset(String oset) {
		this.oset = oset;
	}
	public String getArise() {
		return arise;
	}
	public void setArise(String arise) {
		this.arise = arise;
	}
	public String getAset() {
		return aset;
	}
	public void setAset(String aset) {
		this.aset = aset;
	}
}
