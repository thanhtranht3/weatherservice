I. Summary:
This spring boot application provides a rest api for receiving a pair of city and state as json format
it delegates to zipcodeapi to get the list of zipcode by city and state,
then it calls the openweathermap api return current and  weather

Repository of project: https://github.com/thanhtranht3/weatherservice.git

II. How to run this project:
Open cmd from the folder of project: 
1. Change valid apikey for zipcodeapi, openweathermap for your session in application.properties config file
2. Run mvn clean install to create jar file
3. Run this command line to build application 
    docker build -f Dockerfile -t weatherservice .
4. Run this command line to deploy application
    docker run -p 3000:3000 weatherservice

III. How to test:
Use a tool to make a REST request such as Postman
Make a POST request to url:  http://localhost:3000/weather
Configure body request with json format: 
{
   "city": "New York", "state":"NY"
}

Happy Testing!