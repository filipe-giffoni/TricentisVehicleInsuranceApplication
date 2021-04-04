Feature: Motorcycle Insurance Application

  Background: Launch the browser on Tricentis' Vehicle Insurance Application page
    Given the website is loaded

  Scenario Outline: Send Insurance Application by email
    When I click on Motorcycle
    And I fill out the Vehicle Data with "<make>", "<model>", "<cylCap>", "<engPerf>", "<manDate>", "<numSeats>", "<listPrice>", "<annMileage>"
    And I fill out Insurant Data with "<fName>", "<lName>", "<birth>", "<gender>", "<addr>", "<country>", "<zipCode>", "<city>", "<occup>", "<speed>", "<bungeejump>", "<cliffDiv>", "<skydiv>", "<other>", "<website>"
    And I fill out Product Data with "<startDate>", "<insurSum>", "<dmgInsur>", "<euroProt>", "<legalDef>"
    And I select "<priceOpt>" Price Option
    And I fill out Quote with "<email>", "<phone>", "<user>", "<password>", "<comments>"
    Then the message "Sending e-mail success!" is displayed

    Examples: 
      | make   | engPerf | model | cylCap | manDate    | numSeats | listPrice | annMileage | fName | lName  | birth      | gender | addr          | country        | zipCode  | city       | occup    | speed | bungeejump | cliffDiv | skydiv | other | website                | startDate  | insurSum     | dmgInsur         | euroProt | legalDef | priceOpt | email                 | phone     | user         | password | comments  |
      | Suzuki |     250 | Moped |     50 | 09/25/2020 |        2 |     45500 |      20000 | Karen | Miller | 05/09/1990 | Female | 66 Red Street | United Kingdom | 58601364 | Manchester | Employee | true  | false      | false    | false  | false | http://karenmiller.com | 06/22/2021 | 5.000.000,00 | Partial Coverage | true     | true     | Silver   | karen.miller@test.com | 284920394 | karen.miller | P4ssw0rd | Some text |