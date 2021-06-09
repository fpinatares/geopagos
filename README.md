# GeoPagos - Geometry
This repository contains the code and versions for the Geometry API with its different components
The service is currently running in a EC2 instance.

## How to use ##

### API ###

To create a new figure, a POST request should be made to the following endpoint 
If the figure type is one of CIRCLE, SQUARE or TRIANGLE, the endpoint will return 200 - OK
If the figure type is not valid, the endpoint will return 400 - Bad Request
If there is another kind of error, the endpoint will return 500 - Internal Server Error

Header       | Value
------------ | -------------
Content-Type | application/json

```
POST http://ec2-54-175-59-179.compute-1.amazonaws.com:8080/figures
```
Body example for a Circle:
```json
{
    "type":"CIRCLE"
}
```
Body example for a Square:
```json
{
    "type":"SQUARE"
}
```
Body example for a Triangle:
```json
{
    "type":"TRIANGLE"
}
```

#### Figures ####
To get the figures and their data, a GET request should be made to the following endpoint
```
GET http://ec2-54-175-59-179.compute-1.amazonaws.com:8080/figures
```


