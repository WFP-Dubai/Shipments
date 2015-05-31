package shipments;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class DBInputOutput {

	public static void main(final String [] args)
	{
		ClassLoader classLoader = DBInputOutput.class.getClassLoader();
		final String inputFile = "dhl_data_file/DHL_Shipments_Copy.xls";
		final File inputWorkbook = new File(classLoader.getResource(inputFile).getFile());
		Workbook w;
		final Shipment[] extractedShipments = new Shipment[500];

		try{
			w = Workbook.getWorkbook(inputWorkbook);
			final Sheet sheet = w.getSheet(0);

			for (int i = 0; i < sheet.getRows(); i++){
				final Cell cell = sheet.getCell(0,i);
				if (cell.getContents().matches("\\d{7}")){
					extractedShipments[i] = insertIntoShipmentObject(sheet,i);
					System.out.println(i);
				}
			}
			//insertShipmentsIntoDB(extractedShipments);

			//getShipmentsFromDB();
		} catch (final Exception e) {
        	e.printStackTrace();
		}
	}

	static public void getShipmentsFromDB() {

		final DBConnect dbconnect = new DBConnect();
		final Connection c = dbconnect.connect();
        String sql;
		ResultSet rs;
        int tempInt = 99;

        try {

	        sql = "SELECT Count(*) AS Count FROM Shipments";
	        final PreparedStatement pst = c.prepareStatement(sql);
	        rs = pst.executeQuery();
	        while (rs.next()){
	        	tempInt = rs.getInt("Count");
	        }

	        System.out.println("here is the temp integer: " + tempInt);
	        rs.close();
	        pst.close();
	        dbconnect.close(c);

        } catch (final Exception e){
        	e.printStackTrace();
        	//return null;
        }
	}

	static public void insertShipmentsIntoDB(final Shipment[] extractedShipments) {

    		final DBConnect dbconnect = new DBConnect();
    		final Connection c = dbconnect.connect();
        String sql;
        Statement stmt;

        try {
    			for(int i = 0; i < 500; i++){
    				if (extractedShipments[i]!=null){
    					System.out.println("here is a shipment");
    					System.out.println(extractedShipments[i].getShippingRefNo() + "\n");
    				}
    			}

	        sql = "INSERT INTO Shipments VALUES ('1162','','','','',9,9,'','','','','','','11/11/11','11/11/11','','11/11/11','','11/11/11')";
	        stmt = c.createStatement();
	        stmt.executeUpdate(sql);

	        stmt.close();
	        dbconnect.close(c);

        } catch (final Exception e){
        	e.printStackTrace();
        }

	}

	static public Shipment insertIntoShipmentObject(final Sheet sheet, final int Row) {

		final Shipment extractedShipment = new Shipment();
		final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		String newWeightStr = new String();

		try {
			for (int j = 0; j < sheet.getColumns(); j++){
				if (j == 0) {
					//ShippingRefNo
					extractedShipment.setShippingRefNo(sheet.getCell(j,Row).getContents());
				} else if (j == 1) {
					//AWB_No
					extractedShipment.setAWB_No(sheet.getCell(j,Row).getContents());
				} else if (j == 2) {
					//Shipper
					extractedShipment.setShipper(sheet.getCell(j,Row).getContents());
				} else if (j == 4) {
					//Consignee
					extractedShipment.setConsignee(sheet.getCell(j,Row).getContents());
				} else if (j == 7) {
					//Country of Origin
					extractedShipment.setCountryOrigin(sheet.getCell(j,Row).getContents());
				} else if (j == 8) {
					//Country of Destination
					extractedShipment.setCountryDestination(sheet.getCell(j,Row).getContents());
				} else if (j == 17) {
					//DescContents
					extractedShipment.setDescContents(sheet.getCell(j,Row).getContents());
				} else if (j == 18) {
					//No_Of_Pieces
					extractedShipment.setNo_Of_Pieces(Float.parseFloat(sheet.getCell(j,Row).getContents()));
				} else if (j == 19) {
					//Weight
					newWeightStr = sheet.getCell(j,Row).getContents().replaceAll(",","");
					extractedShipment.setWeight(Float.parseFloat(newWeightStr));
				} else if (j == 23) {
					//Date_Time_Shipped
					if (!sheet.getCell(j,Row).getContents().equals("")){
						final java.util.Date parsed = formatter.parse(sheet.getCell(j,Row).getContents());
						final Date sqlDate = new Date(parsed.getTime());
						extractedShipment.setDate_Time_Shipped(sqlDate);
					}
				} else if (j == 27) {
					//Date_Time_Received
					if (!sheet.getCell(j,Row).getContents().equals(" ")){
						final java.util.Date parsed = formatter.parse(sheet.getCell(j,Row).getContents());
						final Date sqlDate = new Date(parsed.getTime());
						extractedShipment.setDate_Time_Received(sqlDate);
					}
				}
			}
        } catch (final Exception e){
        	e.printStackTrace();
        }
		return extractedShipment;
	}

}
