CREATE TABLE Shipments 

(
ShippingRefNo VARCHAR (15) Not Null Primary Key,
AWB_No VARCHAR (15),

Shipper VARCHAR (100),
Consignee VARCHAR (100),

Desc_Content TEXT,
No_Of_Pieces DECIMAL,
Weight DECIMAL,

City_Origin VARCHAR (50),
City_Origin_IATA VARCHAR (10),
Country_Origin VARCHAR (50), 

City_Dest VARCHAR (50),
City_Dest_IATA VARCHAR (10),
Country_Dest VARCHAR (50), 

Date_Time_Shipped TIMESTAMP,
Date_Time_Received TIMESTAMP,

CreatedBy VARCHAR (50),
Date_Time_Created TIMESTAMP,

ModifiedBy VARCHAR (50),
Date_Time_Modified TIMESTAMP


); 