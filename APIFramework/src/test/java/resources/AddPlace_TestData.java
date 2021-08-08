package resources;

import pojo.AddPlace;
import pojo.Location;

public class AddPlace_TestData {
	public AddPlace addPlacePayload(String name , String language,String address) {
	AddPlace p =new AddPlace();
	p.setAccuracy("50");
	p.setAddress(address);
	p.setLanguage(language);
	p.setPhone_number("(+91) 983 893 3937");
	p.setWebsite("https://rahulshettyacademy.com");
	p.setName(name);
    String[] str= {"shoe park","shop"};
	p.setTypes(str);
	Location l =new Location();
	l.setLat("-38.383494");
	l.setLng("38.499886");
	p.setLocation(l);
	return p;
	}


}
