Feature: Camper Insurance Application

  Background: Launch the browser on Tricentis' Vehicle Insurance Application page
    Given the website is loaded

  Scenario Outline: Send Insurance Application by email
    When I click on Camper
    And I fill out Vehicle Data with "<make>", "<engPerf>", "<manDate>", "<numSeats>", "<rHandDrive>", "<fuelType>", "<payload>", "<totWeight>", "<listPrice>", "<licenPlate>", "<annMileage>"
    And I fill out Insurant Data with "<fName>", "<lName>", "<birth>", "<gender>", "<addr>", "<country>", "<zipCode>", "<city>", "<occup>", "<speed>", "<bungeejump>", "<cliffDiv>", "<skydiv>", "<other>", "<website>"
    And I fill out Product Data with "<startDate>", "<insurSum>", "<dmgInsur>", "<euroProt>", "<legalDef>"
    And I select "<priceOpt>" Price Option
    And I fill out Quote with "<email>", "<phone>", "<user>", "<password>", "<comments>"
    Then the message "Sending e-mail success!" is displayed

    Examples:
      | make    | engPerf  | manDate    | numSeats  | rHandDrive  | fuelType  | payload | totWeight | listPrice | licenPlate  | annMileage | fName      | lName       | birth       | gender  | addr              | country           | zipCode    | city          | occup         | speed  | bungeejump | cliffDiv | skydiv | other | website                     | startDate     | insurSum        | dmgInsur     | euroProt  | legalDef  | priceOpt    | email                     | phone        | user             | password    | comments    |
      | Ford    | 750      | 10/13/2020 | 7         | No          | Gas       | 400     | 1000      | 83000     | 4UY092      | 20000      | Jordan     | Reeves      | 06/30/1975  | Male    | 37 Green Street   | United States     | 63951023   | Denver        | Unemployed    | true   | true       | true     | false  | false | http://jordanreeves.com     | 06/16/2021    | 20.000.000,00   | No Coverage  | false     | true      | Gold        | jordan.reeves@test.com    | 481735066    | jordan.reeves    | P4ssw0rd    | Some text   |