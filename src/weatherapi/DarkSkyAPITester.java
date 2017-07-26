package weatherapi;

import java.net.*;
import java.io.*;

public class DarkSkyAPITester {
	public static void main(String[] args) throws Exception {
		String apiKey = "7075b313d5f62799fc07b4e52293ecaa";
		String url = "https://api.darksky.net/forecast/";
		String loc = "40.806862,-96.681679";
		long unixTime = 0;
		String units = "auto";
		String exclude = "exclude=flags";

		if (args.length < 2) {
			System.out.println("java DarkSkyAPITester <lat> <lon> [units] [exclude] [unixtime]");
			System.exit(-1);		
		}
			
		if (args.length > 1)
			loc = args[0] + "," + args[1];
		if (args.length > 2)
			units = "units=" + args[2];
		if (args.length > 3)
			exclude = "exclude=" + args[3];
		if (args.length > 4) {
			if(args[4].contains("+")) {
				long nowTime = (new java.util.Date()).getTime()/1000;
				unixTime = nowTime + Long.parseLong(args[4].substring(args[4].indexOf("+")+1));
		}
			else
				unixTime = Long.parseLong(args[4]);
		}

		// URL weather = new
		// URL("http://api.openweathermap.org/data/2.5/weather?q=GrandIsland&appid=aa9cfa9c60b99d03c201f4ae931d0b4c&units=metric");

		URL forecast ;
		if(unixTime==0)
			forecast= new URL(url + apiKey + "/" + loc + "?" + exclude);
		else
		    forecast = new URL(url + apiKey + "/" + loc + "," + unixTime + "?" + exclude);

		String inputLine;

		URLConnection fc = forecast.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(fc.getInputStream()));

		if ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		} else
			System.out.println("No Response Recieved");
		in.close();

	}
}