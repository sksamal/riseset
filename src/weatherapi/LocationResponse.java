package weatherapi;

import java.util.ArrayList;
import java.util.List;
import com.luckycatlabs.sunrisesunset.dto.Location;

public class LocationResponse {

	Location location;
	String name;
	List<LocationInfo> llist;
	
	public LocationResponse(Location location) {
		this.location = location;
		this.llist = new ArrayList<LocationInfo>();
	}
	
	public void addInfo(LocationInfo info) {
		this.llist.add(info);
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<LocationInfo> getllist() {
		return llist;
	}

	public void setLocInfoList(List<LocationInfo> llist) {
		this.llist = llist;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
