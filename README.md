## Sopping Cart Service
The sample service will post the order details into JMS and then read the details from Queue and update into ORDER_DETAILS table.

Used in-memory JMS and H2 DataBase

#### End Point details
POST http://localhost:8090/scart/postorder

#### Request Header
Content-Type : application/json

#### Request Body example:

{
"userName":"Hainse",
"productCode":"C002",
"productName":"Cooker",
"productCost":395.99
}


## H2 Database console
Use this url to view 2 Database console : http://localhost:8090/h2-console/
