CREATE TABLE ShipmentEvents

(
ShippingRefNo VARCHAR (15) Not Null,

ServiceEvent VARCHAR (30),

City_of_Event VARCHAR (30),

Country_of_Event VARCHAR (30),

Date_Time_of_Event TIMESTAMP,

CONSTRAINT PK_ShipmentEvents PRIMARY KEY (ShippingRefNo,Date_Time_of_Event)

); 