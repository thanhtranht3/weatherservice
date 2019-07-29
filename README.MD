I. Summary:
This spring boot application provides a rest api for receiving a pair of city and state as json format
it delegates to zipcodeapi to get the list of zipcode by city and state,
then it calls the openweathermap api return current and  weather

II. How to run this project:
Open cmd from the folder of project: 
1. Run this command line to build application 
    docker build -f Dockerfile -t weatherservice .
2. Run this command line to deploy application
    docker run -p 3000:3000 weatherservice

III. How to test:
Use a tool to make a REST request such as Postman
Make a POST request to url:  http://localhost:3000/weather
Configure body request with json format: 
{
   "city": "New York", "state":"NY"
}

Happy Testing!