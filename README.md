# [Airline Flights Challenge] [ ![Codeship Status for fabiosjc/flights](https://app.codeship.com/projects/3f83de50-6a7c-0135-3a2e-7e5894024dec/status?branch=master)](https://app.codeship.com/projects/241945)

Application developed in Angular, Java 8 and Spring-boot to display flight data of different airlines.
   - it must be possible to filter the data through the search field.
   - it should be possible to view details of the selected flight

## Requirements
- Java 8 installed locally
- Maven 3 installed locally
- NPM

## Instructions

1. Run `mvn spring-boot:run`
2. Open a new terminal and run `npm i` to install front-end dependencies
3. Application address: http://localhost:8080

## Demo

http://flights-challenge.herokuapp.com/

## Public API

- http://flights-challenge.herokuapp.com/api/flights
- http://flights-challenge.herokuapp.com/api/flights/1
- http://flights-challenge.herokuapp.com/api/flights/airline/tam
- http://flights-challenge.herokuapp.com/api/flights/airline/azul

## API Documentation

- Open http://flights-challenge.herokuapp.com/swagger-ui.html and click on `List Operations` link
