package shipments;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Shipment {

	String ShippingRefNo;
	String AWB_No;
	String Shipper;
	String Consignee;
	String CountryOrigin;
	String CountryDestination;
	String DescContents;
	float No_Of_Pieces;
	float Weight;
	Date Date_Time_Shipped;
	Date Date_Time_Received;
	
	String CityOrigin;
	String CityOriginIATA;
	String CityDestination;
	String CityDestinationIATA;
	String CreatedBy;
	Date Date_Time_Created;
	String ModifiedBy;
	Date Date_Time_Modified;
	List<ShipmentEvent> ShipmentEvents = new ArrayList<ShipmentEvent>();
	
	
	public String getShippingRefNo() {
		return ShippingRefNo;
	}


	public void setShippingRefNo(String shippingRefNo) {
		ShippingRefNo = shippingRefNo;
	}


	public String getAWB_No() {
		return AWB_No;
	}


	public void setAWB_No(String aWB_No) {
		AWB_No = aWB_No;
	}


	public String getShipper() {
		return Shipper;
	}

	public void setShipper(String shipper) {
		Shipper = shipper;
	}

	public String getConsignee() {
		return Consignee;
	}

	public void setConsignee(String consignee) {
		Consignee = consignee;
	}

	public String getDescContents() {
		return DescContents;
	}

	public void setDescContents(String descContents) {
		DescContents = descContents;
	}

	public float getNo_Of_Pieces() {
		return No_Of_Pieces;
	}

	public void setNo_Of_Pieces(float no_Of_Pieces) {
		No_Of_Pieces = no_Of_Pieces;
	}

	public float getWeight() {
		return Weight;
	}

	public void setWeight(float weight) {
		Weight = weight;
	}

	public String getCityOrigin() {
		return CityOrigin;
	}

	public void setCityOrigin(String cityOrigin) {
		CityOrigin = cityOrigin;
	}

	public String getCityOriginIATA() {
		return CityOriginIATA;
	}

	public void setCityOriginIATA(String cityOriginIATA) {
		CityOriginIATA = cityOriginIATA;
	}

	public String getCountryOrigin() {
		return CountryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		CountryOrigin = countryOrigin;
	}

	public String getCityDestination() {
		return CityDestination;
	}

	public void setCityDestination(String cityDestination) {
		CityDestination = cityDestination;
	}

	public String getCityDestinationIATA() {
		return CityDestinationIATA;
	}

	public void setCityDestinationIATA(String cityDestinationIATA) {
		CityDestinationIATA = cityDestinationIATA;
	}

	public String getCountryDestination() {
		return CountryDestination;
	}

	public void setCountryDestination(String countryDestination) {
		CountryDestination = countryDestination;
	}

	public Date getDate_Time_Shipped() {
		return Date_Time_Shipped;
	}

	public void setDate_Time_Shipped(Date date_Time_Shipped) {
		Date_Time_Shipped = date_Time_Shipped;
	}


	public Date getDate_Time_Received() {
		return Date_Time_Received;
	}

	public void setDate_Time_Received(Date date_Time_Received) {
		Date_Time_Received = date_Time_Received;
	}


	public String getCreatedBy() {
		return CreatedBy;
	}


	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}


	public Date getDate_Time_Created() {
		return Date_Time_Created;
	}

	public void setDate_Time_Created(Date date_Time_Created) {
		Date_Time_Created = date_Time_Created;
	}


	public String getModifiedBy() {
		return ModifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}


	public Date getDate_Time_Modified() {
		return Date_Time_Modified;
	}


	public void setDate_Time_Modified(Date date_Time_Modified) {
		Date_Time_Modified = date_Time_Modified;
	}


}
