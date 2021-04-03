Feature: Truck Insurance Application

  Background: Launch the browser on Tricentis' Vehicle Insurance Application page
    Given the website is loaded

  Scenario Outline: Send Insurance Application by email
    When I click on Truck
    And I fill out Vehicle Data with "<make>", "<engPerf>", "<manDate>", "<numSeats>", "<fuelType>", "<payload>", "<totWeight>", "<listPrice>", "<licenPlate>", "<annMileage>"
    And I fill out Insurant Data with "<fName>", "<lName>", "<birth>", "<gender>", "<addr>", "<country>", "<zipCode>", "<city>", "<occup>", "<speed>", "<bungeejump>", "<cliffDiv>", "<skydiv>", "<other>", "<website>"
    And I fill out Product Data with "<startDate>", "<insurSum>", "<dmgInsur>", "<euroProt>", "<legalDef>"
    And I select "<priceOpt>" Price Option
    And I fill out Quote with "<email>", "<phone>", "<user>", "<password>", "<comments>"
    Then the message "Sending e-mail success!" is displayed

    Examples:
      | make    | engPerf  | manDate      | numSeats  | fuelType      | payload   | totWeight | listPrice | licenPlate  | annMileage | fName    | lName     | birth       | gender  | addr              | country         | zipCode   | city          | occup         | speed  | bungeejump | cliffDiv | skydiv | other | website                   | startDate   | insurSum        | dmgInsur        | euroProt  | legalDef  | priceOpt  | email                   | phone     | user          | password  | comments    |
      | Volvo   | 1000     | 11/21/2020   | 2         | Diesel        | 1000      | 2000      | 97000     | 3F9J46      | 40000      | Bill     | Norris    | 07/01/1973  | Male    | 86 Some Street    | United States   | 29650135  | Kansas City   | Selfemployed  | false  | true       | true     | false  | true  | http://billnorris.com     | 06/27/2021  | 30.000.000,00   | Full Coverage   | false     | true      | Platinum  | bill.norris@test.com    | 936184025 | bill.norris   | P4ssw0rd  | Some text   |