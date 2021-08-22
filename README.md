# code-assignment
Singtel Coding Assignment
--------------------------

Pre-requisites to build the project
------------------------------------
1. Jdk 1.8 +
2. Maven 
3. Spring boot
4. git
5. Junit 4.13.1
------------------------
Project Details
---------------------
Assignment : Object Modelling for Animal

solution:
-attached class daigram for assignment.
-Test cases under test folder for each problem
-Section A Test cases ChickenTest, DuckTest, ParrotTest are passed
-Section B Test cases ClownFishTest, DolphinTest, SharkTest are passed
-Section C Test cases ButterflyTests are passed
- PrintSolution stand lone class display the result for each mentioned questions results     in assignment pdf.
- Rest Web service Implemented for display the all animals
  --Get Rest url: localhost:8080/getAnimals
  Response JSON:
  [
      {
          "male": false,
          "size": null,
          "color": null,
          "languageCode": null,
          "name": "BIRD"
      },
      {
          "male": false,
          "size": null,
          "color": null,
          "languageCode": null,
          "name": null
      },
      {
          "male": false,
          "size": null,
          "color": null,
          "languageCode": null,
          "name": "CHICKEN"
      },
      null,
      {
          "male": false,
          "size": "LARGE",
          "color": "GREY",
          "languageCode": null,
          "name": "SHARK"
      },
      {
          "male": false,
          "size": "SMALL",
          "color": "ORANGE",
          "languageCode": null,
          "name": "CLOWN_FISH"
      },
      {
          "male": false,
          "size": null,
          "color": null,
          "languageCode": null,
          "name": "DOLPHIN"
      },
      {
          "male": false,
          "size": null,
          "color": null,
          "languageCode": null,
          "name": null,
          "state": "CATERPILLAR",
          "currentState": {
              "male": false,
              "size": null,
              "color": null,
              "languageCode": null,
              "name": null,
              "state": null,
              "currentState": null
          }
      },
      {
          "male": true,
          "size": null,
          "color": null,
          "languageCode": "Danish",
          "name": "ROOSTER"
      }
  ]
