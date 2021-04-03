Feature: Automobile Insurance Application

  Background: Launch the browser on Tricentis Vehicle Insurance Application page
    Given the website is loaded

  Scenario Outline: Send Insurance Application by email
    When I click on Automobile
    And I fill out Vehicle Data with "<make>", "<engPerf>", "<manDate>", "<numSeats>", "<fuelType>", "<listPrice>", "<licenPlate>", "<annMileage>"
    And I fill out Insurant Data with "<fName>", "<lName>", "<birth>", "<gender>", "<addr>", "<country>", "<zipCode>", "<city>", "<occup>", "<speed>", "<bungeejump>", "<cliffDiv>", "<skydiv>", "<other>", "<website>"
    And I fill out Product Data with "<startDate>", "<insurSum>", "<meritRat>", "<dmgInsur>", "<euroProt>", "<legalDef>", "<courtCar>"
    And I select "<priceOpt>" Price Option
    And I fill out Quote with "<email>", "<phone>", "<user>", "<password>", "<comments>"
    Then the message "Sending e-mail success!" is displayed

    Examples:
      | make    | engPerf  | manDate    | numSeats  | fuelType        | listPrice | licenPlate | annMileage | fName    | lName    | birth       | gender  | addr                | country          | zipCode   | city       | occup             | speed  | bungeejump | cliffDiv | skydiv | other | website                | startDate   | insurSum        | meritRat    | dmgInsur        | euroProt  | legalDef  | courtCar | priceOpt   | email                 | phone        | user         | password  | comments    |
      | BMW     | 500      | 12/05/2020 | 5         | Electric Power  | 67500     | 8H2M90     | 20000      | Jane     | Smith    | 03/21/1983  | Female  | 29 Anywhere Street  | United Kingdom   | 87348923  | London     | Public Official   | true   | false      | false    | true   | false | http://janesmith.com   | 06/10/2021  | 10.000.000,00   | Bonus 9     | Full Coverage   | true      | false     | Yes      | Ultimate   | jane.smith@test.com   | 123456789    | john.smith   | P4ssw0rd  | Some text   |