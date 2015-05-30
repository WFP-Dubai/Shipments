package shipments;

import java.sql.Date;

public class ShipmentEvent {

	String ShippingRefNo;
	String ServiceEvent;
	String City_Of_Event;
	String Country_Of_Event;
	Date Date_Time_Of_Event;
	public String getShippingRefNo() {
		return ShippingRefNo;
	}
	public void setShippingRefNo(String shippingRefNo) {
		ShippingRefNo = shippingRefNo;
	}
	public String getServiceEvent() {
		return ServiceEvent;
	}
	public void setServiceEvent(String serviceEvent) {
		ServiceEvent = serviceEvent;
	}
	public String getCity_Of_Event() {
		return City_Of_Event;
	}
	public void setCity_Of_Event(String city_Of_Event) {
		City_Of_Event = city_Of_Event;
	}
	public String getCountry_Of_Event() {
		return Country_Of_Event;
	}
	public void setCountry_Of_Event(String country_Of_Event) {
		Country_Of_Event = country_Of_Event;
	}
	public Date getDate_Time_Of_Event() {
		return Date_Time_Of_Event;
	}
	public void setDate_Time_Of_Event(Date date_Time_Of_Event) {
		Date_Time_Of_Event = date_Time_Of_Event;
	}
	
}
