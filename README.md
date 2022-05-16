# ReadCSV
Flight information from csv file.

1. The csv file path needs to be added in the method **FlightService** class

		String csvFile = "C:\\\\Users\\\\jithi\\\\Downloads\\\\airport-app-data-master\\\\flights.csv";
	
2. The project needs to be run as spring boot application


Sample url the date should be passed as yyyy-mm-dd

http://localhost:8085/flight/2022-05-18

The code will take a date in the below format and check the day of the week  and return all the flights details available as an array.
It mainly uses open csv jar for reading the csv file

<dependency>
      <groupId>com.opencsv</groupId>
      <artifactId>opencsv</artifactId>
      <version>5.3</version>
  </dependency>

Response


[{"time":"11:05","flightNo":"Barbados","flightDestination":"BGI","flightDestinationAirport":"VS029","sunday":"x","monday":"x","tuesday":"x","wednesday":"x","thursday":"x","friday":"x","saturday":"x"},{"time":"10:35","flightNo":"Las Vegas","flightDestination":"LAS","flightDestinationAirport":"VS043","sunday":"","monday":"x","tuesday":"x","wednesday":"x","thursday":"","friday":"","saturday":""},{"time":"15:35","flightNo":"Las Vegas","flightDestination":"LAS","flightDestinationAirport":"VS044","sunday":"x","monday":"x","tuesday":"x","wednesday":"x","thursday":"x","friday":"x","saturday":"x"},{"time":"12:25 ","flightNo":"Montego Bay","flightDestination":"MBJ","flightDestinationAirport":"VS065","sunday":"","monday":"","tuesday":"","wednesday":"x","thursday":"","friday":"","saturday":""},{"time":"10:15","flightNo":"Orlando","flightDestination":"MCO","flightDestinationAirport":"VS027","sunday":"","monday":"","tuesday":"","wednesday":"x","thursday":"","friday":"","saturday":""},{"time":"11:45","flightNo":"Orlando","flightDestination":"MCO","flightDestinationAirport":"VS049","sunday":"","monday":"","tuesday":"","wednesday":"x","thursday":"","friday":"","saturday":""},{"time":"13:00","flightNo":"Orlando","flightDestination":"MCO","flightDestinationAirport":"VS015","sunday":"x","monday":"x","tuesday":"x","wednesday":"x","thursday":"x","friday":"x","saturday":"x"}]
